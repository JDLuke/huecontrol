package com.jdluke.hue.config;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by jd on 10/25/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Light {
    private State state;
    private String type;
    private String name;
    private String modelid;
    private String manufacturername;
    private String uniqueid;
    private String swversion;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getModelid() {
        return modelid;
    }

    public String getManufacturername() {
        return manufacturername;
    }

    public String getUniqueid() {
        return uniqueid;
    }

    public String getSwversion() {
        return swversion;
    }

    @Override
    public String toString() {
        return "Light{" +
                "state=" + state +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", modelid='" + modelid + '\'' +
                ", manufacturername='" + manufacturername + '\'' +
                ", uniqueid='" + uniqueid + '\'' +
                ", swversion='" + swversion + '\'' +
                '}';
    }
}
