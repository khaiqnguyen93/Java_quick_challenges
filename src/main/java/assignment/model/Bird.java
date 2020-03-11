package assignment.model;

import assignment.behaviors.Soundable;
import assignment.behaviors.Walkable;
import assignment.enums.SoundEnums;
import assignment.utils.SoundUtils;

public class Bird extends Animal implements Walkable, Soundable {

	private SoundUtils soundUtils;

	public Bird() {
		this.soundUtils = new SoundUtils(SoundEnums.DEFAULT);
	}

	public Bird(SoundUtils soundUtils) {
		this.soundUtils = soundUtils;
	}

	public void canSound() {
		soundUtils.getSound();
	}
}
