package net.notes_plus;

import net.minecraft.state.property.EnumProperty;
import net.notes_plus.enums.nmi;

public class nmiProp {
    public static final EnumProperty<nmi> Instrumod;

    static {
        Instrumod = EnumProperty.of("nmi", nmi.class);

    }
}