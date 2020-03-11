package assignment.model;

import assignment.enums.SoundEnums;
import assignment.utils.SoundUtils;

public class Chicken extends Bird {
	public Chicken() {
		super(new SoundUtils(SoundEnums.CHICKEN));
	}

	// Constructor with param for chicken have different sound
	public Chicken(SoundUtils soundUtils) {
		super(soundUtils);
	}

}
