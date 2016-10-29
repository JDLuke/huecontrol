package com.jdluke.hue.config;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by jd on 10/24/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserCreationResult {
    String result;

    public String getError() {
        return error;
    }

    String error;

    public String getResult() {
        return result;
    }

    public UserRecord getTheUser() {
        return theUser;
    }

    UserRecord theUser;
}
