package com.ikea.loader.service.rest;

import java.net.http.HttpResponse;

public interface RestClient {

    void postRequest(String url, String payload);

    HttpResponse<String> getResponse(String url);
}
