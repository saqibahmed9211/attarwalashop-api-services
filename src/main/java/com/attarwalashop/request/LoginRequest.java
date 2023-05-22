package com.attarwalashop.request;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class LoginRequest {

    @JsonAlias("username")
    @JsonProperty("username")
    private String username;

    @JsonAlias("email")
    @JsonProperty("email")
    private String email;

    @JsonAlias("password")
    @JsonProperty("password")
    @NotBlank
    private String password;
}
