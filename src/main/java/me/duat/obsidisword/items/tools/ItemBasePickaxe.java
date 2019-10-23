package me.duat.obsidisword.items.tools;

import me.duat.obsidisword.ObsidiMain;
import me.duat.obsidisword.init.Items;
import me.duat.obsidisword.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class ItemBasePickaxe extends ItemPickaxe implements IHasModel {

	public ItemBasePickaxe(String name, ToolMaterial material)
	{
                super(material);
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