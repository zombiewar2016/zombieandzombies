package impl;

import intf.ICharacter;
import intf.ISurvivor;
import intf.IZombie;

public class Child extends Character implements ISurvivor{

	Child() {
		super(25, 1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack(IZombie zombie) {
		zombie.decreaseHealth(1);
		
	}


}
