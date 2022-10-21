package net.mcreator.modofthetrio.procedures;

import net.minecraft.world.entity.Entity;

public class SamOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putString("Sammy", "1");
	}
}
