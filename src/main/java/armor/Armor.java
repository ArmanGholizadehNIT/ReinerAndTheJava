package armor;

import interfaces.Damageable;

/**
 * superclass e Armor ke dar aan:
 * 1) durability va zarib k armor ra migirim
 * 2) mohasebe dmg
 * 3)return kardan durability barai unit-test
 */

public abstract class Armor implements Damageable {
    protected double durability;
    protected double k;

    public Armor(double durability, double k) {
        this.durability = durability;
        this.k = k;
    }

    public double getDurability() {
        return durability;
    }

    public double getK() {
        return k;
    }

    /**
     * har k ta force, 1 durability kam mikonad, pas force/k mikonim va baad gerd mishavad(barai rahati anjam mohasebat)
     *
     * @param force
     * daryafti az karbar
     *
     * @return
     * agar armor hanoz salem bashad false, vagarne true return mikonad
     */
    @Override
    public boolean takeDamage(double force) {
        durability -= force/k;
        durability = Math.round(durability);

        if(durability>0)
            return false;
        else
            return true;

    }
}
