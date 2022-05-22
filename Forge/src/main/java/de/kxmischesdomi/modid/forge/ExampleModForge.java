package de.kxmischesdomi.modid.forge;

import de.kxmischesdomi.examplemod.shared.ExampleModShared;
import net.minecraftforge.fml.common.Mod;

/**
 * @author KxmischesDomi | https://github.com/kxmischesdomi
 * @since 1.0
 */
@Mod("modid")
public class ExampleModForge {

	public ExampleModForge() {

		ExampleModShared.init();

	}
}
