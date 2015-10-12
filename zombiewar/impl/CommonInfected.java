package impl;

import intf.ISurvivor;
import intf.IZombie;

public class CommonInfected extends Character implements IZombie{

	public CommonInfected() {
		super(100, 1);
	}

	@Override
	public void attack(ISurvivor survivor) {
		survivor.decreaseHealth(5);
	}

}
