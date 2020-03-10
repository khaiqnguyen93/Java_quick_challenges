package assignment.behaviors;

public interface Swimable {
	default void canSwim(){
		System.out.println("I am swimming");
	}
}
