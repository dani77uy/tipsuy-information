package com.github.dani77uy.tipsuy.information.domain.model;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import com.neovisionaries.i18n.CountryCode;

import lombok.Data;

@Data
public class Player implements Serializable {

   @Serial
   private static final long serialVersionUID = -8747563465601085102L;

   private long id;
   private String name;
   private LocalDate birthDate;
   private BigDecimal marketValue;
   private CountryCode citizenship;
   private String comments;
   private boolean isInternational;
   private HealthStatus status;
}
