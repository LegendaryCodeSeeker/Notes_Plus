package net.notes_plus;

import net.fabricmc.api.ModInitializer;

public class notemod implements ModInitializer{

@Override
	public void onInitialize() {
		nmSounds.init();
	}
}
