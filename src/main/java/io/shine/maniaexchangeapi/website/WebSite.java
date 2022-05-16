package io.shine.maniaexchangeapi.website;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import io.shine.maniaexchangeapi.tag.ManiaTag;
import lombok.Getter;
import lombok.SneakyThrows;
import okhttp3.*;

import java.util.ArrayList;
import java.util.List;

public abstract class WebSite {
    @Getter
    private OkHttpClient client = new OkHttpClient().newBuilder().followRedirects(false).build();

    public abstract String getEndPoint();

    @SneakyThrows
    public List<ManiaTag> getTags() {
        List<ManiaTag> tags = new ArrayList<>();
        Response response = makeRequest("tags/gettags", null);
        Gson gson = new Gson();
        JsonArray jsonArray = new JsonParser().parse(response.body().string()).getAsJsonArray();
        jsonArray.forEach(j -> {
            tags.add(gson.fromJson(j, ManiaTag.class));
        });
        return tags;
    }

    @SneakyThrows
    public Response makeRequest(String path, RequestBody body){
        Request.Builder builder = new Request.Builder().url(getEndPoint()+path);
        if(body != null) builder.post(body);
        return client.newCall(builder.build()).execute();
    }
}
