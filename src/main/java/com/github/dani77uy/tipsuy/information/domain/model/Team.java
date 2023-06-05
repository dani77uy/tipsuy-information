package com.github.dani77uy.tipsuy.information.domain.model;

import java.io.Serial;
import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.neovisionaries.i18n.CountryCode;

import lombok.Data;

@Document("team")
@Data
@Schema(title = "Team", description = "The team basic information.")
public class Team implements Serializable {

   @Serial
   private static final long serialVersionUID = -5778237964944406614L;

   @Id
   @Schema(name = "id", example = "1238764321", minLength = 1, maxLength = 19, description = "The team identification number.")
   private long id;

   @Schema(name = "name", example = "PEÑAROL", minLength = 1, maxLength = 20, description = "The team identification name.")
   private String name;

   @Schema(name = "strategy", example = "4-4-2", minLength = 1, maxLength = 10, description = "The team main strategy.")
   private Strategy strategy;

   @Schema(name = "country", example = "UY", minLength = 1, maxLength = 2, description = "The team location country code.")
   private CountryCode country;



}
