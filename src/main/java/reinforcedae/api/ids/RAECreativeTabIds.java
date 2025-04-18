package reinforcedae.api.ids;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import reinforcedae.ReinforcedAE;

@SuppressWarnings("unused")
public class RAECreativeTabIds {
    private RAECreativeTabIds() {}

    public static final ResourceKey<CreativeModeTab> MAIN = create("main");

    private static ResourceKey<CreativeModeTab> create(String path) {
        return ResourceKey.create(Registries.CREATIVE_MODE_TAB, ReinforcedAE.makeId(path));
    }
}
