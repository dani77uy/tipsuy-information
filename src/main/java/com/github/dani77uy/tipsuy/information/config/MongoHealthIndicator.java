package com.github.dani77uy.tipsuy.information.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import java.util.concurrent.TimeUnit;
import org.bson.Document;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author DanielB20
 * @since 04-Jun-23
 */
//@EnableScheduling
//@Component
public class MongoHealthIndicator /*implements HealthIndicator */{

//   private final MongoTemplate mongoTemplate;
//
//   public MongoHealthIndicator(final MongoTemplate mongoTemplate) {
//      this.mongoTemplate = mongoTemplate;
//   }
//
//   @Scheduled(fixedDelay = 2, timeUnit = TimeUnit.MINUTES)
//   public void checkConnection() {
//      health();
//   }
//
//   @Override
//   public Health health() {
//      try (final MongoClient mongoClient = MongoClients.create()) {
//         final MongoDatabase database = mongoClient.getDatabase(mongoTemplate.getDb().getName());
//         final Document pingCommand = new Document("ping", 1);
//         final Document pingResult = database.runCommand(pingCommand);
//         if (pingResult.getDouble("ok") == 1.0) {
//            return Health.up().build();
//         } else {
//            return Health.down().withDetail("error", "Ping command failed").build();
//         }
//      } catch (final Exception e) {
//         return Health.down(e).build();
//      }
//   }
}
