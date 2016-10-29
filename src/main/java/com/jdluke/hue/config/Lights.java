package com.jdluke.hue.config;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jdluke.hue.exceptions.InvalidDeviceException;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * I *hate* this class.  It was written to support the JSON
 * that the Hue hub creates but that is some seriously ugly shit.
 * Created by jd on 10/25/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Lights {
@JsonProperty(value = "1")
    Light light1;
    @JsonProperty(value="2")
    Light light2;
    @JsonProperty(value="3")
    Light light3;
    @JsonProperty(value="4")
    Light light4;

    @JsonProperty(value="5")
    Light light5;
    @JsonProperty(value="6")
    Light light6;
    @JsonProperty(value="7")
    Light light7;
    @JsonProperty(value="8")
    Light light8;
    @JsonProperty(value="9")
    Light light9;
    @JsonProperty(value="10")
    Light light10;
    @JsonProperty(value="11")
    Light light11;
    @JsonProperty(value="12")
    Light light12;
    @JsonProperty(value="13")
    Light light13;
    @JsonProperty(value="14")
    Light light14;
    @JsonProperty(value="15")
    Light light15;
    @JsonProperty(value="16")
    Light light16;
    @JsonProperty(value="17")
    Light light17;
    @JsonProperty(value="18")
    Light light18;
    @JsonProperty(value="19")
    Light light19;
    @JsonProperty(value="20")
    Light light20;
    @JsonProperty(value="21")
    Light light21;
    @JsonProperty(value="22")
    Light light22;
    @JsonProperty(value="23")
    Light light23;
    @JsonProperty(value="24")
    Light light24;
    @JsonProperty(value="25")
    Light light25;
    @JsonProperty(value="26")
    Light light26;
    @JsonProperty(value="27")
    Light light27;
    @JsonProperty(value="28")
    Light light28;
    @JsonProperty(value="29")
    Light light29;
    @JsonProperty(value="30")
    Light light30;
    @JsonProperty(value="31")
    Light light31;
    @JsonProperty(value="32")
    Light light32;
    @JsonProperty(value="33")
    Light light33;
    @JsonProperty(value="34")
    Light light34;
    @JsonProperty(value="35")
    Light light35;
    @JsonProperty(value="36")
    Light light36;
    @JsonProperty(value="37")
    Light light37;
    @JsonProperty(value="38")
    Light light38;
    @JsonProperty(value="39")
    Light light39;
    @JsonProperty(value="40")
    Light light40;
    @JsonProperty(value="41")
    Light light41;
    @JsonProperty(value="42")
    Light light42;
    @JsonProperty(value="43")
    Light light43;
    @JsonProperty(value="44")
    Light light44;
    @JsonProperty(value="45")
    Light light45;
    @JsonProperty(value="46")
    Light light46;
    @JsonProperty(value="47")
    Light light47;
    @JsonProperty(value="48")
    Light light48;
    @JsonProperty(value="49")
    Light light49;
    @JsonProperty(value="50")
    Light light50;

    @JsonProperty
    public List<Light> lightArray() {
        List<Light> lights = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            Light light = null;
            try {
                light = lightAtIndex(i);
                if (light != null) {
                    lights.add(light);
                }
            } catch (InvalidDeviceException e) {
                e.printStackTrace();
            }
        }
        return lights;
    }

    @JsonIgnore
    public Light lightAtIndex(int index) throws InvalidDeviceException {
        Class[] parameterTypes = {};
        try {
            Field field = this.getClass().getDeclaredField("light" + (index + 1));
            return (Light)field.get(this);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new InvalidDeviceException("light" + (index + 1));
        }
    }
}
