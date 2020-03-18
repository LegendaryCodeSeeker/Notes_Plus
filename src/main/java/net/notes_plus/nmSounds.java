package net.notes_plus;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class nmSounds {

    public static final Identifier Missingnoteblock = new Identifier("notes_plus:thissoundisveryhardtotypebecauseidontwantyoutouseit");
    public static SoundEvent dont_use_this_sound_unless_you_are_testing_something_out = new SoundEvent(Missingnoteblock);




    public static void init() {
        Registry.register(Registry.SOUND_EVENT, nmSounds.Missingnoteblock, nmSounds.dont_use_this_sound_unless_you_are_testing_something_out);
    }
}