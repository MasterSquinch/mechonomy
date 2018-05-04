package mechonomy;

import robots.*;

public class mechonomy {
 static TaxiDriver driver = new TaxiDriver(1, 1, 100, 60, 100, 0, "one of those cars");
 static Researcher professor= new Researcher(1, 1, 100);
 static Constructor worker = new Constructor(1, 1, 100, 500);
 static Miner dude = new Miner(1, 1, 1, 50);

public static void main(String[] args) {
	dude.work();
	professor.work();
	worker.work();
	driver.work();
}

}
