package com.gameowner.magic.entites.custom;

import com.gameowner.magic.entites.ModEntites;
import com.gameowner.magic.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.targeting.TargetingConditions;
import net.minecraft.world.entity.animal.Cow;
import net.minecraft.world.entity.player.Player;

import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.Vec3;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

import javax.annotation.Nullable;
import java.util.List;
import java.util.function.Predicate;

public class MagicArrowEntity extends AbstractArrow implements IAnimatable {


    private AnimationFactory factory = new AnimationFactory(this);
    public MagicArrowEntity(EntityType<MagicArrowEntity> magicArrowEntityEntityType, Level level) {
        super(magicArrowEntityEntityType, level);
    }

    protected MagicArrowEntity(EntityType<MagicArrowEntity> p_36711_, double p_36712_, double p_36713_, double p_36714_, Level p_36715_) {
        super(p_36711_, p_36712_, p_36713_, p_36714_, p_36715_);
    }

    public MagicArrowEntity(EntityType<MagicArrowEntity> p_36717_, LivingEntity owner, Level p_36719_) {
        super(p_36717_, owner, p_36719_);
    }

    List<? extends LivingEntity> entities() {
        return null;
    }

    @Override
    public void tick() {
        System.out.println("TICK");

        LivingEntity entity = this.level.getNearestEntity(this.entities(),TargetingConditions.DEFAULT,null,this.getX(),this.getY(),this.getZ());
        if(entity != null){
            if (entity != this.getOwner()) {
                System.out.println("PLAYER" + entity.getDisplayName().getString());
                this.setDeltaMovement(entity.getDeltaMovement());
            }
        }
        super.tick();
    }

    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        event.getController().setAnimation(new AnimationBuilder().addAnimation("idle", true));
        return PlayState.CONTINUE;
    }

    @Override
    public void registerControllers(AnimationData data) {
        data.addAnimationController(new AnimationController(this, "controller",
                0, this::predicate));
    }

    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }

    @Override
    protected ItemStack getPickupItem() {
        return null;
    }
}