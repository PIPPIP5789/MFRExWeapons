package com.PIPPIP5789.main;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;

@Mod(modid = MFRExWeaponsMain.MODID, name = MFRExWeaponsMain.NAME, version = MFRExWeaponsMain.VERSION)
public class MFRExWeaponsMain
{
    public static final String MODID = "mfrexweapons";
    public static final String NAME = "MineFantasy: Reforged - Extra Weapons";
    public static final String VERSION = "0.1.0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        WeaponInit.initWeapons();
        CraftingInit.initAnvilRecipes(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

}
