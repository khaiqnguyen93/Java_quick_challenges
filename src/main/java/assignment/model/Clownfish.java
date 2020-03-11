package assignment.model;

import assignment.behaviors.FishBehaviors;

public class Clownfish extends Fish implements FishBehaviors {

	@Override
	public void doSomething() {
		System.out.println("Clownfish make jokes");
	}

	@Override
	public String size() {
		return "small";
	}

	@Override
	public String color() {
		return "orange";
	}

}
