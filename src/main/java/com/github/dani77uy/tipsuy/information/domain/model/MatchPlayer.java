package com.github.dani77uy.tipsuy.information.domain.model;

import java.io.Serial;
import java.io.Serializable;

import lombok.Data;

@Data
public class MatchPlayer implements Serializable {

   @Serial
   private static final long serialVersionUID = -3767115019477251232L;

   private Player player;

   private int number;

   private double ranking;

   private PlayerPosition playerPosition;

   private short goals;

   private boolean wasBookedWithYC;

   private boolean wasBookedWithRC;

   private boolean wasHeaded;

   private boolean wasSubstitute;

   private boolean wasSubstituted;

   private boolean wasOnTheBench;

   private boolean wasInjured;
}
