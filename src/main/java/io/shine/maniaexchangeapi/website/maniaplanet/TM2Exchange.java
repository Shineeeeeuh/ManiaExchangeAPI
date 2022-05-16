package io.shine.maniaexchangeapi.website.maniaplanet;

import io.shine.maniaexchangeapi.website.WebSite;
import io.shine.maniaexchangeapi.website.maniaplanet.map.TM2Map;

import java.util.ArrayList;
import java.util.List;

public class TM2Exchange extends WebSite {
    @Override
    public String getEndPoint() {
        return "https://tm.mania.exchange/api/";
    }

    public List<TM2Map> searchMaps(){
        List<TM2Map> maps = new ArrayList<>();
        return maps;
    }
}
