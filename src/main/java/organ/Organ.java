package organ;

import armor.Armor;
import interfaces.Damageable;

/**
 * superclass organ darai method organ,getHP,getArmor,takeDamage
 * ke az in superclass barai saakht e andaam titan estefade mikonim
 */

public abstract class Organ implements Damageable {
    protected double hp;
    protected Armor armor;

    /**
     * set kardan hp va armor daryaft shode az karbar be variable local
     * @param hp
     * @param armor
     */
    public Organ(double hp, Armor armor) {
        this.hp = hp;
        this.armor = armor;
    }

    /**
     * return kardan e hp barai unit test
     * @return
     */
    public double getHp() {
        return hp;
    }

    /**
     * return kardan armor barai estefade az getDurability dar unit-test
     * @return
     */
    public Armor getArmor() {
        return armor;
    }

    /**
     * formule mohasebe dmg bar asas documentation daade shode
     *
     * @param force
     *
     * @return
     * agar organ hanoz salem bashad false, va dar gheir in soorat true return mikonad
     */
    @Override
    public boolean takeDamage(double force) {

        hp -= force*(100-armor.getDurability()/2)/100;



        if(hp>0)
            return false;
        else
            return true;

    }


}
