package net.notes_plus.enums;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.sound.SoundEvent;
import net.notes_plus.nmSounds;
import net.minecraft.util.StringIdentifiable;

public enum nmi implements StringIdentifiable {
    DeBugNote("DUTSULYATSO", nmSounds.dont_use_this_sound_unless_you_are_testing_something_out);
 
    private String name;
    private SoundEvent sound;
 
    private nmi(String name, SoundEvent sound) {
       this.name = name;
       this.sound = sound;
    }
 
    public String asString() {
       return this.name;
    }
 
    public SoundEvent getSound() {
       return this.sound;
    }
 
    public static nmi fromBlockState(final BlockState state) {
       final Block block = state.getBlock();
       if (block == Blocks.BARRIER) {
          return DeBugNote;
       } else {
          final Material material = state.getMaterial();
          return null;
       }
    }
 }