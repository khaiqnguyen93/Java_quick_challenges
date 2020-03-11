package assignment.model;

import assignment.behaviors.Soundable;
import assignment.behaviors.Swimable;
import assignment.behaviors.Walkable;
import assignment.enums.SoundEnums;
import assignment.utils.SoundUtils;

public class Frog extends Animal implements Walkable, Swimable, Soundable {

	private SoundUtils soundUtils;

	public Frog() {
		this.soundUtils = new SoundUtils(SoundEnums.FROG);
	}

	public Frog(SoundUtils soundUtils) {
		this.soundUtils = soundUtils;
	}

	@Override
	public void canSound() {
		soundUtils.getSound();
	}


}
