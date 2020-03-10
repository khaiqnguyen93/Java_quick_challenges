package assignment.model;

public class Solution {
	public static void main(String[] args) {
		Duck duck = new Duck();
		duck.canSound();
		duck.canFly();
		duck.canSwim();
		duck.canWalk();

		Chicken chicken = new Chicken();
		chicken.canSound();
		chicken.canWalk();

		Rooster rooster = new Rooster();
		rooster.canSound();
	}
}
