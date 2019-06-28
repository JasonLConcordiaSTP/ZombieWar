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

public class Soldier extends Survivor {
    public static int count = 0;
    
    public Soldier (){
        setName("Soldier " + count++);
        setHealth(100);
        setDamage(10);
    }

}
