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
public class CharacterFactory implements ICharacterFactory{
  
  public static final ICharacterFactory instance = new CharacterFactory();
  
  private CharacterFactory(){
   
  }

  
  //@Override
  public ICharacter createCharacter(String createType) {
    switch(createType){
      case "child"    		: return (ICharacter) new Child();
      
      case "teacher"          	: return (ICharacter) new Teacher();
      case "soldier"  		: return (ICharacter) new Soldier();
      case "commonInfected"   	: return (ICharacter) new CommonInfected();
      case "tank"     		: return (ICharacter) new Tank();

  }
    return null;
  }
  
}
