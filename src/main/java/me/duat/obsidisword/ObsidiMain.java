package me.duat.obsidisword;

import me.duat.obsidisword.proxy.CommonProxy;
import me.duat.obsidisword.proxy.ObsidioEventHandler;
import me.duat.obsidisword.util.Ref;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Ref.MODID, name = Ref.NAME, version = Ref.VERSION)
public class ObsidiMain {
    @SidedProxy(clientSide = Ref.CLIENT_PROXY, serverSide = Ref.COMMON_PROXY)
    public static CommonProxy proxy;
    
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        MinecraftForge.EVENT_BUS.register(new ObsidioEventHandler());
    }
    
    @Mod.EventHandler
    public void postInit(FMLInitializationEvent event)
    {
        
    }
}
