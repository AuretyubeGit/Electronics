package fr.auretyube.electronics.items;

import java.util.List;

import org.lwjgl.glfw.GLFW;

import fr.auretyube.electronics.ElectronicsMod;
import fr.auretyube.electronics.utils.KeyboardHelper;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

public class CopperItem extends Item {

	public CopperItem(Properties properties) {
		super(properties);
	}
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		if(!KeyboardHelper.isKeyDown(GLFW.GLFW_KEY_LEFT_SHIFT)) {
			tooltip.add(new TranslationTextComponent("tooltip." + ElectronicsMod.MODID + ".hold_shift_information"));
		} else {
			tooltip.add(new TranslationTextComponent("tooltip." + ElectronicsMod.MODID + ".copper_symbol"));
			tooltip.add(new TranslationTextComponent("tooltip." + ElectronicsMod.MODID + ".copper_atomic_number"));
		}
		super.addInformation(stack, worldIn, tooltip, flagIn);
	}

}