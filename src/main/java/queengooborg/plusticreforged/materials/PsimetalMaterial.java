package queengooborg.plusticreforged.materials;

import queengooborg.plusticreforged.Resources;
import queengooborg.plusticreforged.api.*;
import slimeknights.tconstruct.library.utils.HarvestLevels;
import slimeknights.tconstruct.tools.stats.ExtraMaterialStats;
import slimeknights.tconstruct.tools.stats.HandleMaterialStats;
import slimeknights.tconstruct.tools.stats.HeadMaterialStats;

import java.awt.*;

import static slimeknights.tconstruct.library.data.material.AbstractMaterialDataProvider.ORDER_COMPAT;
import static slimeknights.tconstruct.library.data.material.AbstractMaterialDataProvider.ORDER_HARVEST;

public class PsimetalMaterial extends Material {
	public PsimetalMaterial() {
		super(
				"psimetal",
				"Psimetal",
				new Description("A metal infused with psionic energy."),
				new ItemTag("forge", "ingots/psimetal"),
				null,
				2,
				MaterialType.METAL,
				ORDER_HARVEST + ORDER_COMPAT,
				new MaterialColors(new Color(109, 158, 255)),
				new MaterialStats(new HeadMaterialStats(620, 7, HarvestLevels.NETHERITE, 5), new HandleMaterialStats(1.3f, 1, 1, 1), ExtraMaterialStats.DEFAULT),
				new Modifier[]{Resources.getModifier("psicological"), Resources.getModifier("global")},
				696
		);
	}

	// Material psimetal = new Material("psimetal", 0x6D9EFF);
	//			psimetal.addTrait(Psicological.psicological);
	//			psimetal.addTrait(Global.global);
	//			psimetal.addItem("ingotPsi", 1, Material.VALUE_Ingot);
	//			psimetal.setCraftable(false).setCastable(true);
	//			Utils.setDispItem(psimetal, "ingotPsi");
	//			PlusTiC.proxy.setRenderInfo(psimetal, 0x6D9EFF);
	//
	//			FluidMolten psimetalFluid = Utils.fluidMetal("psimetal", 0x6D9EFF);
	//			psimetalFluid.setTemperature(696);
	//			Utils.initFluidMetal(psimetalFluid);
	//			psimetal.setFluid(psimetalFluid);
	//
	//			TinkerRegistry.addMaterialStats(psimetal,
	//					new HeadMaterialStats(620, 7f, 5, OBSIDIAN),
	//					new HandleMaterialStats(1.3f, -10),
	//					new ExtraMaterialStats(30),
	//					new BowMaterialStats(1, 1.6f, 4));
}
