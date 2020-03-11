package assignment.model;

import assignment.behaviors.Flyable;
import assignment.utils.SoundUtils;

public class Parrot extends Bird implements Flyable {
	public Parrot() {
		super();
	}

	public Parrot(SoundUtils soundUtils){
		super(soundUtils);
	}
}
