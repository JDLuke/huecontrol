package com.jdluke.hue.config;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by jd on 10/24/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserCreationResponse {
    List<UserCreationResult> results;

    List<UserCreationResult> getResults() {
        return results;
    }
}
