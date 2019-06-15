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
public class Child extends Survivor {
    public static int count = 0;
    
    public Child() {
        setName("Child " + count++);
        setHealth(20);
        setDamage(2);
    }

}
