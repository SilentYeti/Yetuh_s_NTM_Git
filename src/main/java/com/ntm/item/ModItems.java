package com.ntm.item;

import com.ntm.core.NTM;
import com.ntm.item.custom.StandardRevolver;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, NTM.MOD_ID);

public static final RegistryObject<Item> crystal_lapis = ITEMS.register("crystal_lapis",
        () -> new Item(new Item.Properties()));
public static final RegistryObject<Item> crystal_lead = ITEMS.register("crystal_lead",
        () -> new Item(new Item.Properties()));
public static final RegistryObject<Item> standard_revolver = ITEMS.register("standard_revolver",
        () -> new StandardRevolver(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }

}
