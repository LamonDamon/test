
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.modofthetrio.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.modofthetrio.entity.SamEntity;
import net.mcreator.modofthetrio.entity.HammeyEntity;
import net.mcreator.modofthetrio.ModOfTheTrioMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModOfTheTrioModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, ModOfTheTrioMod.MODID);
	public static final RegistryObject<EntityType<HammeyEntity>> HAMMEY = register("hammey",
			EntityType.Builder.<HammeyEntity>of(HammeyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(HammeyEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SamEntity>> SAM = register("sam",
			EntityType.Builder.<SamEntity>of(SamEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(SamEntity::new).fireImmune().sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			HammeyEntity.init();
			SamEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(HAMMEY.get(), HammeyEntity.createAttributes().build());
		event.put(SAM.get(), SamEntity.createAttributes().build());
	}
}
