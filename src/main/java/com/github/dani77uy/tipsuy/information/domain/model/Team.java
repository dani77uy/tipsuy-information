package com.github.dani77uy.tipsuy.information.domain.model;

import java.io.Serial;
import java.io.Serializable;

import lombok.Data;

@Data
public class Team implements Serializable {

   @Serial
   private static final long serialVersionUID = -5778237964944406614L;

   private long id;
   private String name;
   private Strategy strategy;
}
