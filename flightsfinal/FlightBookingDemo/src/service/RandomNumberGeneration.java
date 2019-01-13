package service;

import java.util.Random;

public class RandomNumberGeneration {

	public int generate() {
		// TODO Auto-generated method stub
		Random rand = new Random();
		return rand.nextInt(50) + 1;
	}
    
}
