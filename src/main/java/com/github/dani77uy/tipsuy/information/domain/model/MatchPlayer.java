package com.github.dani77uy.tipsuy.information.domain.model;

import java.io.Serial;
import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document("match_player")
@Data
public class MatchPlayer implements Serializable {

   @Serial
   private static final long serialVersionUID = -3767115019477251232L;

   @Id
   private int number;

   private Player player;

   private double ranking;

   private PlayerPosition playerPosition;

   private short goals;

   private boolean wasBookedWithYC;

   private boolean wasBookedWithRC;

   private boolean wasInHeadLine;

   private boolean wasSubstitute;

   private boolean wasSubstituted;

   private boolean wasOnTheBench;

   private boolean wasInjured;

}
