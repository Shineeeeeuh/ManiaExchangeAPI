package io.shine.maniaexchangeapi.website;

import lombok.Getter;
import lombok.SneakyThrows;
import okhttp3.*;

public abstract class WebSite {
    @Getter
    private OkHttpClient client = new OkHttpClient().newBuilder().followRedirects(false).build();

    public abstract String getEndPoint();

    @SneakyThrows
    public Response makeRequest(String path, RequestBody body){
        Request.Builder builder = new Request.Builder().url(getEndPoint()+path);
        if(body != null) builder.post(body);
        return client.newCall(builder.build()).execute();
    }
}
