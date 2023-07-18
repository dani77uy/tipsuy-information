package com.github.dani77uy.tipsuy.information.domain.model;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("player")
@Data
public class Player implements Serializable {

  @Serial
  private static final long serialVersionUID = -8747563465601085102L;

  @Id
  private long id;

  private String name;

  private LocalDate birthDate;

  private BigDecimal marketValue;

  private City birthPlace;

  private String comments;

  private boolean isInternational;

  private HealthStatus status;

}
