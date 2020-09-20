package fr.auretyube.electronics.utils;

import net.minecraft.client.Minecraft;
import net.minecraft.client.util.InputMappings;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class KeyboardHelper {
	
	private static final long WINDOW = Minecraft.getInstance().getMainWindow().getHandle();
	
	@OnlyIn(Dist.CLIENT)
	public static boolean isKeyDown(int key) {
		return InputMappings.isKeyDown(WINDOW, key);
	}
	
}