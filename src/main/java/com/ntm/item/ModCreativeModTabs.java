package com.ntm.item;

import com.ntm.core.NTM;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NTM.MOD_ID);

    public static final RegistryObject<CreativeModeTab> PARTS_TAB = CREATIVE_MODE_TABS.register("parts_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.crystal_lapis.get()))
                    .title(Component.translatable("creativetab.parts_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.crystal_lapis.get());
                        pOutput.accept(ModItems.crystal_lead.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> WEAPON_TAB = CREATIVE_MODE_TABS.register("weapon_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.standard_revolver.get()))
                    .title(Component.translatable("creativetab.weapon_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.standard_revolver.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
