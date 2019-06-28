/*
 * CSC422 - Summer 2019 
 * Zombie War Group Project
 * Authors: Mike Nelson, Myra Ausherman, Peter Vang, Vishal Barot, Jason Lundquist.
 * 
 */
package zombiewar;

/**
 *
 * @author vishalbarot
 */
public class Child extends Survivor {
    public static int count = 0;
    
    public Child(Weapon w) {
        setName("Child " + count++);
        setHealth(20);
        setDamage(2);
        this.weapon = w;
    }

}
