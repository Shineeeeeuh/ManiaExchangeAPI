package io.shine.maniaexchangeapi.website.maniaplanet.map;

import io.shine.maniaexchangeapi.website.maniaplanet.tag.TM2Tags;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class TM2Map {
    @Getter
    public String username,mapName,styleName,replayWRUsername;
    @Getter
    private long trackID,userID;
    @Getter
    private int awards;
    @Getter
    private TM2Tags[] tags;

}
