package com.PIPPIP5789.main;

import minefantasy.mfr.MineFantasyReforged;
import minefantasy.mfr.init.MineFantasyTabs;
import minefantasy.mfr.item.ItemWeaponMFR;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;
@GameRegistry.ObjectHolder(MFRExWeaponsMain.MODID)
@Mod.EventBusSubscriber(modid = MFRExWeaponsMain.MODID)
public class WeaponInit {

    public static ItemWeaponMFR STANDARD_KHOPESH;

    public static void initWeapons() {
        String standard = "standard";
        CreativeTabs tab = MineFantasyTabs.tabWeapon;

        STANDARD_KHOPESH = new Khopesh(standard + "_khopesh", Item.ToolMaterial.IRON, 0, 1F).setCustom(standard).setTab(CreativeTabs.REDSTONE);
    }


    @SubscribeEvent
    public static void register(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();

        registry.register(STANDARD_KHOPESH);
    }

}
