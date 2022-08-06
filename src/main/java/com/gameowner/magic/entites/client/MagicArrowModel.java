package com.gameowner.magic.entites.client;

import com.gameowner.magic.Magic;
import com.gameowner.magic.entites.custom.MagicArrowEntity;
import com.gameowner.magic.item.custom.MagicWand;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MagicArrowModel extends AnimatedGeoModel<MagicArrowEntity> {

    @Override
    public ResourceLocation getModelResource(MagicArrowEntity object) {
        System.out.println("MODEL");
        return new ResourceLocation(Magic.MOD_ID, "geo/magic_arrow.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MagicArrowEntity object) {
        return new ResourceLocation(Magic.MOD_ID, "textures/item/magic_wand.png");
    }

    @Override
    public ResourceLocation getAnimationResource(MagicArrowEntity animatable) {
        return new ResourceLocation(Magic.MOD_ID, "animations/magic_arrow.animation.json");
    }
}
