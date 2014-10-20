package com.millstone.tileentity;

import com.millstone.blocks.Millstone;
import com.millstone.items.ItemGear;

import java.util.Random;

import com.millstone.blocks.Millstone;
import com.millstone.MillstoneMod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import cpw.mods.fml.common.registry.GameRegistry;

public class TileEntityMillstone extends TileEntity implements ISidedInventory {

	private String localizedName;

	private static final int[] slots_top = new int[] { 0 };
	private static final int[] slots_bottom = new int[] { 2, 1 };
	private static final int[] slots_side = new int[] { 1 };

	private ItemStack[] slots = new ItemStack[3];
	private ItemStack itemstack;

	public int furnaceSpeed = 65;

	/**
	 * The number of ticks that the furnace will keep burning
	 */
	public int burnTime;
	/**
	 * The number of ticks that a fresh copy of the currently-burning item would
	 * keep the furnace burning for
	 */
	public int currentItemBurnTime;
	/**
	 * The number of ticks that the current item has been cooking for
	 */
	public int cookTime;

	public int WoodGear = 0;
	public int StoneGear = 1;
	public int IronGear = 2;
	public int GoldGear = 3;
	public int DiamondGear = 4;

	public boolean isGear(ItemStack stack) {
		if (stack != null) {
			if (stack.getItem() instanceof ItemGear) {
				return true;
			}
		}
		return false;
	}

	public boolean hasGear() {
		if (isGear(this.slots[1])) {
			return true;
		}
		return false;
	}

	public int getGear() {
		if (hasGear()) {
			if (this.slots[1].getItem() == MillstoneMod.woodGear) {
				return this.WoodGear;
			}
			if (this.slots[1].getItem() == MillstoneMod.stoneGear) {
				return this.StoneGear;
			}
			if (this.slots[1].getItem() == MillstoneMod.ironGear) {
				return this.IronGear;
			}
			if (this.slots[1].getItem() == MillstoneMod.goldGear) {
				return this.GoldGear;
			}
			if (this.slots[1].getItem() == MillstoneMod.diamondGear) {
				return this.DiamondGear;
			}
		}

		return 5;

	}

	public void setGuiDisplayName(String displayName) {
		this.localizedName = displayName;
	}

	public String getInventoryName() {
		return this.hasCustomInventoryName() ? this.localizedName
				: "Grindstone";
	}

	public boolean hasCustomInventoryName() {
		return this.localizedName != null && this.localizedName.length() > 0;
	}

	public int getSizeInventory() {
		return this.slots.length;
	}

	@Override
	public ItemStack getStackInSlot(int var1) {
		return this.slots[var1];
	}

	@Override
	public ItemStack decrStackSize(int var1, int var2) {
		if (this.slots[var1] != null) {
			ItemStack itemstack;

			if (this.slots[var1].stackSize <= var2) {
				itemstack = this.slots[var1];
				this.slots[var1] = null;
				return itemstack;
			} else {
				itemstack = this.slots[var1].splitStack(var2);

				if (this.slots[var1].stackSize == 0) {
					this.slots[var1] = null;
				}

				return itemstack;
			}
		} else {
			return null;
		}
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int i) {
		if (this.slots[i] != null) {
			ItemStack itemstack = this.slots[i];
			this.slots[i] = null;
			return itemstack;
		}
		return null;
	}

	@Override
	public void setInventorySlotContents(int i, ItemStack itemstack) {
		this.slots[i] = itemstack;

		if (itemstack != null
				&& itemstack.stackSize > this.getInventoryStackLimit()) {
			itemstack.stackSize = this.getInventoryStackLimit();
		}

	}

