package net.hazen.hazennstuff.sound;

import net.hazen.hazennstuff.HazenNStuff;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, HazenNStuff.MODID);

    public static final Supplier<SoundEvent> OMINOUS_EQUIP1 = registerSoundEvent("ominous_equip1");
    public static final Supplier<SoundEvent> OMINOUS_EQUIP2 = registerSoundEvent("ominous_equip2");
    public static final Supplier<SoundEvent> OMINOUS_EQUIP3 = registerSoundEvent("ominous_equip3");
    public static final Supplier<SoundEvent> OMINOUS_EQUIP4 = registerSoundEvent("ominous_equip4");

    private static Supplier<SoundEvent> registerSoundEvent(String name) {
        ResourceLocation id = ResourceLocation.fromNamespaceAndPath(HazenNStuff.MODID, name);
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(id));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
