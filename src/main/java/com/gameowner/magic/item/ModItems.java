package com.gameowner.magic.item;

import com.gameowner.magic.Magic;

import com.gameowner.magic.creativemodetab.MagicUpdateCreativeModeTab;
import com.gameowner.magic.item.custom.MagicWand;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(
            ForgeRegistries.ITEMS,
            Magic.MOD_ID
    );


    // SWORDS :
    public static final RegistryObject<Item> MAGIC_WAND = ITEMS.register("magic_wand",
            () -> new MagicWand(new Item.Properties()
                    .tab(MagicUpdateCreativeModeTab.MagicUpdateCreativeModeTab)));



    // Helpers :
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }


}
