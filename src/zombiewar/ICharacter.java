/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombiewar;

/**
 *
 * @author Mike: nelsonm25@csp.edu
 */
public interface ICharacter {
    /**
     * Returns health of current character
     * @return this character's current health
     */
    public int getHealth();
    /**
     * Sets health of current character
     * @param health 
     */    
    public void setHealth(int health);
    /**
     * Returns damage amount to deal to enemy
     * @return current character's attackDamage
     */
    public int getDamage();
    /**
     * Sets attack damage of current character
     * @param damage 
     */
    public void setDamage(int damage);
    /**
     * Returns name of current character
     * @return String of current character's name
     */
    public String getName();
}
