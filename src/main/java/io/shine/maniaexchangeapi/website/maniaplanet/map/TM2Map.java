package io.shine.maniaexchangeapi.website.maniaplanet.map;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class TM2Map {
    @Getter
    public String username,mapName,styleName,tagName, replayWRUsername;
    @Getter
    private long trackID,userID;

}
