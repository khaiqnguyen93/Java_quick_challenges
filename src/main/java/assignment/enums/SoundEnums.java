package assignment.enums;

public enum SoundEnums {
	DEFAULT("I am singing"),
    DUCK("Quack, quack"),
    CHICKEN("Cluck, cluck"),
    ROOSTER("Cock-a-doodle-doo"),
    DOG("Woof, woof"),
    CAT("Meow");

	private String animalSound;

	private SoundEnums(String animalSound) {
		this.animalSound = animalSound;
	}

	public String getAnimalSound() {
		return this.animalSound;
	}

}
