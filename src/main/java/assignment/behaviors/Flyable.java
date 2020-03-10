package assignment.behaviors;

public interface Flyable {
	default void canFly(){
		System.out.println("I am flying");
	}
}
