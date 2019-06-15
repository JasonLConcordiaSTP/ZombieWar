/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombiewar;

/**
 *
 * @author mausherm
 */

public abstract class Survivor {
     private int health;
     private int damage;
     private String name;

     public Survivor() {

     }

     public int getHealth() {
         return health;
     }
     public void setHealth(int health) {
         this.health = health;
     }
     public int getDamage() {
         return damage;
     }
     public void setDamage(int damage) {
         this.damage = damage;
     }
     public String getName() {
         return name;
     }
     public void setName(String name) {
         this.name = name;
     }
 }
