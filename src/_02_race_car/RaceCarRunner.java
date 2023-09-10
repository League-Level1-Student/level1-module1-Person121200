package _02_race_car;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */



public class RaceCarRunner {
	public static void main(String[] args) {
		RaceCar raceCar = new RaceCar("Toyota", 5);
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
		
		// 2. Print the RaceCar's position in the race
		System.out.println(raceCar.getPositionInRace());
		// 3. Crash the RaceCar
		raceCar.crash();
		// 4. If the car is damaged. Bring it in for a pit stop.
		if(raceCar.isDamaged()) {
			raceCar.pit();
		}
		// 5. Help the car move into first place.
		while (raceCar.getPositionInRace() >1) {
			raceCar.overtake();
		}

	}
}
