package com.gameowner.magic.item.client;


import com.gameowner.magic.item.custom.MagicWand;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class MagicWandRenderer extends GeoItemRenderer<MagicWand> {
    public MagicWandRenderer() {
        super(new MagicWandModel());
    }
}
