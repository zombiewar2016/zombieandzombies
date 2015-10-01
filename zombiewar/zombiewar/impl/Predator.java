package zombiewar.impl;

import zombiewar.intf.ISurvivor;
import zombiewar.intf.IZombie;

public class Predator extends Character implements IZombie{

	public Predator(int health) {
		super(120);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack(ISurvivor survivor) {
		// TODO Auto-generated method stub
		survivor.decreaseHealth(10);
	}

}
