package com.jdluke.hue.config;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by jd on 10/25/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class HueResponse {
    private HueError error;
    private HueSuccess success;

    public HueError getError() {
        return error;
    }

    public void setError(HueError error) {
        this.error = error;
    }
}
