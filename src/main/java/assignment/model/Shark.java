package assignment.model;

import assignment.behaviors.FishBehaviors;

public class Shark extends Fish implements FishBehaviors {

	@Override
	public void doSomething() {
		System.out.println("Sharks eat other fish");
	}

	@Override
	public String size() {
		return "large";
	}

	@Override
	public String color() {
		return "grey";
	}

}
