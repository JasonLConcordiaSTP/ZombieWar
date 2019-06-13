/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombiewar;

/**
 *
 * @author LUNDQJA
 */
public class ZombieWar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ICharacter Soldier = new Survivor();
        Soldier.getName();
        Soldier.setHealth(100);
        Soldier.setAttackDamage(10);
        
        ICharacter Teacher = new Survivor();
        Teacher.getName();
        Teacher.setHealth(50);
        Teacher.setAttackDamage(5);
        
        ICharacter Child = new Survivor();
        Child.getName();
        Child.setHealth(20);
        Child.setAttackDamage(2);
        
        
    }
    
}
