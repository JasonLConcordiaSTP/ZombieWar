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

public class Soldier extends Survivor {
    public static int count = 0;
    
    public Soldier (){
        setName("Soldier " + count++);
        setHealth(100);
        setDamage(10);
    }

}
