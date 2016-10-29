package com.jdluke.hue.config;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by jd on 10/24/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserRecord {
    String username;
}
