package reinforcedae.definition;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import reinforcedae.ReinforcedAE;

import java.util.function.Supplier;

@SuppressWarnings("unused")
public final class RAEBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ReinforcedAE.MODID);

    public static final RegistryObject<Block> TEST_BLOCK = block("test_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));

    public static void initialize(IEventBus modEventBus) {
        BLOCKS.register(modEventBus);
    }

    private static <T extends Block> RegistryObject<T> block(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        blockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> blockItem(String name, RegistryObject<T> block) {
        return RAEItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
}
