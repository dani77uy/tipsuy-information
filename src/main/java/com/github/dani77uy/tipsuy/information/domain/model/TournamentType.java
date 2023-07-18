package com.github.dani77uy.tipsuy.information.domain.model;

import lombok.Getter;

@Getter
public enum TournamentType {

    FIFA_INTERNATIONAL_MEN,
    FIFA_INTERNATIONAL_MEN_U20,
    FIFA_INTERNATIONAL_MEN_U17,
    CONMEBOL_INTERNATIONAL_MEN,
    CONMEBOL_INTERNATIONAL_MEN_U20,
    CONMEBOL_INTERNATIONAL_MEN_U17,
    UEFA_INTERNATIONAL_MEN,
    UEFA_INTERNATIONAL_MEN_U20,
    UEFA_INTERNATIONAL_MEN_U17,
    FIFA_CLUB_INTERNATIONAL_MEN,
    CONMEBOL_CLUB_INTERNATIONAL_MEN,
    UEFA_CLUB_INTERNATIONAL_MEN,
    CONMEBOL_CLUB_INTERNATIONAL_MEN_U20,
    UEFA_CLUB_INTERNATIONAL_MEN_U20,
    DOMESTIC_MEN(false),
    DOMESTIC_MEN_U20(false);

    private final boolean isInternational;

    TournamentType(final boolean isInternational) {
        this.isInternational = isInternational;
    }

    TournamentType() {
        isInternational = true;
    }
}
