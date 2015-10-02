package zombiewar.impl;

import zombiewar.intf.ISurvivor;
import zombiewar.intf.IZombie;

public class Child extends Character implements ISurvivor{

	Child() {
		super(25);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack(IZombie zombie) {
		zombie.decreaseHealth(1);
		
	}

}
