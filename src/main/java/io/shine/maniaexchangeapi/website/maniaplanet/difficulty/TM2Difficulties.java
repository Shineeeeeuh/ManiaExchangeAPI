package io.shine.maniaexchangeapi.website.maniaplanet.difficulty;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.Optional;

@AllArgsConstructor
public enum TM2Difficulties {
    Beginner("Beginner", 0),
    Intermediate("Intermediate", 1),
    Advanced("Advanced", 2),
    Expert("Expert", 3),
    Lunatic("Lunatic", 4),
    Impossible("Impossible", 5);

    @Getter
    private String name;
    @Getter
    private int value;

    public static Optional<TM2Difficulties> getDifficulties(int id){
        return Arrays.stream(values()).filter(d -> d.getValue() == id).findFirst();
    }
}
