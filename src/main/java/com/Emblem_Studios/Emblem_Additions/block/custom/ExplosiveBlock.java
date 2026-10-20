package com.Emblem_Studios.Emblem_Additions.block.custom;

import com.Emblem_Studios.Emblem_Additions.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.stats.Stats;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.ExplosionDamageCalculator;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FireBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;

import javax.annotation.Nullable;
import java.util.Optional;

public class ExplosiveBlock extends Block {

    public ExplosiveBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected void onPlace(BlockState pState, Level pLevel, BlockPos pPos, BlockState pOldState, boolean pIsMoving) {
        if (!pOldState.is(pState.getBlock())) {
            if (pLevel.hasNeighborSignal(pPos)) {
                onCaughtFire(pState, pLevel, pPos, null, null);
                pLevel.removeBlock(pPos, false);
            }
        }
    }

    @Override
    public void wasExploded(Level pLevel, BlockPos pos, Explosion pExplosion) {
        pLevel.removeBlock(pos, false);
        boolean flag = Direction.Plane.HORIZONTAL.stream().map(pos::relative).anyMatch(waterThatWouldFlow -> isWaterThatWouldFlow(waterThatWouldFlow, pLevel));
        final boolean flag1 = flag || pLevel.getFluidState(pos.above()).is(FluidTags.WATER);
        ExplosionDamageCalculator explosiondamagecalculator = new ExplosionDamageCalculator() {
            @Override
            public Optional<Float> getBlockExplosionResistance(Explosion explosion, BlockGetter blockGetter, BlockPos blockPos, BlockState blockState, FluidState fluidState) {
                return blockPos.equals(pos) && flag1
                        ? Optional.of(Blocks.WATER.getExplosionResistance())
                        : super.getBlockExplosionResistance(explosion, blockGetter, blockPos, blockState, fluidState);
            }
        };
        Vec3 vec3 = pos.getCenter();
        pLevel.explode(null, pLevel.damageSources().explosion(pExplosion), explosiondamagecalculator, vec3, 2.5F, false, Level.ExplosionInteraction.TNT);
    }

    private static boolean isWaterThatWouldFlow(BlockPos pPos, Level pLevel) {
        FluidState fluidstate = pLevel.getFluidState(pPos);
        if (!fluidstate.is(FluidTags.WATER)) {
            return false;
        } else if (fluidstate.isSource()) {
            return true;
        } else {
            float f = (float)fluidstate.getAmount();
            if (f < 2.0F) {
                return false;
            } else {
                FluidState fluidstate1 = pLevel.getFluidState(pPos.below());
                return !fluidstate1.is(FluidTags.WATER);
            }
        }
    }

    @Override
    protected ItemInteractionResult useItemOn(
            ItemStack pStack, BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHitResult
    ) {
        if (!pStack.is(Items.FLINT_AND_STEEL) && !pStack.is(Items.FIRE_CHARGE)) {
            return super.useItemOn(pStack, pState, pLevel, pPos, pPlayer, pHand, pHitResult);
        } else {
            onCaughtFire(pState, pLevel, pPos, pHitResult.getDirection(), pPlayer);
            pLevel.setBlock(pPos, Blocks.AIR.defaultBlockState(), 11);
            Item item = pStack.getItem();
            if (pStack.is(Items.FLINT_AND_STEEL)) {
                pStack.hurtAndBreak(1, pPlayer, LivingEntity.getSlotForHand(pHand));
            } else {
                pStack.consume(1, pPlayer);
            }

            pPlayer.awardStat(Stats.ITEM_USED.get(item));
            return ItemInteractionResult.sidedSuccess(pLevel.isClientSide);
        }
    }

    @Override
    protected void onProjectileHit(Level pLevel, BlockState pState, BlockHitResult pHit, Projectile pProjectile) {
        if (!pLevel.isClientSide) {
            BlockPos blockpos = pHit.getBlockPos();
            Entity entity = pProjectile.getOwner();
            if (pProjectile.isOnFire() && pProjectile.mayInteract(pLevel, blockpos)) {
                onCaughtFire(pState, pLevel, blockpos, null, entity instanceof LivingEntity ? (LivingEntity)entity : null);
                pLevel.removeBlock(blockpos, false);
            }
        }
    }

    @Override
    public boolean dropFromExplosion(Explosion pExplosion) {
        return false;
    }

    public void onCaughtFire(BlockState state, Level pLevel, BlockPos pos, @Nullable Direction face, @Nullable LivingEntity igniter) {
        pLevel.removeBlock(pos, false);
        boolean flag = Direction.Plane.HORIZONTAL.stream().map(pos::relative).anyMatch(waterThatWouldFlow -> isWaterThatWouldFlow(waterThatWouldFlow, pLevel));
        final boolean flag1 = flag || pLevel.getFluidState(pos.above()).is(FluidTags.WATER);
        ExplosionDamageCalculator explosiondamagecalculator = new ExplosionDamageCalculator() {
            @Override
            public Optional<Float> getBlockExplosionResistance(Explosion explosion, BlockGetter blockGetter, BlockPos blockPos, BlockState blockState, FluidState fluidState) {
                return blockPos.equals(pos) && flag1
                        ? Optional.of(Blocks.WATER.getExplosionResistance())
                        : super.getBlockExplosionResistance(explosion, blockGetter, blockPos, blockState, fluidState);
            }
        };
        Vec3 vec3 = pos.getCenter();
        pLevel.explode(null, pLevel.damageSources().explosion(igniter, null), explosiondamagecalculator, vec3, 3.5F, false, Level.ExplosionInteraction.TNT);
    }

    public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        FireBlock fireblock = (FireBlock) Blocks.FIRE;
        fireblock.setFlammable(ModBlocks.GUNPOWDER_BLOCK.get(), 30, 100);
        return 100;
    }
}
