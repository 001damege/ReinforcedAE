package reinforcedae.api.storage;

import appeng.api.stacks.AEKey;
import appeng.api.stacks.AEKeyType;
import appeng.api.storage.cells.ICellWorkbenchItem;
import appeng.me.cells.BasicCellHandler;
import com.google.common.base.Preconditions;
import net.minecraft.network.chat.Component;
import net.minecraft.world.inventory.tooltip.TooltipComponent;
import net.minecraft.world.item.ItemStack;

import java.util.List;
import java.util.Optional;

public interface IBasicCellItem extends ICellWorkbenchItem {

    AEKeyType getKeyType();

    long getBytes(ItemStack cellItem);

    long getBytesPerType(ItemStack cellItem);

    int getTotalTypes(ItemStack cellItem);

    default boolean isBlackListed(ItemStack cellItem, AEKey requestedAddition) {
        return false;
    }

    default boolean storableInStorageCell() {
        return false;
    }

    default boolean isStorageCell(ItemStack i) {
        return true;
    }

    double getIdleDrain();

    default void addCellInformationToTooltip(ItemStack is, List<Component> lines) {
        Preconditions.checkArgument(is.getItem() == this);
        BasicCellHandler.INSTANCE.addCellInformationToTooltip(is, lines);
    }

    default Optional<TooltipComponent> getCellTooltipImage(ItemStack is) {
        Preconditions.checkArgument(is.getItem() == this);
        return BasicCellHandler.INSTANCE.getTooltipImage(is);
    }
}
