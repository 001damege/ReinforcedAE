package reinforcedae.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;
import reinforcedae.ReinforcedAE;
import reinforcedae.definition.RAECreativeTab;

import static reinforcedae.definition.RAEItems.*;
import static reinforcedae.integration.appbot.AppBotItems.*;
import static reinforcedae.integration.appmek.AppMekItems.REINFORCED_CHEMICAL_CELL_HOUSING;
import static reinforcedae.integration.arseng.ArsEngItems.REINFORCED_SOURCE_CELL_HOUSING;

public class LangGen {

    protected static void register(boolean run, DataGenerator generator) {
        generator.addProvider(run, (DataProvider.Factory<EnUs>) EnUs::new);
        generator.addProvider(run, (DataProvider.Factory<JaJp>) JaJp::new);
    }

    private static class EnUs extends LanguageProvider {
        public EnUs(PackOutput output) {
            super(output, ReinforcedAE.MODID, "en_us");
        }

        @Override
        protected void addTranslations() {
            add(RAECreativeTab.TAB_ID, "Reinforced AE");
            addItem(CELL_COMPONENT_10G, "10G ME Storage Component");
            addItem(CELL_COMPONENT_40G, "40G ME Storage Component");
            addItem(CELL_COMPONENT_163G, "163G ME Storage Component");
            addItem(CELL_COMPONENT_655G, "655G ME Storage Component");
            addItem(CELL_COMPONENT_2621G, "2621G ME Storage Component");
            addItem(CELL_COMPONENT_1T, "1T ME Storage Component");
            addItem(CELL_COMPONENT_4T, "4T ME Storage Component");
            addItem(CELL_COMPONENT_16T, "16T ME Storage Component");
            addItem(CELL_COMPONENT_67T, "67T ME Storage Component");
            addItem(CELL_COMPONENT_268T, "268T ME Storage Component");
            addItem(CELL_COMPONENT_1P, "1P ME Storage Component");
            addItem(CELL_COMPONENT_4P, "4P ME Storage Component");
            addItem(CELL_COMPONENT_16P, "16P ME Storage Component");
            addItem(CELL_COMPONENT_67P, "67P ME Storage Component");
            addItem(CELL_COMPONENT_268P, "268P ME Storage Component");
            addItem(CELL_COMPONENT_1099P, "1099P ME Storage Component");
            addItem(CELL_COMPONENT_4398P, "4298P ME Storage Component");
            addItem(REINFORCED_ITEM_CELL_HOUSING, "Reinforced Item Cell Housing");
            addItem(REINFORCED_FLUID_CELL_HOUSING, "Reinforced Fluid Cell Housing");
            addItem(COMPRESSED_ENERGY_CARD, "Compressed Energy Card");
            addItem(COMPRESSED_SPEED_CARD, "Compressed Accelerator Card");
            addItem(REINFORCED_MANA_CELL_HOUSING, "Reinforced Mana Cell Housing");
            addItem(REINFORCED_CHEMICAL_CELL_HOUSING, "Reinforced Chemical Cell Housing");
            addItem(REINFORCED_SOURCE_CELL_HOUSING, "Reinforced Source Cell Housing");
        }
    }

    private static class JaJp extends LanguageProvider {
        public JaJp(PackOutput output) {
            super(output, ReinforcedAE.MODID, "ja_jp");
        }

        @Override
        protected void addTranslations() {
            add(RAECreativeTab.TAB_ID, "Reinforced AE");
            addItem(CELL_COMPONENT_10G, "10G MEストレージコンポーネント");
            addItem(CELL_COMPONENT_40G, "40G MEストレージコンポーネント");
            addItem(CELL_COMPONENT_163G, "163G MEストレージコンポーネント");
            addItem(CELL_COMPONENT_655G, "655G MEストレージコンポーネント");
            addItem(CELL_COMPONENT_2621G, "2621G MEストレージコンポーネント");
            addItem(CELL_COMPONENT_1T, "1T MEストレージコンポーネント");
            addItem(CELL_COMPONENT_4T, "4T MEストレージコンポーネント");
            addItem(CELL_COMPONENT_16T, "16T MEストレージコンポーネント");
            addItem(CELL_COMPONENT_67T, "67T MEストレージコンポーネント");
            addItem(CELL_COMPONENT_268T, "268T MEストレージコンポーネント");
            addItem(CELL_COMPONENT_1P, "1P MEストレージコンポーネント");
            addItem(CELL_COMPONENT_4P, "4P MEストレージコンポーネント");
            addItem(CELL_COMPONENT_16P, "16P MEストレージコンポーネント");
            addItem(CELL_COMPONENT_67P, "67P MEストレージコンポーネント");
            addItem(CELL_COMPONENT_268P, "268P MEストレージコンポーネント");
            addItem(CELL_COMPONENT_1099P, "1099P MEストレージコンポーネント");
            addItem(CELL_COMPONENT_4398P, "4298P MEストレージコンポーネント");
            addItem(REINFORCED_ITEM_CELL_HOUSING, "強化されたMEアイテムセル筐体");
            addItem(REINFORCED_FLUID_CELL_HOUSING, "強化されたME液体セル筐体");
            addItem(COMPRESSED_ENERGY_CARD, "圧縮エナジーカード");
            addItem(COMPRESSED_SPEED_CARD, "圧縮加速カード");
            addItem(REINFORCED_MANA_CELL_HOUSING, "強化されたMEマナセル筐体");
            addItem(REINFORCED_CHEMICAL_CELL_HOUSING, "強化されたMEガスセル筐体");
            addItem(REINFORCED_SOURCE_CELL_HOUSING, "強化されたMEソースセル筐体");
        }
    }
}
