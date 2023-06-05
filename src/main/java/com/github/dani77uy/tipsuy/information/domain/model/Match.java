package com.github.dani77uy.tipsuy.information.domain.model;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document("match")
@Data
public class Match implements Serializable {

   @Serial
   private static final long serialVersionUID = -1887992922741726313L;

   @Id
   private long id;

   private Tournament tournament;

   private LocalDate matchDate;

   private Team home;

   private Team away;

   private List<MatchPlayer> homePlayers;

   private List<MatchPlayer> awayPlayers;

   private byte homeGoals;

   private byte awayGoals;

   private boolean isInNeutralVenue;

   private PlayoffPosition playOffPosition;

}
