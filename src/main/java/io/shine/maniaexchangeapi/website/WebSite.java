package io.shine.maniaexchangeapi.website;

import lombok.Getter;
import lombok.SneakyThrows;
import okhttp3.*;

public abstract class WebSite {
    @Getter
    private static final OkHttpClient client = new OkHttpClient().newBuilder().followRedirects(false).build();

    public abstract String getEndPoint();

    @SneakyThrows
    public Response getRequest(String path){
        Request.Builder builder = new Request.Builder().url(getEndPoint()+path);
        return client.newCall(builder.build()).execute();
    }

    @SneakyThrows
    public Response postRequest(String path, RequestBody body){
        Request.Builder builder = new Request.Builder().url(getEndPoint()+path).post(body);
        return client.newCall(builder.build()).execute();
    }

    @SneakyThrows
    public Response deleteRequest(String path, RequestBody body){
        Request.Builder builder = new Request.Builder().url(getEndPoint()+path).delete(body);
        return client.newCall(builder.build()).execute();
    }

}