	public void setFurnaceSpeed() {
		if (this.hasGear()) {
			int type = this.getGear();

			if (type == this.WoodGear) {
				furnaceSpeed = 150;
			}
			if (type == this.StoneGear) {
				furnaceSpeed = 115;
			}
			if (type == this.IronGear) {
				furnaceSpeed = 85;
			}
			if (type == this.GoldGear) {
				furnaceSpeed = 25;
			}
			if (type == this.DiamondGear) {
				furnaceSpeed = 50;
			}

		}
	}

	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer entityplayer) {
		return this.worldObj.getTileEntity(this.xCoord, this.yCoord,
				this.zCoord) != this ? false : entityplayer.getDistanceSq(
				(double) this.xCoord + 0.5D, (double) this.yCoord + 0.5D,
				(double) this.zCoord + 0.5D) <= 64.0D;
	}

	public void openInventory() {
	}

	public void closeInventory() {
	}

	@Override
	public boolean isItemValidForSlot(int i, ItemStack itemstack) {
		return i == 2 ? false : (i == 1 ? isGear(itemstack) : true);
	}

	public boolean isBurning() {
		return this.hasGear();
	}

	public void updateEntity() {
		boolean flag = this.burnTime > 0;

		this.setFurnaceSpeed();

		/*
		 * if(this.isBurning()) { this.burnTime--; }
		 */
		if (!this.worldObj.isRemote) {
			if (this.hasGear() && this.canSmelt()) {
				this.cookTime++;

				if (this.cookTime == this.furnaceSpeed) {
					this.cookTime = 0;
					this.smeltItem();
				}
			} else {
				this.cookTime = 0;
			}

		}

	}

	public boolean canSmelt() {
		if (this.slots[0] == null) {
			return false;

		} else {
			ItemStack itemstack = getMillingResults(slots[0]);
			if (itemstack == null)
				return false;
			if (this.slots[2] == null)
				return true;
			if (!this.slots[2].isItemEqual(itemstack))
				return false;

			int result = this.slots[2].stackSize + itemstack.stackSize;

			return (result <= getInventoryStackLimit() && result <= itemstack
					.getMaxStackSize());

		}
	}

	public void smeltItem() {
		ItemStack itemstack = getMillingResults(slots[0]);

		if (this.slots[2] == null) {
			this.slots[2] = itemstack.copy();
		} else if (this.slots[2].isItemEqual(itemstack)) {
			this.slots[2].stackSize += itemstack.stackSize;
		}

		this.slots[0].stackSize--;

		if (this.slots[0].stackSize <= 0) {
			this.slots[0] = null;
		}

		burnTime -= 20;

		slots[1].setItemDamage(slots[1].getItemDamage() + 20);
		if (slots[1].getItemDamage() >= slots[1].getMaxDamage()) {
			slots[1] = null;
		}
	}

	// MILLSTONE RECIPES HERE!!!
	private ItemStack getMillingResults (ItemStack stack) {
        	
  			Random generator = new Random(); 
    		int i = generator.nextInt(4) + 1;
        	
        	if(stack.getItem() == Items.flint){
				return new ItemStack(Items.gunpowder , 1);
			}
        	
        //	if(stack.getItem() == Items.dye && stack.getItem().getDamage(stack) == 3){
        //		return new ItemStack(Items.apple , 2);
        	//}
        	
        	if(stack.getItem() == Item.getItemFromBlock(Blocks.hay_block)){
        		return new ItemStack(MillstoneMod.flour, 9);
        	}
        	
         	if(stack.getItem() == Items.blaze_rod){
        		return new ItemStack(Items.blaze_powder, 2);
        	}
         	
          	if(stack.getItem() == Items.wheat){
        		return new ItemStack(MillstoneMod.flour);
        	}
          	
        	if(stack.getItem() == Item.getItemFromBlock(Blocks.gravel)){
        		return new ItemStack(Blocks.sand, 2);
        	}
        	
         	if(stack.getItem() == Items.reeds){
        		return new ItemStack(Items.sugar);
        	}
         	
         	if(stack.getItem() == Items.bone){
         		//BoneMeal
        		return new ItemStack(Items.dye, 3, 15);
        	}
    		
         	//          VDyes hereV        //
         	
         	if(stack == new ItemStack(Blocks.red_flower, 1, 0)){
         		//Rose Red Dye
        		return new ItemStack(Items.dye, 3, 1);
        	}
         	/*
         	if(stack.getItem() == ){
         		//Purple Dye
        		return new ItemStack(Items.dye, 3, 5);
        	}     	
         	if(stack.getItem() == ){
         		//Cyan Dye
        		return new ItemStack(Items.dye, 3, 6);
        	}
        	*/
         	if(stack == new ItemStack(Blocks.red_flower, 1, 3)){
         		//Light Gray Dye
        		return new ItemStack(Items.dye, 3, 7);
        	}
         	/*
         	if(stack == ){
         		//Gray Dye
        		return new ItemStack(Items.dye, 3, 8);
        	}
        	*/
         	if(stack == new ItemStack(Blocks.red_flower, 1, 7)){
         		//Pink Dye
        		return new ItemStack(Items.dye, 3, 9);
        	}
         	/*
         	if(stack == ){
         		//Lime Dye
        		return new ItemStack(Items.dye, 3, 10);
        	}
        	*/
         	if(stack == new ItemStack(Blocks.yellow_flower, 1, 0)){
         		//Dandelion Yellow
        		return new ItemStack(Items.dye, 3, 11);
        	}
         	if(stack == new ItemStack(Blocks.red_flower, 1, 1)){
         		//Light Blue Dye
        		return new ItemStack(Items.dye, 3, 12);
        	}
         	if(stack == new ItemStack(Blocks.red_flower, 1, 2)){
         		//Magenta Dye
        		return new ItemStack(Items.dye, 3, 13);
        	}
         	if(stack == new ItemStack(Blocks.red_flower, 1, 5)){
         		//Orange Dye
        		return new ItemStack(Items.dye, 3, 14);
        	}
         	
         	
         	//Incase you are reading, this basically returns a "random" amount of dust.
           	if(stack.getItem() == Item.getItemFromBlock(Blocks.gold_ore)){
           		if(i == 3){
            		return new ItemStack(MillstoneMod.goldDust, 1);
           		} else {
        		return new ItemStack(MillstoneMod.goldDust, 2);
           		} 		
        	}
           	
           	if(stack.getItem() == Item.getItemFromBlock(Blocks.obsidian)){
           		if(i == 3){
            		return new ItemStack(MillstoneMod.obsidianDust, 1);
           		} else {
        		return new ItemStack(MillstoneMod.obsidianDust, 2);
           		} 		
        	}
           	
          	if(stack.getItem() == Item.getItemFromBlock(Blocks.iron_ore)){
           		if(i == 3){
            		return new ItemStack(MillstoneMod.ironDust, 1);
           		} else {
        		return new ItemStack(MillstoneMod.ironDust, 2);
           		} 		
        	}
          	if(stack.getItem() == Item.getItemFromBlock(MillstoneMod.silverOre)){
           		if(i == 3){
            		return new ItemStack(MillstoneMod.silverDust, 1);
           		} else {
        		return new ItemStack(MillstoneMod.silverDust, 2);
           		} 		
        	}
          	
          	if(stack.getItem() == Item.getItemFromBlock(MillstoneMod.copperOre)){
           		if(i == 3){
            		return new ItemStack(MillstoneMod.copperDust, 1);
           		} else {
        		return new ItemStack(MillstoneMod.copperDust, 2);
           		} 		
          	}
			
			return null;
		}

	@Override
	public int[] getAccessibleSlotsFromSide(int var1) {
		return var1 == 0 ? slots_bottom : (var1 == 1 ? slots_top : slots_side);
	}

	@Override
	public boolean canInsertItem(int i, ItemStack itemstack, int j) {
		return this.isItemValidForSlot(i, itemstack);
	}

	@Override
	public boolean canExtractItem(int i, ItemStack itemstack, int j) {
		return j != 0 || i != 1 || itemstack.getItem() == Items.bucket;
	}

	public int getBurnTimeRemainingScaled(int i) {
		if (this.currentItemBurnTime == 0) {
			this.currentItemBurnTime = this.furnaceSpeed;
		}
		return this.burnTime * i / this.currentItemBurnTime;
	}

	public int getCookProgressScaled(int i) {
		if (this.furnaceSpeed != 0) {
			return this.cookTime * i / this.furnaceSpeed;
		} else {
			return this.cookTime * i / this.furnaceSpeed;
		}
	}

	@Override
	public void writeToNBT(NBTTagCompound nbt) {
		super.writeToNBT(nbt);

		nbt.setShort("BurnTime", (short) this.burnTime);
		nbt.setShort("CookTime", (short) this.cookTime);
		nbt.setShort("CurrentBurnTime", (short) this.currentItemBurnTime);

		NBTTagList list = new NBTTagList();

		for (int i = 0; i < this.slots.length; i++) {
			if (this.slots[i] != null) {
				NBTTagCompound compound = new NBTTagCompound();
				compound.setByte("Slot", (byte) i);
				this.slots[i].writeToNBT(compound);
				list.appendTag(compound);
			}
		}

		nbt.setTag("Items", list);

		if (this.hasCustomInventoryName()) {
			nbt.setString("CustomName", this.localizedName);
		}
	}

	@Override
	public void readFromNBT(NBTTagCompound nbt) {
		super.readFromNBT(nbt);

		NBTTagList list = nbt.getTagList("Items", 10);
		this.slots = new ItemStack[this.getSizeInventory()];

		for (int i = 0; i < list.tagCount(); i++) {
			NBTTagCompound compound = (NBTTagCompound) list.getCompoundTagAt(i);
			byte b = compound.getByte("Slot");

			if (b >= 0 && b < this.slots.length) {
				this.slots[b] = ItemStack.loadItemStackFromNBT(compound);
			}
		}

		this.burnTime = (int) nbt.getShort("BurnTime");
		this.cookTime = (int) nbt.getShort("CookTime");
		this.currentItemBurnTime = (int) nbt.getShort("CurrentBurnTime");

		if (nbt.hasKey("CustomName")) {
			this.localizedName = nbt.getString("CustomName");
		}
	}

}