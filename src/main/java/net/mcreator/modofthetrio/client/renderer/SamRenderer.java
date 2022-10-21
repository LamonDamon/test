
package net.mcreator.modofthetrio.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.modofthetrio.entity.SamEntity;
import net.mcreator.modofthetrio.client.model.Modelsamuel;

public class SamRenderer extends MobRenderer<SamEntity, Modelsamuel<SamEntity>> {
	public SamRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsamuel(context.bakeLayer(Modelsamuel.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SamEntity entity) {
		return new ResourceLocation("mod_of_the_trio:textures/entities/sam.png");
	}
}
