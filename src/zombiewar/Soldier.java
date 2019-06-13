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
public class Soldier implements ICharacter {
    
    
    ICharacter soldier = new SoldierImpl();
        soldier.getName();
        soldier.setHealth(100);
        soldier.setAttackDamage(10);

}
