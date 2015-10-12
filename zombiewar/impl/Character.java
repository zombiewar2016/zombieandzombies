package impl;

import intf.ICharacter;

public abstract class Character implements ICharacter{
	
	private int health;
	private int attackStrength;
	private int index;
	
	Character(int health, int attack){
		this.health = health;
		attackStrength = attack;
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
	public int getAttackStrength(){
		return attackStrength;
	}
	public void Attack(ICharacter target){
		target.decreaseHealth(attackStrength);
	}
	public int getIndex(){
		return index;
	}
	public void setIndex(int index){
		this.index = index;
	}
}
