package com.github.dani77uy.tipsuy.information.domain.model;

import com.neovisionaries.i18n.CountryCode;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serial;
import java.io.Serializable;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("city")
@Data
@Schema(title = "City", description = "City information obtained from geonames.org.")
public class City implements Serializable {

  @Serial
  private static final long serialVersionUID = -7256421066078711756L;

  @Id
  @Schema(name = "id", example = "1238764321", minimum = "1", description = "The city identification number.")
  private Long id;

  @Schema(name = "name", example = "Montevideo", description = "City name")
  private String name;

  @Schema(name = "country", example = "UY", description = "Country code")
  private CountryCode country;

  @Schema(name = "masl", example = "150", minimum = "0", maximum = "6000", description = "Meters above sea level")
  private int masl;

  @Schema(name = "averageTemperature", example = "18.0", minimum = "-30", maximum = "50", description = "Average annual temperature in Celsius")
  private double averageTemperature;
}
