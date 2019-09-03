package tonius.simplyjetpacks.integration;

import net.minecraft.item.ItemStack;
import tonius.simplyjetpacks.SimplyJetpacks;

public abstract class RAItems {

    public static ItemStack plateFlux = null;
    public static ItemStack armorFluxPlate = null;

    public static void init() {
        SimplyJetpacks.logger.info("Stealing Redstone Arsenal's items");

        plateFlux = cofh.redstonearsenal.item.RAItems.plateFlux;
        		//GameRegistry.findItemStack("RedstoneArsenal", "plateFlux", 1);
        armorFluxPlate = cofh.redstonearsenal.item.RAItems.armorFluxPlate;
        		//new ItemStack(GameRegistry.findItemStack("RedstoneArsenal", "armorFluxPlate", 1).getItem(), 1, OreDictionary.WILDCARD_VALUE);
    }

}
