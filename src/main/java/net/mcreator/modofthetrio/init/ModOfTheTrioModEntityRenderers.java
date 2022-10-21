
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.modofthetrio.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.modofthetrio.client.renderer.SamRenderer;
import net.mcreator.modofthetrio.client.renderer.HammeyRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModOfTheTrioModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ModOfTheTrioModEntities.HAMMEY.get(), HammeyRenderer::new);
		event.registerEntityRenderer(ModOfTheTrioModEntities.SAM.get(), SamRenderer::new);
	}
}
