package reinforcedae.definition;

import appeng.api.upgrades.Upgrades;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import reinforcedae.ReinforcedAE;
import reinforcedae.items.materials.StorageComponentItem;

@SuppressWarnings("unused")
public final class RAEItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ReinforcedAE.MODID);

    public static final RegistryObject<Item> TEST_ITEM = ITEMS.register("test_item", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CELL_COMPONENT_10G = ITEMS.register("cell_component_10g", () -> new StorageComponentItem(p(), 1024.0)); // 10億
    public static final RegistryObject<Item> CELL_COMPONENT_40G = ITEMS.register("cell_component_40g", () -> new StorageComponentItem(p(), 4096.0)); // 40億
    public static final RegistryObject<Item> CELL_COMPONENT_163G = ITEMS.register("cell_component_163g", () -> new StorageComponentItem(p(), 16384.0)); // 163億
    public static final RegistryObject<Item> CELL_COMPONENT_655G = ITEMS.register("cell_component_655g", () -> new StorageComponentItem(p(), 65536.0)); // 655億
    public static final RegistryObject<Item> CELL_COMPONENT_2621G = ITEMS.register("cell_component_2621g", () -> new StorageComponentItem(p(), 262144.0)); // 2621億
    public static final RegistryObject<Item> CELL_COMPONENT_1T = ITEMS.register("cell_component_1t", () -> new StorageComponentItem(p(), 1048576.0)); // 1兆
    public static final RegistryObject<Item> CELL_COMPONENT_4T = ITEMS.register("cell_component_4t", () -> new StorageComponentItem(p(), 4194304.0)); // 4兆
    public static final RegistryObject<Item> CELL_COMPONENT_16T = ITEMS.register("cell_component_16t", () -> new StorageComponentItem(p(), 16777216.0)); // 16兆
    public static final RegistryObject<Item> CELL_COMPONENT_67T = ITEMS.register("cell_component_67t", () -> new StorageComponentItem(p(), 67108864.0)); // 67兆
    public static final RegistryObject<Item> CELL_COMPONENT_268T = ITEMS.register("cell_component_268t", () -> new StorageComponentItem(p(), 268435456.0)); // 268兆
    public static final RegistryObject<Item> CELL_COMPONENT_1P = ITEMS.register("cell_component_1p", () -> new StorageComponentItem(p(), 1073741824.0)); // 1073兆
    public static final RegistryObject<Item> CELL_COMPONENT_4P = ITEMS.register("cell_component_4p", () -> new StorageComponentItem(p(), 4294967296.0)); // 4294兆
    public static final RegistryObject<Item> CELL_COMPONENT_16P = ITEMS.register("cell_component_16p", () -> new StorageComponentItem(p(), 17179869184.0)); // 171兆
    public static final RegistryObject<Item> CELL_COMPONENT_67P = ITEMS.register("cell_component_67p", () -> new StorageComponentItem(p(), 68719476736.0)); // 687兆
    public static final RegistryObject<Item> CELL_COMPONENT_268P = ITEMS.register("cell_component_268p", () -> new StorageComponentItem(p(), 274877906944.0)); // 2748兆
    public static final RegistryObject<Item> CELL_COMPONENT_1099P = ITEMS.register("cell_component_1099p", () -> new StorageComponentItem(p(), 1099511627776.0)); // 1京
    public static final RegistryObject<Item> CELL_COMPONENT_4398P = ITEMS.register("cell_component_4398p", () -> new StorageComponentItem(p(), 4398046511104.0)); // 4京

    public static final RegistryObject<Item> REINFORCED_ITEM_CELL_HOUSING = ITEMS.register("reinforced_item_cell_housing", () -> new Item(p().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> REINFORCED_FLUID_CELL_HOUSING = ITEMS.register("reinforced_fluid_cell_housing", () -> new Item(p().rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> COMPRESSED_ENERGY_CARD = ITEMS.register("compressed_energy_card", () -> Upgrades.createUpgradeCardItem(p().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> COMPRESSED_SPEED_CARD = ITEMS.register("compressed_accelerator_card", () -> Upgrades.createUpgradeCardItem(p().rarity(Rarity.EPIC)));

    public static void initialize(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
    }

    private static Item.Properties p() {
        return new Item.Properties();
    }
}
