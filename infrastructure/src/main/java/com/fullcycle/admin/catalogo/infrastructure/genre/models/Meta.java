package com.fullcycle.admin.catalogo.infrastructure.genre.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Meta(
        @JsonProperty("current_page") int current_page,
        @JsonProperty("from") int from,
        @JsonProperty("last_page") int last_page,
        @JsonProperty("path") String path,
        @JsonProperty("per_page") int per_page,
        @JsonProperty("to") int to,
        @JsonProperty("total") int total
){}
