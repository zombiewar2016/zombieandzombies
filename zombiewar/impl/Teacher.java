package impl;

import intf.ISurvivor;
import intf.IZombie;

public class Teacher extends Character implements ISurvivor{

	Teacher() {
		super(90);
	}

	@Override
	public void attack(IZombie zombie) {
		zombie.decreaseHealth(10);
		
	}

}
