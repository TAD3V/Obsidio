package me.duat.obsidisword.items.weapons;

import me.duat.obsidisword.ObsidiMain;
import me.duat.obsidisword.init.Items;
import me.duat.obsidisword.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class ItemBaseSword extends ItemSword implements IHasModel {

	public ItemBaseSword(String name, ToolMaterial material)
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