package com.jhonatansouza.faces.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AzureConfiguration {

    @Value("${azure.subscriptionKey}")
    private String subscriptionKey;
    @Value("${azure.uriBase}")
    private String uriBase;
    @Value("${azure.faceAttributes}")
    private String faceAttributes;

    public String getSubscriptionKey() {
        return subscriptionKey;
    }

    public String getUriBase() {
        return uriBase;
    }
    public String getFaceAttributes() {
        return faceAttributes;
    }

}
