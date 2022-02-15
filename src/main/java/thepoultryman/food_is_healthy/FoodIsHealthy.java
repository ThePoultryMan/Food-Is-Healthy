package thepoultryman.food_is_healthy;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FoodIsHealthy implements ModInitializer {
	public static final String MOD_ID = "food_is_healthy";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing, I mean baking, fresh baked Food (Is Healthy)");
	}
}
