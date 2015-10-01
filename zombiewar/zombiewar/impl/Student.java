package zombiewar.impl;

import zombiewar.intf.ISurvivor;
import zombiewar.intf.IZombie;

public class Student extends Character implements ISurvivor
{

	public Student(int health) {
		super(17);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack(IZombie zombie) {
		// TODO Auto-generated method stub
		zombie.decreaseHealth(5);
		
	}

}
