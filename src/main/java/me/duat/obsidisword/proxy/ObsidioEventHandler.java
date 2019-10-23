package me.duat.obsidisword.proxy;

import java.util.Random;
import me.duat.obsidisword.init.Items;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class ObsidioEventHandler {
    Random r = new Random();
    
    @SubscribeEvent
    public void addBlockDrops(BlockEvent.HarvestDropsEvent event) {
        if (event.getHarvester() != null) {
			if (event.getState() == Blocks.OBSIDIAN.getDefaultState()) {
				event.setDropChance(1.0f);
                                event.getDrops().clear();
				event.getDrops().add(new ItemStack(Items.OBSIDIAN_SHARD, r.nextInt(5-3) + 3));
			}
			
		}
    }
}
