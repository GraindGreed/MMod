package ru.GraindGreed.MMod.Fabrication_folder;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import ru.GraindGreed.MMod.Main;

public class FabricationGuiContainer extends GuiContainer {
	
	final InventoryPlayer inventory_player;
	final TileEntityFabrication tile_entity;
	
	private static final ResourceLocation texture = new ResourceLocation(Main.MODID.toLowerCase(),
			"textures/gui/Test GUI anim.png");
	
	public FabricationGuiContainer(final InventoryPlayer inventory_player,
			final TileEntityFabrication tile_entity) {
		
		super(new FabricationContainer(inventory_player, tile_entity));
		this.inventory_player = inventory_player;
		this.tile_entity = tile_entity;
		
	}
	
	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
		
		this.fontRendererObj.drawString(I18n.format(this.tile_entity.getInventoryName(), new Object[0]),
				8, 6, 4210752);
		this.fontRendererObj.drawString(this.inventory_player.hasCustomInventoryName() ?
				this.inventory_player.getInventoryName() : I18n.format(this.inventory_player.getInventoryName(),
				new Object[0]), 8, this.ySize - 94, 4210752);
		
	}
	
	@Override
	public void drawGuiContainerBackgroundLayer(float parTick, int mouseX, int mouseY) {
		
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.getTextureManager().bindTexture(texture);
		this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
		
		if (tile_entity.time_max > 0) {
			
			this.drawTexturedModalRect(this.guiLeft + 78, this.guiTop + 33, 176, 0,
					22 - (int)((float)(tile_entity.time / (float)tile_entity.time_max) * 22F), 17);
			
		}
		
	}

}
