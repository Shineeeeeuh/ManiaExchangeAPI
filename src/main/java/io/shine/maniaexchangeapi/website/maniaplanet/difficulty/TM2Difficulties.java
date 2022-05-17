package io.shine.maniaexchangeapi.website.maniaplanet.difficulty;

import lombok.AllArgsConstructor;
import lombok.Getter;

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
}
