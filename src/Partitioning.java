/*
 Jackson Frank
 File: Partitioning.java
 Purpose: To partition a list of integers 
 */

import java.util.*;

public class Partitioning {

	public static void main(String[] args) {
		List<Integer> part = new ArrayList<Integer>();
		int E = 13;
		
		//sets the list to a random length between 10 and 25
		Random rand = new Random();
		int limit = rand.nextInt(15) + 10;
		
		//adds random integers between 0 and 30 to the list
		for(int i = 0; i < limit; i++) {
			part.add(rand.nextInt(30));
		}
		
		//sends the list and the partition integer to the method that will
		//partition the list
		partition(part, E);
		
		System.out.println(part);
	}
	
	public static void partition(List<Integer> part, int E) {
		
	}

}
