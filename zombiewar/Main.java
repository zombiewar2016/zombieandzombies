

import impl.CharacterFactory;
import intf.ICharacter;
import intf.ICharacterFactory;
import intf.ISurvivor;
import intf.IZombie;

/**
 *
 * @author thaoc
 */
public class Main {

	private static final ICharacterFactory factory = CharacterFactory.instance;

	public static IZombie[] randomZombies() {
		int numZombies = (int) (Math.random() * 10);
		IZombie[] zombies = new IZombie[numZombies];
		int[] index = {1,1,1};
		for (int i = 0; i < zombies.length; i++) {
			int zombieType = (int) (Math.random() * 3);
			switch(zombieType){
			case 0: zombies[i] = (IZombie) factory.make("common"); 
			zombies[i].setIndex(index[0]);
			index[0]++;
			break;
			case 1: zombies[i] = (IZombie) factory.make("tank"); 
			zombies[i].setIndex(index[1]);
			index[1]++;
			break;
			case 2: zombies[i] = (IZombie) factory.make("predator"); 
			zombies[i].setIndex(index[2]);
			index[2]++;
			break;
			}
		}
		return zombies;
	}

	public static ISurvivor[] randomSurvivors() {
		int numZombies = (int) (Math.random() * 20);
		ISurvivor[] survivors = new ISurvivor[numZombies];
		int[] index = {1,1,1,1};
		for (int i = 0; i < survivors.length; i++) {
			int type = (int) (Math.random() * 4);
			switch(type){
			case 0: survivors[i] = (ISurvivor)  factory.make("soldier");
			survivors[i].setIndex(index[0]);
			index[0]++;
			break;
			case 1: survivors[i] = (ISurvivor) factory.make("teacher"); 
			survivors[i].setIndex(index[1]);
			index[1]++;
			break;
			case 2: survivors[i] = (ISurvivor) factory.make("student"); 
			survivors[i].setIndex(index[2]);
			index[2]++;
			break;
			case 3: survivors[i] = (ISurvivor) factory.make("child"); 
			survivors[i].setIndex(index[3]);
			index[3]++;
			break;
			}
		}
		return survivors;
	}

	public static boolean allDead(ICharacter[] characters){
		boolean allDead = true;
		for(int i=0; i<characters.length; i++){
			if (characters[i] != null)
			{
				allDead &= !characters[i].isAlive();
			}else{
				System.out.println("Null found");
			}
		}
		return allDead;
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		IZombie[] zombies = randomZombies();
		ISurvivor[] survivors = randomSurvivors();

		System.out.println("We have " + survivors.length + " survivors trying to make it to safety.");
		System.out.println("But there are " + zombies.length + " zombies waiting for them.");

		//TODO: the survivors attack first.  One characte attack each zombie.
		//      When all the survivors have done attacking, it's the zombies' 
		//      turn to attack.  For each zombie that is still alive, attack
		//      each suvivor that is still alive.  Repeat this cycle until
		//      all the zombies are all dead or all the survivors are all dead.

		FightResolution(survivors, zombies);

		if (allDead(survivors)) {
			System.out.println("None of the survivors made it.");
		} else {
			int count = 0;
			for(int i=0; i<survivors.length; i++) {
				if (survivors[i] != null)
				{
					if (survivors[i].isAlive()) count++;
				}
			}
			System.out.println("It seems " + count + " have made it to safety.");
		}
	}

	public static void FightResolution(ISurvivor[] survivors, IZombie[] zombies){
		while(!allDead(survivors)&&!allDead(zombies)){
			for(int survivorIndex=0; survivorIndex<survivors.length; survivorIndex++){
				for(int zombieIndex=0; zombieIndex<zombies.length; zombieIndex++){
					if(zombies[zombieIndex].getHealth()>0 && survivors[survivorIndex].getHealth()>0){
						survivors[survivorIndex].attack(zombies[zombieIndex]);
						if(zombies[zombieIndex].getHealth()<=0) 
							System.out.println(survivors[survivorIndex].getClass().getSimpleName()+" "+survivors[survivorIndex].getIndex()+" killed "+
									zombies[zombieIndex].getClass().getSimpleName()+" "+zombies[zombieIndex].getIndex());
					}
				}
			}
			for(int zombieIndex=0; zombieIndex<zombies.length; zombieIndex++){
				for(int survivorIndex=0; survivorIndex<survivors.length; survivorIndex++){
					if(zombies[zombieIndex].getHealth()>0 && survivors[survivorIndex].getHealth()>0){
						zombies[zombieIndex].attack(survivors[survivorIndex]);
						if(survivors[survivorIndex].getHealth()<=0) 
							System.out.println(zombies[zombieIndex].getClass().getSimpleName()+" "+zombies[zombieIndex].getIndex()+" killed "+
									survivors[survivorIndex].getClass().getSimpleName()+" "+survivors[survivorIndex].getIndex());
					}
				}
			}
		}
	}

}
