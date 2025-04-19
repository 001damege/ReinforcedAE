package reinforcedae.api.ids;

import net.minecraft.resources.ResourceLocation;
import reinforcedae.ReinforcedAE;

@SuppressWarnings("unused")
public class RAEItemIds {

    public static final ResourceLocation COMPONENT_10G = id("cell_component_10g");
    public static final ResourceLocation COMPONENT_40G = id("cell_component_40g");
    public static final ResourceLocation COMPONENT_163G = id("cell_component_163g");
    public static final ResourceLocation COMPONENT_655G = id("cell_component_655g");
    public static final ResourceLocation COMPONENT_2621G = id("cell_component_2621g");
    public static final ResourceLocation COMPONENT_1T = id("cell_component_1t");
    public static final ResourceLocation COMPONENT_4T = id("cell_component_4t");
    public static final ResourceLocation COMPONENT_16T = id("cell_component_16t");
    public static final ResourceLocation COMPONENT_67T = id("cell_component_67t");
    public static final ResourceLocation COMPONENT_268T = id("cell_component_268t");
    public static final ResourceLocation COMPONENT_1P = id("cell_component_1p");
    public static final ResourceLocation COMPONENT_4P = id("cell_component_4p");
    public static final ResourceLocation COMPONENT_16P = id("cell_component_16p");
    public static final ResourceLocation COMPONENT_67P = id("cell_component_67p");
    public static final ResourceLocation COMPONENT_268P = id("cell_component_268p");
    public static final ResourceLocation COMPONENT_1099P = id("cell_component_1099p");
    public static final ResourceLocation COMPONENT_4398P = id("cell_component_4398p");
    public static final ResourceLocation COMPRESSED_SPEED_CARD = id("compressed_acceleration_card");
    public static final ResourceLocation COMPRESSED_ENERGY_CARD = id("compressed_energy_card");
    public static final ResourceLocation ITEM_HOUSING = id("reinforced_item_cell_housing");
    public static final ResourceLocation FLUID_HOUSING = id("reinforced_fluid_cell_housing");
    public static final ResourceLocation CHEMICAL_HOUSING = id("reinforced_chemical_cell_housing");
    public static final ResourceLocation MANA_HOUSING = id("reinforced_mana_cell_housing");
    public static final ResourceLocation SOURCE_HOUSING = id("reinforced_source_cell_housing");


    private static ResourceLocation id(String id) {
        return new ResourceLocation(ReinforcedAE.MODID, id);
    }
}
