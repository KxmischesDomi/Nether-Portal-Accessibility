package de.kxmischesdomi.modid.fabric;

import de.kxmischesdomi.modid.shared.ExampleModShared;
import net.fabricmc.api.ModInitializer;

/**
 * @author KxmischesDomi | https://github.com/kxmischesdomi
 * @since 1.0
 */
public class ExampleModFabric implements ModInitializer {

	@Override
	public void onInitialize() {
		ExampleModShared.init();
	}

}
