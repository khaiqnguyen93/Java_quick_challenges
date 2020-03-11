package assignment.model;

import assignment.behaviors.Soundable;
import assignment.behaviors.Swimable;
import assignment.behaviors.Walkable;
import assignment.enums.SoundEnums;
import assignment.utils.SoundUtils;

public class Dog extends Animal implements Walkable, Soundable, Swimable {

	private SoundUtils soundUtils;

	public Dog() {
		this.soundUtils = new SoundUtils(SoundEnums.DOG);
	}

	public Dog(SoundUtils soundUtils) {
		this.soundUtils = soundUtils;
	}

	@Override
	public void canSound() {
		soundUtils.getSound();
	}

}
