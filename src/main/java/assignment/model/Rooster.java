package assignment.model;

import assignment.enums.SoundEnums;
import assignment.utils.SoundUtils;

public class Rooster extends Bird {
	private Chicken chicken;

	public Rooster() {
		super(new SoundUtils(SoundEnums.ROOSTER));
		chicken = new Chicken();
	}

	// Don't know if we have another kind of rooster?
	public Rooster(SoundUtils soundUtils) {
		super(soundUtils);
	}

	public void canWalk() {
		chicken.canWalk();
	}
}
