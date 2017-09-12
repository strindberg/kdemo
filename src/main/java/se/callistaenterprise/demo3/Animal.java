package se.callistaenterprise.demo3;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class Animal {
    private final String sound;

    public Animal(String sound) {
        this.sound = sound;
    }

    @Nullable String getSound() {
        return sound;
    }
}
