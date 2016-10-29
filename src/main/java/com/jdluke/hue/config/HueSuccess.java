package com.jdluke.hue.config;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by jd on 10/25/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class HueSuccess {
    String username;

    public String getUsername() {
        return username;
    }
}
