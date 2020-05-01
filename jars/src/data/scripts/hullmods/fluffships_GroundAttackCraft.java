package jars.src.data.scripts.hullmods;

import com.fs.starfarer.api.combat.BaseHullMod;
import com.fs.starfarer.api.combat.MutableShipStatsAPI;
import com.fs.starfarer.api.combat.ShipAPI;
import com.fs.starfarer.api.impl.campaign.ids.Stats;

public class fluffships_GroundAttackCraft extends BaseHullMod{
    public static final float GROUND_BONUS = 5f;

    @Override
    public void applyEffectsBeforeShipCreation(ShipAPI.HullSize hullSize, MutableShipStatsAPI stats, String id){
        stats.getDynamic().getMod(Stats.FLEET_GROUND_SUPPORT).modifyFlat(id, GROUND_BONUS);
    }
    @Override
    public String getDescriptionParam(int index, ShipAPI.HullSize hullSize) {
        if (index == 0) return "" + (int)GROUND_BONUS;
        return null;
    }
}
