package impl;

import intf.ISurvivor;
import intf.IZombie;

public class Student extends Character implements ISurvivor{

	Student() {
		super(70, 3);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack(IZombie zombie) {
		zombie.decreaseHealth(5);
		
	}

}
