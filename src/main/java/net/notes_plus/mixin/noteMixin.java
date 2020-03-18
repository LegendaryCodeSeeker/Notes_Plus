/*package net.notes_plus.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.Inject;
import net.minecraft.block.NoteBlock;
import net.minecraft.state.property.EnumProperty;
import net.notes_plus.enums.nmi;

@Mixin(NoteBlock.class)
public class noteMixin {
	@Unique
	public static final EnumProperty<nmi> Instrumod;
	@Inject(method = "static", at = @At("INVOKE"))
	Instrumod = nmiProp.Instrumod;
}*/



