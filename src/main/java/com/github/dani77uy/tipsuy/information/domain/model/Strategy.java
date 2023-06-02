package com.github.dani77uy.tipsuy.information.domain.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Strategy {

   E_433("4-3-3"),
   E_442("4-4-2");

   private final String type;
}
