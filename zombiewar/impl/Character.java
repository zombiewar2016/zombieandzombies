package impl;

import intf.ICharacter;

public abstract class Character implements ICharacter{
	
	private int health;
	
	Character(int health){
		this.health = health;
	}

	@Override
	public void decreaseHealth(int increment) {
		health-=increment;
	}

	@Override
	public boolean isAlive() {
		return (health > 0);
	}
	
	public int getHealth(){
		return health;
	}
	public void setHealth(int health){
		this.health = health;
	}
}
