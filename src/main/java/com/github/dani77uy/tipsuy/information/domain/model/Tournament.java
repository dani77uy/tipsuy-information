package com.github.dani77uy.tipsuy.information.domain.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Tournament {
   COPA_LIBERTADORES(true),
   COPA_SUDAMERICANA(true),
   CAMPEONATO_URUGUAYO(false),
   COPA_URUGUAY(false);

   private final boolean isInternational;
}
