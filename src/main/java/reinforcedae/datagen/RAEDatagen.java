package reinforcedae.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import reinforcedae.ReinforcedAE;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = ReinforcedAE.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class RAEDatagen {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        boolean isServer = event.includeServer();
        boolean isClient = event.includeClient();

        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        ExistingFileHelper efh = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookup = event.getLookupProvider();

        LangGen.register(isClient, generator);
    }
}
