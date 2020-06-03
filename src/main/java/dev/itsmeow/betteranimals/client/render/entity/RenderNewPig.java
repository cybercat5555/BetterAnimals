package dev.itsmeow.betteranimals.client.render.entity;

import dev.itsmeow.betteranimals.BetterAnimals;
import dev.itsmeow.betteranimals.client.model.ModelNewPig;
import dev.itsmeow.betteranimals.client.render.entity.layer.LayerNewPigSaddle;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.util.ResourceLocation;

public class RenderNewPig extends MobRenderer<PigEntity, ModelNewPig<PigEntity>> {

	private static final ResourceLocation BASE = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/pig.png");

	public RenderNewPig(EntityRendererManager m) {
		super(m, new ModelNewPig<PigEntity>(), 0.7F);
		this.addLayer(new LayerNewPigSaddle<PigEntity, ModelNewPig<PigEntity>>(this));
	}

	@Override
	protected ResourceLocation getEntityTexture(PigEntity entity) {
		return BASE;
	}
}