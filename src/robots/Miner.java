package robots;

import java.util.Random;

import locations.Mine;

public class Miner implements Robot {
	private int age;
	private int version;
	private int battery;
	
	private int cCapacity;
	private int ore;
	private int location;

	
	public Miner(int age, int version, int battery, int cCapacity) {
		this.age = age;
		this.version = version;
		this.battery = battery;
		this.cCapacity = cCapacity;
	}
	
	private int drill(){
		if (this.version < 2) {
			return Mine.getOre(this.location);
			
		}else if (2 <= this.version && this.version < 4) {
			return 2 * Mine.getOre(this.location);
			
		}else if (4 <= this.version && this.version < 6) {
			return 4 * Mine.getOre(this.location);
			
		}else if (6 <= this.version && this.version < 8) {
			return 8 * Mine.getOre(this.location);
			
		}else if (8 <= this.version && this.version < 10) {
			return 16 * Mine.getOre(this.location);
			
		}else if (10 <= this.version) {
			return 32 * Mine.getOre(this.location);
			
		}else {
			return 0;
		}
	}
	
	private void scan() {
if (Mine.getOre(this.location) == 0) {
			System.out.println("There's no ore here.");
		} else if (10 >= Mine.getOre(this.location) &&  Mine.getOre(this.location)  > 0 ){
			System.out.println("There's a small amount of ore here.");
		} else if (30 >= Mine.getOre(this.location) &&  Mine.getOre(this.location)  > 10 ){
			System.out.println("There's a good amount of ore here.");
		}  else if (50 >= Mine.getOre(this.location) &&  Mine.getOre(this.location) > 30 ){
			System.out.println("There's a lot of ore here.");
		} else if ( Mine.getOre(this.location) > 50) {
			System.out.println("There's an absurd amount of ore here.");
		}
	}
	
	void empty() {
		this.ore = 0;
	}
	
	void addOre(){
		if (this.ore + drill() > this.cCapacity) { 
			empty();
			System.out.println("Damn, I overloaded my tank!");
		} else {
			this.ore += drill();
			System.out.println("I found "+drill()+" ore- I now have "+ this.ore +" ore total.");
		}
	}
	
	@Override
	public void charge() {
		if (this.battery < 25) {
			this.battery = 100;
			System.out.println("Ahh! Thanks 5-hour energy!");
		}
		else System.out.println("My battery doesn't need to be charged!");

	}

	@Override
	public void upgrade() {
		this.age++;
		this.version++;
		this.cCapacity += 2 * this.version;
		System.out.println("Maybe Hyperion Corporation will give me a raise now that I'm sporting the newest firmware!");

	}

	@Override
	public void work() {
		Random rand = new Random();
		charge();
		setLocation(rand.nextInt(100));
		System.out.println("Today I'm working in Sector " + this.location);
		scan();
		if (Mine.getOre(this.location) > 0) {
			addOre();
		} else {
			System.out.println("Looks like I've come up empty. Here's to a better tomorrow.");
		}

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

	public int getLocation() {
		return location;
	}
	
	public void setLocation(int location) {
		this.location = location;
	}
}
