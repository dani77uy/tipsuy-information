package com.github.dani77uy.tipsuy.information.domain.model;

import io.swagger.v3.oas.annotations.media.Schema;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@Schema(type = "Enum")
public enum Strategy {

   E_433("4-3-3"),
   E_442("4-4-2");

   private final String type;
}
