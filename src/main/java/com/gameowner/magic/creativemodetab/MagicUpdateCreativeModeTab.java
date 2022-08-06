package com.gameowner.magic.creativemodetab;

import com.gameowner.magic.item.ModItems;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class MagicUpdateCreativeModeTab {

    public static final CreativeModeTab MagicUpdateCreativeModeTab = new CreativeModeTab("magicupdatecreativemodetab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MAGIC_WAND.get(),1);
        }
    };

}
