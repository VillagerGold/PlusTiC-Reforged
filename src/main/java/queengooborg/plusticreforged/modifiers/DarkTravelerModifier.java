package queengooborg.plusticreforged.modifiers;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.monster.IMob;
import net.minecraft.util.EntityDamageSource;
import queengooborg.plusticreforged.api.Description;
import queengooborg.plusticreforged.api.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

import java.awt.*;
import java.util.List;
import java.util.Random;

public class DarkTravelerModifier extends Modifier {
	Random random = new Random();

	public DarkTravelerModifier() {
		super("dark_traveler", "Dark Traveler", new Description("Surrounding mobs get randomly afflicted with damage."), new Color(39, 1, 51));
		this.usable = true;
	}

	@Override
	public int afterEntityHit(IModifierToolStack tool, int level, ToolAttackContext context, float damageDealt) {
		if (random.nextFloat() < 0.035f && tool.getCurrentDurability() >= 1) {
			List<LivingEntity> lst = context.getPlayerAttacker().level.getEntitiesOfClass(LivingEntity.class, context.getTarget().getBoundingBox().inflate(8, 8, 8), ent -> ent instanceof IMob && ent != context.getPlayerAttacker());

			if (lst.isEmpty()) {
				return 0;
			}

			LivingEntity target = lst.get(random.nextInt(lst.size()));
			target.hurt(new EntityDamageSource("darktraveler", target), 2f + random.nextFloat() * 2.5f);
			return 1;
		}


		return 0;
	}
}
