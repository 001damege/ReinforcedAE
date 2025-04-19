package reinforcedae.definition;

import appeng.core.definitions.AEBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import reinforcedae.ReinforcedAE;
import reinforcedae.integration.appbot.AppBotItems;
import reinforcedae.integration.appmek.AppMekItems;
import reinforcedae.integration.arseng.ArsEngItems;

@SuppressWarnings("unused")
public final class RAECreativeTab {

    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ReinforcedAE.MODID);
    public static final String TAB_ID = "itemgroup." + ReinforcedAE.MODID + ".general";

    public static final RegistryObject<CreativeModeTab> CREATIVE_TAB = TABS.register("main",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable(TAB_ID))
                    .icon(() -> AEBlocks.INSCRIBER.stack(1))
                    .displayItems((params, output) -> {
                        for (var entry : RAEItems.ITEMS.getEntries()) {
                            output.accept(entry.get());
                        }
                        for (var entry : RAEBlocks.BLOCKS.getEntries()) {
                            output.accept(entry.get());
                        }
                        for (var entry : AppBotItems.ITEMS.getEntries()) {
                            output.accept(entry.get());
                        }
                        for (var entry : AppMekItems.ITEMS.getEntries()) {
                            output.accept(entry.get());
                        }
                        for (var entry : ArsEngItems.ITEMS.getEntries()) {
                            output.accept(entry.get());
                        }
                    })
                    .build());

    public static void initialize(IEventBus modEventBus) {
        TABS.register(modEventBus);
    }
}
