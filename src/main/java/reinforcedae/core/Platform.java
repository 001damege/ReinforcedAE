package reinforcedae.core;

import appeng.core.localization.GuiText;
import net.minecraft.world.item.CreativeModeTab;

public interface Platform {

    CreativeModeTab.Builder getCreativeTabBuilder();

    boolean isAddonLoaded(Addons addon);

    default void initItems() {

    }

    default void initUpgrades() {
        var storageCellGroup = GuiText.StorageCells.getTranslationKey();
        var portableCellGroup = GuiText.PortableCells.getTranslationKey();
        var interfaceGroup = GuiText.Interface.getTranslationKey();
    }
}
