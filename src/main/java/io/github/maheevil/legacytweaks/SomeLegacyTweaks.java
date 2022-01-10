package io.github.maheevil.legacytweaks;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SomeLegacyTweaks
{
    public static final Logger LOGGER = LogManager.getLogger();

    public static void TellWitnessesThatIWasInitialized() {
        LOGGER.info("Initializing");
    }
}
