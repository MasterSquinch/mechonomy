package robots;

import java.util.Random;

public class TaxiDriver implements Robot {
	private int age;
	private int version;
	private int battery;
	
	private int mileage;
	private int gasTankCapacity;
	private int aggression;
	private String model;

	public TaxiDriver(int age, int version, int battery, int mileage, int gasTankCapacity, int aggression, String model) {
		this.age = age;
		this.version = version;
		this.battery = battery;
		this.mileage = mileage;
		this.gasTankCapacity = gasTankCapacity;
		this.aggression = aggression;
		this.model = model;
	}
	
	
	@Override
	public void charge() {
		if (this.battery < 25) {
			this.battery = 100;
			System.out.println("I knew I should have stayed in bed today...");
		}
		else System.out.println("My battery doesn't need to be charged!");

	}

	@Override
	public void upgrade() {
		this.age++;
		this.version++;
		System.out.println("Screw the union! I'm running Vista now!");

	}

	@Override
	public void work() {
		System.out.println(navigateTo("location"));
		while (true) {
			communicate();
		}

	}
	
	private String navigateTo(String location) {
		Random rand = new Random();
		int b = rand.nextInt(10);
		String directions = "";
		for(int i = 0; i <= b ; i++) {
			if (rand.nextInt(3) == 0) {
				directions = directions + "Turn left.";
			} else if (rand.nextInt(3) == 1) {
				directions = directions + "Turn right.";
			} else if (rand.nextInt(3) == 2) {
				directions = directions + "Continue straight.";
			}
		}
		return directions;
	}


	private String communicate() {
		this.aggression ++;
		if (this.aggression < 10) { //I'd use a switch here, but... too much typing.
			
		} else if (10 <= this.aggression && this.aggression < 50) {
			return "Hey, where'm I takin' youse?";
			
		} else if (100 <= this.aggression && this.aggression < 150) {
			return "Whereya headed?";
			
		} else if (150 <= this.aggression && this.aggression < 175) {
			return "You listenin' tuh me?";
			
		} else if (175 <= this.aggression && this.aggression < 190) {
			return "Who dooya think you are?";
			
		} else if (190 <= this.aggression && this.aggression < 200) {
			return "Hey, I'm talkin' to youse!";
			
		} else if (200 <= this.aggression && this.aggression < 205) {
			return "Hey, answer the question!!";
			
		} else if (205 <= this.aggression && this.aggression < 300) {
			return "Listen kid, I'm really not in the mood for this kind of bull- tell me whereya headed, and we can get a move on, or get the hell out of my cab.";
			
		} else if (300 <= this.aggression) {
			return "That's it! I'm CRASHIN' THIS COMPUTER!";
			
		}
		return null;
		
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
	
	public int getMileage() {
		return this.mileage;
	}
	
	public String getModel() {
		return this.model;
	}

}
