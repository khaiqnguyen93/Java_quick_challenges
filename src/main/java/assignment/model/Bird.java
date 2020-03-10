package assignment.model;

import assignment.behaviors.Soundable;
import assignment.behaviors.Walkable;

public class Bird extends Animal implements Walkable, Soundable {

	public void canSound() {
		System.out.println("I am singing");
	}
}
