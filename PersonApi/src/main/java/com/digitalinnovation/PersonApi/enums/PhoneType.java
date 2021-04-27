package com.digitalinnovation.PersonApi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PhoneType {

    NOME("nome"),
    MOBILE("mobile"),
    COMMERCIAL("commercial");

    private final String description;
}
