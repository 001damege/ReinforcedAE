package reinforcedae.api.ids;

import net.minecraft.resources.ResourceLocation;
import reinforcedae.ReinforcedAE;

@SuppressWarnings("unused")
public class RAEBlockIds {

    public static final ResourceLocation COMPRESSED_INSCRIBER = id("compressed_inscriber");
    public static final ResourceLocation COMPRESSED_CHARGER = id("compressed_charger");
    public static final ResourceLocation COMPRESSED_CIRCUIT_CUTTER = id("compressed_circuit_cutter");
    public static final ResourceLocation COMPRESSED_IO_PORT = id("compressed_io_port");
    public static final ResourceLocation REINFORCED_CONTROLLER = id("reinforced_controller");
    public static final ResourceLocation REINFORCED_PATTERN_PROVIDER = id("reinforced_pattern_provider");
    public static final ResourceLocation REINFORCED_INTERFACE = id("reinforced_interface");
    public static final ResourceLocation REINFORCED_CONDENSER = id("reinforced_condenser");
    public static final ResourceLocation REINFORCED_GROWTH_ACCELERATOR = id("reinforced_growth_accelerator");
    public static final ResourceLocation REINFORCED_DRIVE = id("reinforced_drive");

    private static ResourceLocation id(String id) {
        return new ResourceLocation(ReinforcedAE.MODID, id);
    }
}
