package reinforcedae.items.materials;

import appeng.items.AEBaseItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import reinforcedae.api.impl.items.IStorageComponent;

public class StorageComponentItem extends AEBaseItem implements IStorageComponent {

    private final Double storageInKb;

    public StorageComponentItem(Item.Properties properties, Double storageInKb) {
        super(properties);
        this.storageInKb = storageInKb;
    }

    @Override
    public Double getBytes(ItemStack stack) {
        return this.storageInKb * 1024;
    }

    @Override
    public boolean isStorageComponent(ItemStack stack) {
        return true;
    }
}
