package se.callistaenterprise.java;

public class AnAnimal {
	private final String sound;

	public AnAnimal(String sound) {
		this.sound = sound;
	}

	public void makeSound() {
		System.out.println("Sound: " + sound);
	}
}
