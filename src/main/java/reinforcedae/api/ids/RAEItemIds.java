package reinforcedae.api.ids;

import net.minecraft.resources.ResourceLocation;
import reinforcedae.ReinforcedAE;

@SuppressWarnings("unused")
public class RAEItemIds {

    public static final ResourceLocation COMPRESSED_SPEED_CARD = id("compressed_acceleration_card");
    public static final ResourceLocation COMPRESSED_ENERGY_CARD = id("compressed_energy_card");


    private static ResourceLocation id(String id) {
        return new ResourceLocation(ReinforcedAE.MODID, id);
    }
}
