package com.gameowner.magic.item.client;


import com.gameowner.magic.Magic;
import com.gameowner.magic.item.custom.MagicWand;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;


public class MagicWandModel extends AnimatedGeoModel<MagicWand> {
    @Override
    public ResourceLocation getModelResource(MagicWand object) {
        return new ResourceLocation(Magic.MOD_ID, "geo/magic_wand.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MagicWand object) {
        return new ResourceLocation(Magic.MOD_ID, "textures/item/magic_wand.png");
    }

    @Override
    public ResourceLocation getAnimationResource(MagicWand animatable) {
        return new ResourceLocation(Magic.MOD_ID, "animations/magic_wand.animation.json");
    }
}
