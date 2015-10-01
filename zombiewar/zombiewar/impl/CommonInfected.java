package zombiewar.impl;

import zombiewar.intf.ISurvivor;
import zombiewar.intf.IZombie;

public class CommonInfected extends Character implements IZombie{

	public CommonInfected(int health) {
		super(100);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack(ISurvivor survivor) {
		survivor.decreaseHealth(10);
	}

}
