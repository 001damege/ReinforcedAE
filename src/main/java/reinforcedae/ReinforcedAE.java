package reinforcedae;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reinforcedae.core.Platform;

import java.util.ServiceLoader;

@Mod(ReinforcedAE.MODID)
public final class ReinforcedAE {

    public static final String MODID = "reinforcedae";
    public static final Logger LOGGER = LoggerFactory.getLogger("Reinforced AE");
    public static final Platform PLATFORM = ServiceLoader.load(Platform.class).findFirst().orElseThrow();

    public static ResourceLocation makeId(String path) {
        return new ResourceLocation(MODID, path);
    }

    public ReinforcedAE() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);
    }
}
