package net.hazen.hazennstuff.item;

import net.hazen.hazennstuff.HazenNStuff;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(HazenNStuff.MODID);

    /*public static final DeferredItem<Item> OMINOUSHAT = ITEMS.register("ominous_hat",
            () -> new Item(new ArmorItem(ModArmorMaterials.OMINOUS_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(19)))));
    public static final DeferredItem<Item> OMINOUSBREASTPLATE = ITEMS.register("ominous_breastplate",
            () -> new Item(new ArmorItem(ModArmorMaterials.OMINOUS_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(19)))));
    public static final DeferredItem<Item> OMINOUSLEGGINGS = ITEMS.register("ominous_leggings",
            () -> new Item(new ArmorItem(ModArmorMaterials.OMINOUS_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(19)))));
    public static final DeferredItem<Item> OMINOUSBOOTS = ITEMS.register("ominous_boots",
            () -> new Item(new ArmorItem(ModArmorMaterials.OMINOUS_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(19)))));*/


    public static final DeferredItem<Item> OMINOUSALLOY = ITEMS.register("ominous_alloy",
            () -> new Item(new Item.Properties()));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
