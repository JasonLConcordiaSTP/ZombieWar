/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
