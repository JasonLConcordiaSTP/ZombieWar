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
public class CommonInfected extends Zombie {
    public static int count = 0;
    
    public CommonInfected() {
        setName("CommonInfected " + count++);
        setHealth(30);
        setDamage(5);
    }
    
}
