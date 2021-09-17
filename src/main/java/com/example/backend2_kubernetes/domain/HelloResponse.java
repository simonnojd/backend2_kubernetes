package com.example.backend2_kubernetes.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class HelloResponse {

    private final String message;

    @JsonCreator
    public HelloResponse (@JsonProperty("message") String message) {
        this.message = message;
    }
}
