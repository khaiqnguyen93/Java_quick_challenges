package assignment.model;

import assignment.behaviors.Flyable;
import assignment.behaviors.Swimable;

public class Duck extends Bird implements Flyable, Swimable {

	public void canSound(){
		System.out.println("Quack, quack");
	}
}
