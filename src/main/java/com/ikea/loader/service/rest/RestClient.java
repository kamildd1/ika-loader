package com.ikea.loader.service.rest;

import java.net.http.HttpResponse;

/**
 * Interface connects with REST
 */
public interface RestClient {
    /**
     * This method gives the possibility to execute the POST query
     * @param url Address from ViewController
     */
    void postRequest(String url, String payload);

    /**
     * This method gives the possibility to execute the GET query
     * @param url Address from ViewController
     * @return Execute the GET query
     */
    HttpResponse<String> getResponse(String url);
}
