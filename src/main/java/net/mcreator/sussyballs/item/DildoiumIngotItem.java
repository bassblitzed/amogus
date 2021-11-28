
package net.mcreator.sussyballs.item;

@SussyBallsModElements.ModElement.Tag
public class DildoiumIngotItem extends SussyBallsModElements.ModElement {

	@ObjectHolder("sussy_balls:dildoium_ingot")
	public static final Item block = null;

	public DildoiumIngotItem(SussyBallsModElements instance) {
		super(instance, 11);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64).isImmuneToFire().rarity(Rarity.EPIC));
			setRegistryName("dildoium_ingot");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

	}

}
