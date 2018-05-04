package locations;

import java.util.Random;

public class Mine {

	public static int getOre(int location) {
		Random rand = new Random();
		
		switch (location) {
			case 0: return rand.nextInt(10);
			case 1: return rand.nextInt(10);
			case 2: return rand.nextInt(10);
			case 3: return rand.nextInt(10);
			case 4: return rand.nextInt(10);
			case 5: return rand.nextInt(10);
			case 6: return rand.nextInt(10);
			case 7: return rand.nextInt(10);
			case 8: return rand.nextInt(10);
			case 9: return rand.nextInt(10);
			
			case 10: return rand.nextInt(20);
			case 11: return rand.nextInt(20);
			case 12: return rand.nextInt(20);
			case 13: return rand.nextInt(20);
			case 14: return rand.nextInt(20);
			case 15: return rand.nextInt(20);
			case 16: return rand.nextInt(20);
			case 17: return rand.nextInt(20);
			case 18: return rand.nextInt(20);
			case 19: return rand.nextInt(20);
			
			case 20: return rand.nextInt(30);
			case 21: return rand.nextInt(30);
			case 22: return rand.nextInt(30);
			case 23: return rand.nextInt(30);
			case 24: return rand.nextInt(30);
			case 25: return rand.nextInt(30);
			case 26: return rand.nextInt(30);
			case 27: return rand.nextInt(30);
			case 28: return rand.nextInt(30);
			case 29: return rand.nextInt(30);
			
			case 30: return rand.nextInt(40);
			case 31: return rand.nextInt(40);
			case 32: return rand.nextInt(40);
			case 33: return rand.nextInt(40);
			case 34: return rand.nextInt(40);
			case 35: return rand.nextInt(40);
			case 36: return rand.nextInt(40);
			case 37: return rand.nextInt(40);
			case 38: return rand.nextInt(40);
			case 39: return rand.nextInt(40);
			
			case 40: return rand.nextInt(50);
			case 41: return rand.nextInt(50);
			case 42: return rand.nextInt(50);
			case 43: return rand.nextInt(50);
			case 44: return rand.nextInt(50);
			case 45: return rand.nextInt(50);
			case 46: return rand.nextInt(50);
			case 47: return rand.nextInt(50);
			case 48: return rand.nextInt(50);
			case 49: return rand.nextInt(50);
			
			case 50: return rand.nextInt(60);
			case 51: return rand.nextInt(60);
			case 52: return rand.nextInt(60);
			case 53: return rand.nextInt(60);
			case 54: return rand.nextInt(60);
			case 55: return rand.nextInt(60);
			case 56: return rand.nextInt(60);
			case 57: return rand.nextInt(60);
			case 58: return rand.nextInt(60);
			case 59: return rand.nextInt(60);
			
			case 60: return rand.nextInt(70);
			case 61: return rand.nextInt(70);
			case 62: return rand.nextInt(70);
			case 63: return rand.nextInt(70);
			case 64: return rand.nextInt(70);
			case 65: return rand.nextInt(70);
			case 66: return rand.nextInt(70);
			case 67: return rand.nextInt(70);
			case 68: return rand.nextInt(70);
			case 69: return rand.nextInt(70);
			
			case 70: return rand.nextInt(80);
			case 71: return rand.nextInt(80);
			case 72: return rand.nextInt(80);
			case 73: return rand.nextInt(80);
			case 74: return rand.nextInt(80);
			case 75: return rand.nextInt(80);
			case 76: return rand.nextInt(80);
			case 77: return rand.nextInt(80);
			case 78: return rand.nextInt(80);
			case 79: return rand.nextInt(80);
			
			case 80: return rand.nextInt(90);
			case 81: return rand.nextInt(90);
			case 82: return rand.nextInt(90);
			case 83: return rand.nextInt(90);
			case 84: return rand.nextInt(90);
			case 85: return rand.nextInt(90);
			case 86: return rand.nextInt(90);
			case 87: return rand.nextInt(90);
			case 88: return rand.nextInt(90);
			case 89: return rand.nextInt(90);
			
			case 90: return rand.nextInt(100);
			case 91: return rand.nextInt(100);
			case 92: return rand.nextInt(100);
			case 93: return rand.nextInt(100);
			case 94: return rand.nextInt(100);
			case 95: return rand.nextInt(100);
			case 96: return rand.nextInt(100);
			case 97: return rand.nextInt(100);
			case 98: return rand.nextInt(100);
			case 99: return rand.nextInt(100);
			
			default: return 10;
		}
	}

}
