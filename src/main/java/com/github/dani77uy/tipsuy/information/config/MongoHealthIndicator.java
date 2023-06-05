package com.github.dani77uy.tipsuy.information.config;

import org.bson.Document;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 * @author DanielB20
 * @since 04-Jun-23
 */
@Component
public class MongoHealthIndicator implements HealthIndicator {

   private final MongoTemplate mongoTemplate;

   public MongoHealthIndicator(final MongoTemplate mongoTemplate) {
      this.mongoTemplate = mongoTemplate;
   }

   @Override
   public Health health() {
      try(final MongoClient mongoClient = MongoClients.create()) {
         final MongoDatabase database = mongoClient.getDatabase(mongoTemplate.getDb().getName());
         final Document pingCommand = new Document("ping", 1);
         final Document pingResult = database.runCommand(pingCommand);
         if (pingResult.getDouble("ok") == 1.0) {
            return Health.up().build();
         } else {
            return Health.down().withDetail("error", "Ping command failed").build();
         }
      } catch (final Exception e) {
         return Health.down(e).build();
      }
   }
}
