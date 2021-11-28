
package net.mcreator.sussyballs.item;

@SussyBallsModElements.ModElement.Tag
public class AmongUsThemeSongItem extends SussyBallsModElements.ModElement {

	@ObjectHolder("sussy_balls:among_us_theme_song")
	public static final Item block = null;

	public AmongUsThemeSongItem(SussyBallsModElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {

		public MusicDiscItemCustom() {
			super(0, SussyBallsModElements.sounds.get(new ResourceLocation("sussy_balls:amongustrapremix")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("among_us_theme_song");
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("sussy balls fortnite im gay"));
		}

	}

}
