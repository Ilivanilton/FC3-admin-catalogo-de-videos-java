package com.fullcycle.admin.catalogo.infrastructure.category.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public record CategoryIdResponse(
        @JsonProperty("id_fudido") String id
) {
}
