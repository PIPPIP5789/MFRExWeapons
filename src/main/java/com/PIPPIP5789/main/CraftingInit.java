package com.PIPPIP5789.main;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class CraftingInit {

    public static void initAnvilRecipes(FMLPreInitializationEvent event) {
        String path =  "MineFantasyReforged/custom/recipes/anvil_recipes/";
        try {
            File file = new File(event.getModConfigurationDirectory(), path + "Khopesh" + ".json");
            file.deleteOnExit();
            PrintWriter writer = new PrintWriter(file);
            writer.println(KHOPESH);
            writer.flush();
        }
        catch(IOException e) {
            System.exit(-100);
        }
    }

    public static String KHOPESH = "{\n" +
            "  \"type\": \"CustomToolRecipe\",\n" +
            "  \"skill\": \"artisanry\",\n" +
            "  \"research\": \"\",\n" +
            "  \"tool_type\": \"hammer\",\n" +
            "  \"is_tool_recipe\": false,\n" +
            "  \"anvil_tier\": -1,\n" +
            "  \"recipe_time\": 40,\n" +
            "  \"recipe_hammer\": -1,\n" +
            "  \"output_hot\": true,\n" +
            "  \"pattern\": [\n" +
            "    \"L  BB \",\n" +
            "    \"TTB  B\",\n" +
            "    \"L     \",\n" +
            "    \"      \"\n" +
            "  ],\n" +
            "  \"key\": {\n" +
            "    \"B\": {\n" +
            "      \"item\": \"minefantasyreforged:bar\"\n" +
            "    },\n" +
            "    \"T\": {\n" +
            "      \"item\": \"minefantasyreforged:timber\"\n" +
            "    },\n" +
            "    \"L\": {\n" +
            "      \"item\": \"minefantasyreforged:leather_strip\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"result\": {\n" +
            "    \"item\": \"mfrexweapons:standard_khopesh\"\n" +
            "  }\n" +
            "}";

}
