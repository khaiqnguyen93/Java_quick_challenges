package assignment.utils;

import assignment.behaviors.Flyable;
import assignment.behaviors.Soundable;
import assignment.behaviors.Swimable;
import assignment.behaviors.Walkable;
import assignment.model.Animal;

public class AnimalCountUtils {
	Animal[] animals;
	int flyingAnimal = 0;
	int walkingAnimal = 0;
	int singAnimal = 0;
	int swimmingAnimal = 0;

	public AnimalCountUtils(Animal[] animals) {
        this.animals = animals;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Flyable) {
                flyingAnimal += 1;
            }
            if (animals[i] instanceof Walkable) {
                walkingAnimal += 1;
            }
            if (animals[i] instanceof Soundable) {
                singAnimal += 1;
            }
            if (animals[i] instanceof Swimable) {
                swimmingAnimal += 1;
            }
        }
    }

	public Animal[] getAnimals() {
		return animals;
	}

	public int getFlyingAnimal() {
		return flyingAnimal;
	}

	public int getWalkingAnimal() {
		return walkingAnimal;
	}

	public int getSingAnimal() {
		return singAnimal;
	}

	public int getSwimmingAnimal() {
		return swimmingAnimal;
	}
}
