
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.modofthetrio.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.modofthetrio.item.MurasamaItem;
import net.mcreator.modofthetrio.ModOfTheTrioMod;

public class ModOfTheTrioModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ModOfTheTrioMod.MODID);
	public static final RegistryObject<Item> MURASAMA = REGISTRY.register("murasama", () -> new MurasamaItem());
	public static final RegistryObject<Item> HAMMEY = REGISTRY.register("hammey_spawn_egg",
			() -> new ForgeSpawnEggItem(ModOfTheTrioModEntities.HAMMEY, -16751104, -16711885, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
}
