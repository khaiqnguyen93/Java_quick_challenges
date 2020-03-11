package assignment.utils;

import assignment.enums.SoundEnums;

public class SoundUtils {

	private SoundEnums animalSound;

	public SoundUtils(SoundEnums animalSound) {
		this.animalSound = animalSound;
	}

	public void getSound() {
		System.out.println(this.animalSound.getAnimalSound());
	}
}
