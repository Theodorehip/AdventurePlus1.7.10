package com.millstone.gui;

import org.lwjgl.opengl.GL11;

import com.millstone.MillstoneMod;
import com.millstone.container.ContainerCutter;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public class GuiCutter extends GuiContainer {

	private ResourceLocation texture = new ResourceLocation("millstonemod:textures/gui/stoneCutter.png");
	
	public GuiCutter(InventoryPlayer invPlayer, World world, int x, int y, int z) {
		super(new ContainerCutter(invPlayer, world, x, y, z));
		
		this.xSize = 176;
		this.ySize = 188;
		
	}

	
	public void onGuiClosed() {
		super.onGuiClosed();
	}
	
	protected void drawGuiContainerForegroundLayer(int i, int j) {
		
		this.fontRendererObj.drawString(StatCollector.translateToLocal("Stonecutter"), 30, 6, 0x2D2D2D);
		
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {

		GL11.glColor4f(1F, 1F, 1F, 1F);
		
		Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
		
	}

}