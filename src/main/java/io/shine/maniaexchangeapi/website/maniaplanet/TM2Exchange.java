package io.shine.maniaexchangeapi.website.maniaplanet;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import io.shine.maniaexchangeapi.website.WebSite;
import io.shine.maniaexchangeapi.website.maniaplanet.filters.TM2MapFilters;
import io.shine.maniaexchangeapi.website.maniaplanet.map.TM2Map;
import io.shine.maniaexchangeapi.website.maniaplanet.tag.TM2Tags;
import lombok.SneakyThrows;
import okhttp3.Response;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TM2Exchange extends WebSite {
    @Override
    public String getEndPoint() {
        return "https://tm.mania.exchange/";
    }

    @SneakyThrows
    public List<TM2Map> searchMaps(TM2MapFilters filters){
        List<TM2Map> maps = new ArrayList<>();
        Response response = getRequest("mapsearch2/search?api=on"+filters.toString());
        JsonParser parser = new JsonParser();
        JsonObject jo = parser.parse(response.body().string()).getAsJsonObject();
        jo.getAsJsonArray("results").forEach(e -> {
            JsonObject result = e.getAsJsonObject();
            maps.add(new TM2Map(result.get("Username").getAsString(),
                    result.get("Name").getAsString(),
                    result.get("StyleName").getAsString(),
                    result.get("ReplayWRUsername").getAsString(),
                    result.get("TrackID").getAsLong(),
                    result.get("UserID").getAsLong(),
                    result.get("AwardCount").getAsInt(),
                    Arrays.stream(result.get("Tags").getAsString().split(",")).map(t -> TM2Tags.getTag(Integer.parseInt(t)).get()).toArray(TM2Tags[]::new)));
        });
        return maps;
    }
}
