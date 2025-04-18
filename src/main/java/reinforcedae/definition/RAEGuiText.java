package reinforcedae.definition;

import appeng.core.localization.LocalizationEnum;
import net.minecraft.network.chat.Component;

import javax.annotation.Nullable;

public enum RAEGuiText implements LocalizationEnum {
    MODNAME("Reinforced AE"),
    ;

    private final String root;

    @Nullable
    private final String englishText;

    private final Component text;

    RAEGuiText(@Nullable String englishText) {
        this.root = "gui.reinforcedae";
        this.englishText = englishText;
        this.text = Component.translatable(getTranslationKey());
    }

    RAEGuiText(@Nullable String englishText, String r) {
        this.root = r;
        this.englishText = englishText;
        this.text = Component.translatable(getTranslationKey());
    }

    @Override
    public String getEnglishText() {
        return englishText;
    }

    @Override
    public String getTranslationKey() {
        return this.root + '.' + name();
    }

    public String getLocal() {
        return text.getString();
    }
}
