package com.gameowner.magic.entites.client;

import com.gameowner.magic.Magic;
import com.gameowner.magic.entites.custom.MagicArrowEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.renderers.geo.GeoProjectilesRenderer;

public class MagicArrowRenderer extends GeoProjectilesRenderer<MagicArrowEntity> {
    public MagicArrowRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new MagicArrowModel());
        this.shadowRadius = 0.3f;
        System.out.println("RENDERER");
    }

    @Override
    public ResourceLocation getTextureLocation(MagicArrowEntity instance) {
        return new ResourceLocation(Magic.MOD_ID, "textures/item/magic_wand.png");
    }
}
