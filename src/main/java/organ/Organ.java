package organ;

import armor.Armor;
import interfaces.Damageable;

public abstract class Organ implements Damageable {
    protected double hp;
    protected Armor armor;

    public Organ(double hp, Armor armor) {
        this.hp = hp;
        this.armor = armor;
    }

    public double getHp() {
        return hp;
    }

    public Armor getArmor() {
        return armor;
    }

    @Override
    public boolean takeDamage(double force) {

        hp -= force*(100-armor.getDurability()/2)/100;



        if(hp>0)
            return false;
        else
            return true;

    }

    private double calcResist(double x) {
        return -1;
    }
}
