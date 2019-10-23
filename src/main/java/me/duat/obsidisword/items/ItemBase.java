package me.duat.obsidisword.items;

import me.duat.obsidisword.ObsidiMain;
import me.duat.obsidisword.init.Items;
import me.duat.obsidisword.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		Items.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		ObsidiMain.proxy.registerItemRenderer(this, 0, "inventory");
	}
}