package impl;

import intf.ISurvivor;
import intf.IZombie;

/**
 * The Tank is one of the biggest and meanness zombie in the game.
 * He has a lot of health and will take down multiple survivors.  
 * 
 * @author thaoc
 */
public class Tank extends Character implements IZombie{

	/**
	 * A tank starts with 150 points of health
	 */
	public Tank() {
		super(150, 2);
	}

	/**
	 * An attack from the tank decrease a survivor's health by 20 points.
	 * @param survivor 
	 */
	@Override
	public void attack(ISurvivor survivor) {
		survivor.decreaseHealth(20);
	}
	
}
