package utils;

import java.util.Random;

public class Dice {
	
	/**
	 * a random object constant 
	 */
	private static final Random RANDOM = new Random();

	/**
	 * @return an integer between 1-3
	 */
	public static int De3() {
		return RANDOM.nextInt(3)+1;
	}

	public static int De3(int nombreDes) {
		int somme = 0;
		for (int i = 0; i < nombreDes; i++) {
			somme = somme + De3();
	 }
		return somme;
	}
}
