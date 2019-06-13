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
     * @param hp 
     */    
    public void setHealth(int hp);
    /**
     * Returns damage amount to deal to enemy
     * @return current character's attackDamage
     */
    public int getAttackDamage();
    /**
     * Returns name of current character
     * @return String of current character's name
     */
    public String getName();
    
    public void setAttackDamage(int ap);
    

//    public void getName(String string);
}