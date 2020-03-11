package assignment.model;

import assignment.behaviors.Flyable;
import assignment.behaviors.Soundable;
import assignment.behaviors.Walkable;

public class Butterfly extends Insect {

	private Insect form;

	public void checkForm() {
		if (form instanceof ButterflyForm) {
			System.out.println("This is a Butterfly");
			((ButterflyForm) form).canSound();
		} else {
			System.out.println("This is a Caterpillar");
			((CaterpillarForm) form).canFly();
		}
	}

	public Butterfly() {
		form = new CaterpillarForm();
	}

	public void transform() {
		form = new ButterflyForm();
	}

	private class ButterflyForm extends Insect implements Flyable, Soundable {
		@Override
		public void canSound(){
			System.out.println("Can't make any sound");
		}
	}

	private class CaterpillarForm extends Insect implements Walkable, Flyable {
		@Override
		public void canFly(){
			System.out.println("Can't fly");
		}
	}

}
