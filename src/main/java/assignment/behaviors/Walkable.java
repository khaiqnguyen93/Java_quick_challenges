package assignment.behaviors;

public interface Walkable {
	default void canWalk(){
		System.out.println("I am walking");
	}
}
