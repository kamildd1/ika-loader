/**
 * This package includes implementation for RestClient
 */
package com.ikea.loader.service.rest;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

/**
 * Service contains Rest Client to get connected
 */
@Slf4j
@Service
@AllArgsConstructor
public class RestClientImpl implements RestClient {

    private final HttpClient httpClient;

    /**
     * This method gives the possibility to execute the GET query
     * @param url Address from ViewController
     * @return Execute the GET query
     */
    @Override
    public HttpResponse<String> getResponse(String url) {
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .GET()
                    .uri(URI.create(url))
                    .header("Accept", "application/json")
                    .header("Content-type", "application/json")
                    .timeout(Duration.ofSeconds(60))
                    .build();

            return httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (InterruptedException | IOException ex) {
            log.error("Rest client error: " + ex.getMessage());
            return null;
        }
    }

    /**
     * This method gives the possibility to execute the POST query
     * @param url Address from ViewController
     */
    @Override
    public void postRequest(String url, String payload) {
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .POST(HttpRequest.BodyPublishers.ofString(payload))
                    .uri(URI.create(url))
                    .header("Accept", "application/json")
                    .header("Content-type", "application/json")
                    .timeout(Duration.ofSeconds(60))
                    .build();

            httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            log.info("Player was send successfully: " + payload);
        } catch (InterruptedException | IOException ex) {
            log.error("Rest client error: " + ex.getMessage());
        }
    }
}