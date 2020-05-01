package jars.src.data.scripts.hullmods;

import com.fs.starfarer.api.combat.MutableShipStatsAPI;
import com.fs.starfarer.api.combat.ShipAPI;
import com.fs.starfarer.api.impl.campaign.ids.Stats;
import com.fs.starfarer.api.combat.BaseHullMod;

public class fluffships_HeavyEnergyNonitegration extends BaseHullMod{

        public static final float COST_REDUCTION  = 5f;

        public void applyEffectsBeforeShipCreation(ShipAPI.HullSize hullSize, MutableShipStatsAPI stats, String id) {
            stats.getDynamic().getMod(Stats.LARGE_ENERGY_MOD).modifyFlat(id, +COST_REDUCTION);
        }

        public String getDescriptionParam(int index, ShipAPI.HullSize hullSize) {
            if (index == 0) return "" + (int) COST_REDUCTION + "";
            return null;
        }

        @Override
        public boolean affectsOPCosts() {
            return true;
        }
}
