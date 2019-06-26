/*
 * CSC422 - Summer 2019 
 * Zombie War Group Project
 * Authors: Mike Nelson, Myra Ausherman, Peter Vang, Vishal Barot, Jason Lundquist.
 * 
 */
package zombiewar;

/**
 *
 * @author mausherm, mike
 */
public abstract class Survivor {

    private int health;
    private int damage;
    private String name;
    private Weapon weapon;

    Survivor() {
    }

    Survivor(int health, int damage, Weapon w) {
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    int getDamage() {
        return this.damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeaponStats(boolean damage) {
        if (this.weapon == null) {
            return 0;
        } else {
            if (damage) {
                return this.weapon.getDamage();
            } else {
                return this.weapon.getAccuracy();
            }
        }
    }
}
