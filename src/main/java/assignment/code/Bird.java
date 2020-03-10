package assignment.code;

import assignment.behavior.Flyable;
import assignment.behavior.Soundable;
import assignment.behavior.Walkable;

public class Bird extends Animal implements Walkable, Flyable, Soundable {

	public void canWalk() {
		System.out.print("I am walking");
	}

	public void canFly() {
		System.out.println("I am flying");
	}

	public void canSound() {
		System.out.println("I am singing");
	}
}
