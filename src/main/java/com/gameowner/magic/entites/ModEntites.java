package com.gameowner.magic.entites;


import com.gameowner.magic.Magic;
import com.gameowner.magic.entites.custom.MagicArrowEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModEntites {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Magic.MOD_ID);

    public static final RegistryObject<EntityType<MagicArrowEntity>> MAGIC_ARROW =
            ENTITY_TYPES.register("magic_arrow",
                    () -> EntityType.Builder.<MagicArrowEntity>of(MagicArrowEntity::new,MobCategory.CREATURE)
                            .sized(0.8f, 0.6f)
                            .build(new ResourceLocation(Magic.MOD_ID, "magic_arrow").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }



}
