package assignment2359;

import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import assignment.code.Bird;

public class BirdTest {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;

	@Before
	public void setUpStreams() {
		System.setOut(new PrintStream(outContent));
	}

	@After
	public void restoreStreams() {
		System.setOut(originalOut);
	}

	@Test
	public void testWalk() {
		Bird bird = new Bird();
		bird.canWalk();
		assertThat(outContent.toString(), containsString("I am walking"));
	}

	@Test
	public void testFly() {
		Bird bird = new Bird();
		bird.canFly();
		assertThat(outContent.toString(), containsString("I am flying"));
	}

	@Test
	public void testSing() {
		Bird bird = new Bird();
		bird.canSound();
		assertThat(outContent.toString(), containsString("I am singing"));
	}

}
