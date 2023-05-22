package com.attarwalashop.response;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@NoArgsConstructor
public class UserInfoResponse {

    @JsonAlias("id")
    @JsonProperty("id")
    private int id;

    @JsonAlias("username")
    @JsonProperty("username")
    private String username;

    @JsonAlias("email")
    @JsonProperty("email")
    private String email;

    @JsonAlias("role")
    @JsonProperty("role")
    private List<String> role;


}
