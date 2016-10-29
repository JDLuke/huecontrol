package com.jdluke.hue.config;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 *
 * [
 *   {
 *     "error":
 *       {
 *         "type":4,
 *         "address":"/",
 *         "description":
 *         "method, GET, not available for resource, /"
         }
     }
 * ]
 * Created by jd on 10/24/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class HubConfiguration {
    List<HueResponse> error;

    public List<HueResponse> getResults() {
        return error;
    }

    @Override
    public String toString() {
        return "HubConfiguration{" +
                "error=" + error +
                '}';
    }
}
