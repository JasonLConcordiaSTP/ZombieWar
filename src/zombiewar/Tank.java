/*
 * CSC422 - Summer 2019 
 * Zombie War Group Project
 * Authors: Mike Nelson, Myra Ausherman, Peter Vang, Vishal Barot.
 * 
 */
package zombiewar;

/**
 *
 * @author PCV
 */
public class Tank extends Zombie {

    public static int count = 0;
    
    public Tank() {
        setName("Tank " + count++);
        setHealth(150);
        setDamage(20);
    }
}
