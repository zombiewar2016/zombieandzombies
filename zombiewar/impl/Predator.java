package zombiewar.impl;

import zombiewar.intf.ISurvivor;
import zombiewar.intf.IZombie;

public class Predator extends Character implements IZombie{

	public Predator()
	{
		super(120);
	}

	@Override
	public void attack(ISurvivor survivor)
	{
		survivor.decreaseHealth(10);
		
	}

}
