/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import intf.ISurvivor;
import intf.IZombie;

/**
 * A soldier is one of the strongest survivor because he wears armor 
 * and carries a weapon.
 * 
 * @author thaoc
 */
public class Soldier extends Character implements ISurvivor{

	/**
	 * A soldier starts with 100 points of health
	 */
	public Soldier() {
		super(100, 4);
	}

	@Override
	public void attack(IZombie zombie) {
		zombie.decreaseHealth(10);
	}
	
	
}
