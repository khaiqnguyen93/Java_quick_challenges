package assignment.model;

import assignment.enums.SoundEnums;
import assignment.utils.SoundUtils;

public class Solution {
	public static void main(String[] args) {
		Duck duck = new Duck();
		duck.canSound();
		duck.canFly();
		duck.canSwim();
		duck.canWalk();
		System.out.println("===");

		Chicken chicken = new Chicken();
		chicken.canSound();
		chicken.canWalk();
		System.out.println("===");

		Rooster rooster = new Rooster();
		rooster.canSound();
		rooster.canWalk();
		System.out.println("===");

		//Test all case with parrot
		new Parrot().canSound(); // Default parrot
		new Parrot(new SoundUtils(SoundEnums.DOG)).canSound(); // Parrot live near dog
		new Parrot(new SoundUtils(SoundEnums.CAT)).canSound(); // Parrot live near cat
		new Parrot(new SoundUtils(SoundEnums.ROOSTER)).canSound(); // Parrot live near rooster
		System.out.println("===");

		//Fish
		Fish fish = new Fish();
		fish.canSwim();
		System.out.println("===");

		//Shark and Clownfish
		Shark shark = new Shark();
		System.out.println("Sharks are " + shark.size() + " and " + shark.color());
		shark.doSomething();

		Clownfish clowfish = new Clownfish();
		System.out.println("Clownfish are " + clowfish.size()  + " and " + clowfish.color());
		clowfish.doSomething();
	}
}
