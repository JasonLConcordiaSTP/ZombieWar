/*
 * CSC422 - Summer 2019 
 * Zombie War Group Project
 * Authors: Mike Nelson, Myra Ausherman, Peter Vang, Vishal Barot.
 * 
 */

package zombiewar;

/**
 *
 * @author LUNDQJA
 */

import java.util.*;
import java.util.Random;


public class ZombieWar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        List<Survivor> survivorList = new ArrayList<>();
        List<Zombie> zombieList = new ArrayList<>();
        
        //Create random Survivors and Zombies
        Random rand = new Random();
        int survivorCount = rand.nextInt(10) + 20;
        int zombieCount = rand.nextInt(10) + 10;

        for (int i = 0; i < survivorCount; i++) {
            survivorList.add(createSurvivor());
        }
        
        for (int i = 0; i < zombieCount; i++) {
            zombieList.add(createZombie());
        }
        
        //Console output
        System.out.println("We have " + survivorList.size() + " survivors trying to make it to safety.");
        System.out.println("But there are " + zombieList.size() + " zombies waiting for them.");
        
        // Contiue when survivors and zombies exist.
        while((zombieList.size() > 0) && (survivorList.size() > 0)) {
       
            for (Survivor survivor : survivorList) {
                // survivor attack
                int damage = survivor.getDamage();
                
                for (int i = 0;i<zombieList.size();i++) {
                    
                    zombieList.get(i).setHealth(zombieList.get(i).getHealth() - damage);

                    if (zombieList.get(i).getHealth() <= 0) {
                        zombieList.remove(i);
                    }
                    // check for zombie
                    if (zombieList.isEmpty()) {
                        break;
                    }
                }
            }

            // Zombies attack
            for (Zombie zombie : zombieList) {
                int damage = zombie.getDamage();
                
                for (int i = 0;i<survivorList.size();i++) {
                    survivorList.get(i).setHealth(survivorList.get(i).getHealth() - damage);
                    if (survivorList.get(i).getHealth() <= 0) {
                        survivorList.remove(i);
                    }
                    // check for last survivor.
                    if (survivorList.isEmpty()) {
                        break;
                    }
                }
            }
        }
        
        if (survivorList.size() > 0) {
            System.out.println("It seems " + survivorList.size() + " have made it to safety.");
        }
        else {
            System.out.println("None of the survivors made it.");
        }
        
    }
    
   //character factory classes
    
    private static Zombie createZombie() {
        Random rand = new Random();
        int characterType = rand.nextInt(2);
        switch (characterType) {
            case 0: 
                return new CommonInfected();
            default:
                return new Tank();
        }
    }
    
    private static Survivor createSurvivor() {
        Random rand = new Random();
        int characterType = rand.nextInt(3);
        switch (characterType) {
            case 0: 
                return new Child();
            case 1:
                return new Teacher();
            default:
                return new Soldier();
        }
    }
    
}
