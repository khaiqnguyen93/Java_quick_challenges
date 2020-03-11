package assignment.model;

import assignment.behaviors.Flyable;
import assignment.behaviors.Swimable;
import assignment.enums.SoundEnums;
import assignment.utils.SoundUtils;

public class Duck extends Bird implements Flyable, Swimable {

	public Duck() {
		super(new SoundUtils(SoundEnums.DUCK));
	}

	// Constructor with param for duck have different sound
	public Duck(SoundUtils soundUtils) {
		super(soundUtils);
	}
}
