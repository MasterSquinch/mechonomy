package robots;

import java.util.Random;

public class Researcher implements Robot {
	private int age;
	private int version;
	private int battery;
	
	private boolean tenured;
	private boolean nobelPrizeLaureate;
	
	public Researcher(int age, int version, int battery) {
		this.age = age;
		this.version = version;
		this.battery = battery;
	}
	
	private String research() {
	 return " I've done it! I've discovered that quantum foam is just a vessel for black magic voodoo fuckery";	
	}
	
	private String writePaper() {
		System.out.println("Arrgh! Just one more turn!");
		return null;
	}
	
	private void motivateGradStudent() {
		System.out.println("If this paper isn't done by the end of the night, I'm going to remove your funding- and then you'll never be able to complain at bars that I took credit (and your Nobel prize) for your research!");
	}
	@Override
	public void charge() {
		if (this.battery < 5) {
			this.battery = 100;
			System.out.println("Woah, I must have lost track of time!");
		}
		else System.out.println("Bah! I don't need to charge!");

		
	}

	@Override
	public void upgrade() {
		this.age++;
		this.version++;
		System.out.println("Ahhh... I deserve this.");
	}

	@Override
	public void work() {
		Random rand = new Random();
		if (rand.nextInt(1000) < 25){
			System.out.println("Wow, that was an intense game of Civ V... let me check my calendar... oh jEsUS CHRIST THE DEADLINE IS TOMORROW!?");
			motivateGradStudent();
			research();
			this.tenured = true;
			this.nobelPrizeLaureate = true;
		}
		
		writePaper();
		
	}
	
	public int getVersion() {
		return this.version;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public int getBattery() {
		return this.battery;
	}

}
