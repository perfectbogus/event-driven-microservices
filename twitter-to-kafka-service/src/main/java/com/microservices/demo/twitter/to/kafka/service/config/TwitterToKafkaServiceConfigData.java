package com.microservices.demo.twitter.to.kafka.service.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Data
@Configuration
@ConfigurationProperties(prefix = "twitter-to-kafka-service")
public class TwitterToKafkaServiceConfigData {
  private List<String> twitterKeywords;
  private String welcomeMessage;
  private String twitterV2BaseUrl;
  private String twitterV2RulesBaseUrl;
  private String bearerToken = "AAAAAAAAAAAAAAAAAAAAAHwSfAEAAAAAA0U4YOiwBGetvoyZdi6nUGTUOyA%3DTjzry6eVE4wFJewdhbwDIdfWEcNuIKnB7BlR5y6wjia7pkrDxy";
}
