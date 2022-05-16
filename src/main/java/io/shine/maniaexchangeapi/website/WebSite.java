package io.shine.maniaexchangeapi.website;

import io.shine.maniaexchangeapi.tag.ManiaTag;
import lombok.Getter;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;

import java.util.ArrayList;
import java.util.List;

public abstract class WebSite {
    @Getter
    private OkHttpClient client = new OkHttpClient().newBuilder().followRedirects(false).build();

    public abstract String getEndPoint();

    public List<ManiaTag> getTags() {
        List<ManiaTag> tags = new ArrayList<>();
        Request request = new Request.Builder().url(getEndPoint() + "/tags/gettags").build();
        Call call = client.newCall(request);
        return tags;
    }
}
