package com.jdluke.hue.config;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by jd on 10/25/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class HueError {
//    {
//      "error":
//        {
//          "type":4,
//          "address":"/",
//          "description":
//          "method, GET, not available for resource, /"
//    }
//    }

    String type;
    String address;
    String description;

    public String getType() {
        return type;
    }

    public String getAddress() {
        return address;
    }

    public String getDescription() {
        return description;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
