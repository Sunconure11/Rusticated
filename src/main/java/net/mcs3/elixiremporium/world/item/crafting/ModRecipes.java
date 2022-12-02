package net.mcs3.elixiremporium.world.item.crafting;

import net.mcs3.elixiremporium.ElixirEmporium;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;


public class ModRecipes
{
    private static String MOD_ID = ElixirEmporium.MOD_ID;

    public static void onRecipeRegistry()
    {
        Registry.register(Registry.RECIPE_SERIALIZER, new ResourceLocation(MOD_ID, CondenserRecipe.Serializer.ID), CondenserRecipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new ResourceLocation(MOD_ID, CondenserRecipe.Type.ID), CondenserRecipe.Type.INSTANCE);


    }
}
