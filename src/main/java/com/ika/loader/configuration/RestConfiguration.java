/**
 * This package includes configuration for REST Configuration
 */
package com.ika.loader.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.http.HttpClient;
import java.time.Duration;

/**
 * This class contains Rest configuration
 */
@Configuration
public class RestConfiguration {
    /**
     * This method creates the httpClient
     * @return Returns the httpClient allowing the connection
     */
    @Bean
    public HttpClient httpClient() {
        return HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .connectTimeout(Duration.ofSeconds(60))
                .build();
    }
}
