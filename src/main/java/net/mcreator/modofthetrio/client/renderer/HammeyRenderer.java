
package net.mcreator.modofthetrio.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.modofthetrio.entity.HammeyEntity;
import net.mcreator.modofthetrio.client.model.Modelcustom_model;

public class HammeyRenderer extends MobRenderer<HammeyEntity, Modelcustom_model<HammeyEntity>> {
	public HammeyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HammeyEntity entity) {
		return new ResourceLocation("mod_of_the_trio:textures/entities/hammey.png");
	}
}
