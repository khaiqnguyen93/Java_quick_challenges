package assignment.model;

import assignment.behaviors.Soundable;
import assignment.behaviors.Walkable;
import assignment.enums.SoundEnums;
import assignment.utils.SoundUtils;

public class Cat extends Animal implements Soundable, Walkable {

	private SoundUtils soundUtils;

	public Cat() {
		this.soundUtils = new SoundUtils(SoundEnums.CAT);
	}

	public Cat(SoundUtils soundUtils) {
		this.soundUtils = soundUtils;
	}

	@Override
	public void canSound() {
		soundUtils.getSound();
	}
}
