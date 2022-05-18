package io.shine.maniaexchangeapi.website.maniaplanet;

import io.shine.maniaexchangeapi.website.WebSite;
import io.shine.maniaexchangeapi.website.maniaplanet.filters.TM2MapFilters;
import io.shine.maniaexchangeapi.website.maniaplanet.map.TM2Map;
import okhttp3.Response;

import java.util.ArrayList;
import java.util.List;

public class TM2Exchange extends WebSite {
    @Override
    public String getEndPoint() {
        return "https://tm.mania.exchange/";
    }

    public List<TM2Map> searchMaps(TM2MapFilters filters){
        List<TM2Map> maps = new ArrayList<>();
        Response response = getRequest("");
        return maps;
    }
}
