package io.shine.maniaexchangeapi.website.maniaplanet.tag;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum TM2Tags {
    //BASED ON https://tm.mania.exchange/api/tags/gettags

    Race(1, "Race", "");
    @Getter
    private int id;
    @Getter
    private String name, color;
}
