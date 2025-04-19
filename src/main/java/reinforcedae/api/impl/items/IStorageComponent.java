package reinforcedae.api.impl.items;

import net.minecraft.world.item.ItemStack;

public interface IStorageComponent {

    Double getBytes(ItemStack stack);

    boolean isStorageComponent(ItemStack stack);
}