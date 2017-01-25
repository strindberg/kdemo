package se.callistaenterprise.java;

public class Animal {
	private final String sound;

	public Animal(String sound) {
		this.sound = sound;
	}

	public void doSound() {
		System.out.println("Sound: " + sound);
	}
}
