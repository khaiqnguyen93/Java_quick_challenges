package assignment2359;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import assignment.model.Animal;
import assignment.model.Bird;
import assignment.model.Butterfly;
import assignment.model.Cat;
import assignment.model.Chicken;
import assignment.model.Clownfish;
import assignment.model.Dog;
import assignment.model.Dolphin;
import assignment.model.Duck;
import assignment.model.Fish;
import assignment.model.Frog;
import assignment.model.Parrot;
import assignment.model.Rooster;
import assignment.model.Shark;
import assignment.utils.AnimalCountUtils;

public class AnimalCountUtilsTest {
	@Test
	public void countingAnimals() {

		Animal[] animals = new Animal[] { 
				new Bird()
				,new Duck()
				,new Chicken()
				,new Rooster()
				,new Parrot()
				,new Fish()
				,new Shark()
				,new Clownfish()
				,new Dolphin()
				,new Frog()
				,new Dog()
				,new Butterfly()
				,new Cat() };
		AnimalCountUtils animalCountUtils = new AnimalCountUtils(animals);

		assertEquals(2, animalCountUtils.getFlyingAnimal());
		assertEquals(8, animalCountUtils.getWalkingAnimal());
		assertEquals(8, animalCountUtils.getSingAnimal());
		assertEquals(7, animalCountUtils.getSwimmingAnimal());

	}
}
