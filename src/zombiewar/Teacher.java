/*
 * CSC422 - Summer 2019 
 * Zombie War Group Project
 * Authors: Mike Nelson, Myra Ausherman, Peter Vang, Vishal Barot.
 * 
 */
package zombiewar;

/**
 *
 * @author vishalbarot
 */
public class Teacher extends Survivor {
    public static int count = 0;
    
    public Teacher(){
        setName("Teacher " + count++);
        setHealth(50);
        setDamage(5);
    }
}
