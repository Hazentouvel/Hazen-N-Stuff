package net.hazen.hazennstuff.item;

import net.hazen.hazennstuff.HazenNStuff;
import net.minecraft.client.tutorial.Tutorial;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HazenNStuff.MODID);

    public static final Supplier<CreativeModeTab> SORCERERS_EQUIPMENT_TAB = CREATIVE_MODE_TAB.register("sorcerers_equipment_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.OMINOUSHAT.get()))
                    .title(Component.translatable("creativetab.hazennstuff.sorcerers_equipment"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.OMINOUSHAT);
                        output.accept(ModItems.OMINOUSBREASTPLATE);
                        output.accept(ModItems.OMINOUSLEGGINGS);
                        output.accept(ModItems.OMINOUSBOOTS);
                    }).build());

    public static final Supplier<CreativeModeTab> SORCERERS_INGREDIENTS_TAB = CREATIVE_MODE_TAB.register("sorcerers_ingredients_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.OMINOUSALLOY.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(HazenNStuff.MODID, "sorcerers_equipment_tab"))
                    .title(Component.translatable("creativetab.hazennstuff.sorcerers_ingredients"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.OMINOUSALLOY);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
