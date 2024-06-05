package dev.kineticcat.complexhex;

import dev.kineticcat.complexhex.api.casting.iota.ComplexHexIotaTypes;
import dev.kineticcat.complexhex.casting.ComplexhexPatternRegistry;
import dev.kineticcat.complexhex.networking.ComplexhexNetworking;
import dev.kineticcat.complexhex.registry.ComplexhexItemRegistry;
import dev.kineticcat.complexhex.casting.arithmetic.ComplexHexArithmetic;
import net.minecraft.resources.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This is effectively the loading entrypoint for most of your code, at least
 * if you are using Architectury as intended.
 */
public class Complexhex {
    public static final String MOD_ID = "complexhex";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);


    public static void init() {
        LOGGER.info("Complex Hex says hello!");

        ComplexhexAbstractions.initPlatformSpecific();
        ComplexhexItemRegistry.init();
        ComplexHexIotaTypes.init();
        ComplexhexPatternRegistry.init();
		ComplexhexNetworking.init();
        ComplexHexArithmetic.init();

        LOGGER.info(ComplexhexAbstractions.getConfigDirectory().toAbsolutePath().normalize().toString());
    }

    /**
     * Shortcut for identifiers specific to this mod.
     */
    public static ResourceLocation id(String string) {
        return new ResourceLocation(MOD_ID, string);
    }
}