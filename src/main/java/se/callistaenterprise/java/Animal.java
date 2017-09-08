package se.callistaenterprise.java;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class Animal {
    private final String sound;

    public Animal(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }
}
