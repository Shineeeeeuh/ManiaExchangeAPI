package io.shine.maniaexchangeapi.website.maniaplanet.tag;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum TM2Tags {
    //BASED ON https://tm.mania.exchange/api/tags/gettags

    Race(1, "Race", ""),
    FullSpeed(2, "FullSpeed", ""),
    Tech(3, "Tech", ""),
    RPG(4, "RPG", ""),
    LOL(5, "LOL", ""),
    PF(6, "Press Forward", ""),
    SpeedTech(7, "Speedtech", ""),
    MultiLap(8, "MultiLap", ""),
    OffRoad(9, "Offroad", "805000");

    @Getter
    private int id;
    @Getter
    private String name, color;
}
