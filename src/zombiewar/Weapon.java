/*
 * CSC422 - Summer 2019 
 * Zombie War Group Project
 * Authors: Mike Nelson, Myra Ausherman, Peter Vang, Vishal Barot, Jason Lundquist.
 * 
 */
package zombiewar;

import java.util.Random;

/**
 *
 * @author mike
 */
public abstract class Weapon {
    private int damage, accuracy;
    String name;
    
    //default constructor
    Weapon() {
        this.accuracy = 0;
        this.damage = 0;
    }
    //parameterized constructor
    Weapon(int dmg, int acc) {
        this.accuracy = acc;
        this.damage = dmg;
    }
    
    //getters and setters for damage and accuracy
    public String getName() {
         return name;
     }
    public void setName(String Name) {
         this.name = Name;
     }
    public int getDamage() {
        return damage;
    }
    public void setDamage(int i) {
        this.damage = i;
    }
    
    
    //use this method to calculate effective damage.
    public int getWeaponDamage() {
        Random rand = new Random();
        
         if(rand.nextInt(100) < getAccuracy()){  
             return damage;
         }
         else{
             return 0;
         }
     }
    
    
    public int getAccuracy() {
        return accuracy;
    }
    public void setAccuracy(int i) {
        this.accuracy = i;
    }
}
