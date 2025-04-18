package reinforcedae.definition;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import reinforcedae.ReinforcedAE;

@SuppressWarnings("unused")
public final class RAEBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES_TYPE = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, ReinforcedAE.MODID);

    public static void initialize(IEventBus modEventBus) {
        BLOCK_ENTITIES_TYPE.register(modEventBus);
    }
}
