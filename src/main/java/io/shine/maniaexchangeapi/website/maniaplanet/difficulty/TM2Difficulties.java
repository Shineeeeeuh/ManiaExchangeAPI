package io.shine.maniaexchangeapi.website.maniaplanet.difficulty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public enum TM2Difficulties {
    Beginner("Beginner", 0);

    @Getter
    private String name;
    @Setter
    private int value;
}
