package reinforcedae.items.storage;

import appeng.api.config.FuzzyMode;
import appeng.api.stacks.AEKeyType;
import appeng.hooks.AEToolItem;
import appeng.items.AEBaseItem;
import net.minecraft.world.inventory.tooltip.TooltipComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import reinforcedae.api.storage.IBasicCellItem;

import java.util.Optional;

public class EXAStorageCell extends AEBaseItem implements IBasicCellItem, AEToolItem {

    protected final ItemLike coreItem;
    protected final ItemLike housingItem;
    private final AEKeyType keyType;

    public EXAStorageCell(Item.Properties properties, ItemLike coreItem, ItemLike housingItem, AEKeyType keyType) {
        super(properties);
        this.coreItem = coreItem;
        this.housingItem = housingItem;
        this.keyType = keyType;
    }

    @Override
    public Optional<TooltipComponent> getTooltipImage(ItemStack stack) {
        return getCellTooltipImage(stack);
    }

    @Override
    public FuzzyMode getFuzzyMode(ItemStack is) {
        final String fz = is.getOrCreateTag().getString("FuzzyMode");
        if (fz.isEmpty()) {
            return FuzzyMode.IGNORE_ALL;
        }
        try {
            return FuzzyMode.valueOf(fz);
        } catch (Throwable t) {
            return FuzzyMode.IGNORE_ALL;
        }
    }

    @Override
    public void setFuzzyMode(ItemStack is, FuzzyMode fzMode) {
        is.getOrCreateTag().putString("FuzzyMode", fzMode.name());
    }

    @Override
    public AEKeyType getKeyType() {
        return this.keyType;
    }

    @Override
    public long getBytes(ItemStack cellItem) {
        return Long.MAX_VALUE;
    }

    @Override
    public long getBytesPerType(ItemStack cellItem) {
        return 262144;
    }

    @Override
    public int getTotalTypes(ItemStack cellItem) {
        return 63;
    }

    @Override
    public double getIdleDrain() {
        return 14f;
    }
}
