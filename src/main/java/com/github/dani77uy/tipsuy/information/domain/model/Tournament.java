package com.github.dani77uy.tipsuy.information.domain.model;

import static com.github.dani77uy.tipsuy.information.domain.model.TournamentType.CONMEBOL_CLUB_INTERNATIONAL_MEN;
import static com.github.dani77uy.tipsuy.information.domain.model.TournamentType.DOMESTIC_MEN;

import com.neovisionaries.i18n.CountryCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Tournament {

  COPA_LIBERTADORES(CONMEBOL_CLUB_INTERNATIONAL_MEN, CountryCode.UNDEFINED),
  COPA_SUDAMERICANA(CONMEBOL_CLUB_INTERNATIONAL_MEN, CountryCode.UNDEFINED),
  CAMPEONATO_URUGUAYO(DOMESTIC_MEN, CountryCode.UY),
  COPA_URUGUAY(DOMESTIC_MEN, CountryCode.UY);

  private final TournamentType tournamentType;

  private final CountryCode countryCode;
}
