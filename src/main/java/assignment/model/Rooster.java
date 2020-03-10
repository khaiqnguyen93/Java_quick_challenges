package assignment.model;

public class Rooster extends Bird {
	private Chicken chicken;

	public Rooster() {
		chicken = new Chicken();
	}

	public void canWalk() {
		chicken.canWalk();
	}

	public void canSound() {
		System.out.println("Cock-a-doodle-doo");
	}
}
