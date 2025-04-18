package reinforcedae.api.ids;

import net.minecraft.resources.ResourceLocation;
import reinforcedae.ReinforcedAE;

@SuppressWarnings("unused")
public class RAEPartIds {

    private static ResourceLocation id(String id) {
        return new ResourceLocation(ReinforcedAE.MODID, id);
    }
}
