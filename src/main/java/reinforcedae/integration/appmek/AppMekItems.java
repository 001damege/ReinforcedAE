package reinforcedae.integration.appmek;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import reinforcedae.ReinforcedAE;

@SuppressWarnings("unused")
public final class AppMekItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ReinforcedAE.MODID);

    public static final RegistryObject<Item> REINFORCED_CHEMICAL_CELL_HOUSING = ITEMS.register("reinforced_chemical_cell_housing", () -> new Item(p().rarity(Rarity.EPIC)));

    public static void initialize(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
    }

    private static Item.Properties p() {
        return new Item.Properties();
    }
}
