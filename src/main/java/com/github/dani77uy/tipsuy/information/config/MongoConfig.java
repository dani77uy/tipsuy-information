package com.github.dani77uy.tipsuy.information.config;

import com.mongodb.ConnectionString;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import java.util.concurrent.TimeUnit;
import lombok.extern.slf4j.Slf4j;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@EnableScheduling
@EnableMongoAuditing
@EnableMongoRepositories(basePackages = {"com.github.dani77uy.tipsuy.information"})
@Configuration
@Slf4j
public class MongoConfig {

  @Value("${app.mongodb.uri}")
  private String mongoUri;

  @Value("${app.mongodb.database}")
  private String database;

  @Bean
  public MongoClient mongoClient() {
    final ConnectionString connectionString = new ConnectionString(mongoUri);
    return MongoClients.create(connectionString);
  }

  @Bean
  public MongoTemplate mongoTemplate() {
    return new MongoTemplate(mongoClient(), database);
  }

  @Scheduled(fixedRate = 30, timeUnit = TimeUnit.SECONDS)
  public void checkConnection() {
    try {
      final Document pingCommand = new Document("ping", 1);
      mongoTemplate().getDb().runCommand(pingCommand);
      log.debug("Database [{}] connection OK.", database);
    } catch (final Exception ex) {
      log.warn("Error checking database connection", ex);
    }
  }

}
