package io.shine.maniaexchangeapi.website;

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

    public List<ManiaTag> getTags() {
        List<ManiaTag> tags = new ArrayList<>();
        return tags;
    }

    @SneakyThrows
    public Response makeRequest(String path, RequestBody body){
        Request.Builder builder = new Request.Builder().url(getEndPoint()+path);
        if(body != null) builder.post(body);
        return client.newCall(builder.build()).execute();
    }
}
