
package impl;

import intf.ICharacter;
import intf.ICharacterFactory;
/**
 *
 * @author thaoc
 */
public class CharacterFactory implements ICharacterFactory{

	public static final ICharacterFactory instance = new CharacterFactory();

	private CharacterFactory(){

	}

	/**
	 * Make the character.  To support more characters,
	 * simply implement a type and then add a case statement
	 * to this method.
	 * 
	 * @param type The type of character to make.
	 * @return 
	 */

	@Override
	public ICharacter make(String type) {
		switch(type){

		// Zombie Creation
		case "tank"     : return new Tank();
		case "common" : return new CommonInfected();
		case "predator" : return new Predator();

		// Survivor Creation
		case "soldier"  : return new Soldier();
		case "teacher"  : return new Teacher();
		case "student"  : return new Student();
		case "child"    : return new Child();
		}
		return null;
	}

} // End CharactorFactory.java
