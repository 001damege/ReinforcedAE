package reinforcedae.api.ids;

import appeng.api.util.AEColor;
import com.google.common.collect.ImmutableMap;
import net.minecraft.resources.ResourceLocation;
import reinforcedae.ReinforcedAE;

import javax.annotation.concurrent.Immutable;
import java.util.Map;

@SuppressWarnings("unused")
public class RAEPartIds {

    public static final ResourceLocation CABLE_WHITE = id("white_reinforced_smart_cable");
    public static final ResourceLocation CABLE_ORANGE = id("orange_reinforced_smart_cable");
    public static final ResourceLocation CABLE_MAGENTA = id("magenta_reinforced_smart_cable");
    public static final ResourceLocation CABLE_LIGHT_BLUE = id("light_blue_reinforced_smart_cable");
    public static final ResourceLocation CABLE_YELLOW = id("yellow_reinforced_smart_cable");
    public static final ResourceLocation CABLE_LIME = id("lime_reinforced_smart_cable");
    public static final ResourceLocation CABLE_PINK = id("pink_reinforced_smart_cable");
    public static final ResourceLocation CABLE_GRAY = id("gray_reinforced_smart_cable");
    public static final ResourceLocation CABLE_LIGHT_GRAY = id("light_gray_reinforced_smart_cable");
    public static final ResourceLocation CABLE_BROWN = id("brown_reinforced_smart_cable");
    public static final ResourceLocation CABLE_GREEN = id("green_reinforced_smart_cable");
    public static final ResourceLocation CABLE_RED = id("red_reinforced_smart_cable");
    public static final ResourceLocation CABLE_BLACK = id("black_reinforced_smart_cable");
    public static final ResourceLocation CABLE_FLUIX = id("fluix_reinforced_smart_cable");
    public static final Map<AEColor, ResourceLocation> CABLE_SMART = ImmutableMap.<AEColor, ResourceLocation>builder()
            .put(AEColor.WHITE, CABLE_WHITE)
            .put(AEColor.ORANGE, CABLE_ORANGE)
            .put(AEColor.MAGENTA, CABLE_MAGENTA)
            .put(AEColor.LIGHT_BLUE, CABLE_LIGHT_BLUE)
            .put(AEColor.YELLOW, CABLE_YELLOW)
            .put(AEColor.LIME, CABLE_LIME)
            .put(AEColor.PINK, CABLE_PINK)
            .put(AEColor.GRAY, CABLE_GRAY)
            .put(AEColor.LIGHT_GRAY, CABLE_LIGHT_GRAY)
            .put(AEColor.BROWN, CABLE_BROWN)
            .put(AEColor.GREEN, CABLE_GREEN)
            .put(AEColor.RED, CABLE_RED)
            .put(AEColor.BLACK, CABLE_BLACK)
            .put(AEColor.TRANSPARENT, CABLE_FLUIX)
            .build();

    public static final ResourceLocation REINFORCED_IMPORT_BUS = id("reinforced_import_bus");
    public static final ResourceLocation REINFORCED_EXPORT_BUS = id("reinforced_export_bus");
    public static final ResourceLocation REINFORCED_PATTERN_PROVIDER = id("reinforced_pattern_provder");
    public static final ResourceLocation REINFORCED_INTERFACE = id("reinforced_interface");

    private static ResourceLocation id(String id) {
        return new ResourceLocation(ReinforcedAE.MODID, id);
    }
}
