package me.duat.obsidisword.init;

import java.util.ArrayList;
import java.util.List;
import me.duat.obsidisword.items.ItemBase;
import me.duat.obsidisword.items.tools.ItemBaseAxe;
import me.duat.obsidisword.items.tools.ItemBaseHoe;
import me.duat.obsidisword.items.tools.ItemBasePickaxe;
import me.duat.obsidisword.items.tools.ItemBaseShovel;
import me.duat.obsidisword.items.weapons.ItemBaseSword;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class Items {
    public static final List<Item> ITEMS = new ArrayList<Item>();
    
    public static final ToolMaterial OBSIDIASNMAT = EnumHelper.addToolMaterial("OBSIDIASNMAT", 3, 3072, 13f, 5.0f, 19);
    
    public static Item OBSIDIAN_SHARD = new ItemBase("obsidian_shard");
    
    public static ItemSword OBSIDIAN_SWORD= new ItemBaseSword("obsidian_sword", OBSIDIASNMAT);
    public static ItemPickaxe OBSIDIAN_PICKAXE = new ItemBasePickaxe("obsidian_pickaxe", OBSIDIASNMAT);
    public static ItemAxe OBSIDIAN_AXE = new ItemBaseAxe("obsidian_axe", OBSIDIASNMAT);
    public static ItemSpade OBSIDIAN_SHOVEL = new ItemBaseShovel("obsidian_shovel", OBSIDIASNMAT);
    public static ItemHoe OBSIDIAN_HOE = new ItemBaseHoe("obsidian_hoe", OBSIDIASNMAT);
}
