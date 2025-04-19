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
            addItem(CELL_COMPONENT_1024M, "1024M ME Storage Component");
            addItem(CELL_COMPONENT_4096M, "4096M ME Storage Component");
            addItem(CELL_COMPONENT_16384M, "16384M ME Storage Component");
            addItem(CELL_COMPONENT_65536M, "65536M ME Storage Component");
            addItem(CELL_COMPONENT_262144M, "262144M ME Storage Component");
            addItem(CELL_COMPONENT_1T, "1T ME Storage Component");
            addItem(CELL_COMPONENT_4T, "4T ME Storage Component");
            addItem(CELL_COMPONENT_16T, "16T ME Storage Component");
            addItem(CELL_COMPONENT_67T, "67T ME Storage Component");
            addItem(CELL_COMPONENT_268T, "268T ME Storage Component");
            addItem(CELL_COMPONENT_1P, "1P ME Storage Component");
            addItem(CELL_COMPONENT_4P, "4P ME Storage Component");
            addItem(CELL_COMPONENT_171P, "171P ME Storage Component");
            addItem(CELL_COMPONENT_687P, "687P ME Storage Component");
            addItem(CELL_COMPONENT_2748P, "2748P ME Storage Component");
            addItem(CELL_COMPONENT_1E, "1E ME Storage Component");
            addItem(CELL_COMPONENT_4E, "4E ME Storage Component");
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
            addItem(CELL_COMPONENT_1024M, "1024M MEストレージコンポーネント");
            addItem(CELL_COMPONENT_4096M, "4096M MEストレージコンポーネント");
            addItem(CELL_COMPONENT_16384M, "16384M MEストレージコンポーネント");
            addItem(CELL_COMPONENT_65536M, "65536M MEストレージコンポーネント");
            addItem(CELL_COMPONENT_262144M, "262144M MEストレージコンポーネント");
            addItem(CELL_COMPONENT_1T, "1T MEストレージコンポーネント");
            addItem(CELL_COMPONENT_4T, "4T MEストレージコンポーネント");
            addItem(CELL_COMPONENT_16T, "16T MEストレージコンポーネント");
            addItem(CELL_COMPONENT_67T, "67T MEストレージコンポーネント");
            addItem(CELL_COMPONENT_268T, "268T MEストレージコンポーネント");
            addItem(CELL_COMPONENT_1P, "1P MEストレージコンポーネント");
            addItem(CELL_COMPONENT_4P, "4P MEストレージコンポーネント");
            addItem(CELL_COMPONENT_171P, "171P MEストレージコンポーネント");
            addItem(CELL_COMPONENT_687P, "687P MEストレージコンポーネント");
            addItem(CELL_COMPONENT_2748P, "2748P MEストレージコンポーネント");
            addItem(CELL_COMPONENT_1E, "1E MEストレージコンポーネント");
            addItem(CELL_COMPONENT_4E, "4E MEストレージコンポーネント");
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
