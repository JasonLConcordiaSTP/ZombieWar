/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
