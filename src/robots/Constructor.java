package robots;

import java.util.Random;

public class Constructor implements Robot {
	private int age;
	private int version;
	private int battery;
	
	private int lCapacity;
	
	public Constructor(int age, int version, int battery, int lCapacity) {
		this.age = age;
		this.version = version;
		this.battery = battery;
		this.lCapacity = lCapacity;
	}
	
	private String hammer() {
		return "Can't touch this.";
	}
	
	
	@Override
	public void charge() {
		if (this.battery < 25) {
			this.battery = 100;
			System.out.println("All in a good day's work!");
		}
		else System.out.println("My battery doesn't need to be charged!");

	}

	@Override
	public void upgrade() {
		this.age++;
		this.version++;
		System.out.println("I'm getting too old for this... my hardware can't keep up.");

	}

	@Override
	public void work() {
		Random rand = new Random();
		for (int i = 0 ; i <= 100; i++){
			if (rand.nextInt(i + age) > rand.nextInt(50)) {
				System.out.println("Bang!");
				System.out.println(hammer());
			} else {
				System.out.println("Grunt!");
			}
		}
		System.out.println("Whew! I'm sure glad I didn't have to use that SawZawTM today.");

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
