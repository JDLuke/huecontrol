package com.jdluke.hue.config;

import java.util.List;

/**
 * Created by jd on 10/25/2016.
 */
public class State {
    private boolean on;
    private int bri;
    private int hue;
    private int sat;
    private String effect;
    private List<Double> xy;
    private int ct;
    private String alert;
    private String colormode;
    private boolean reachable;

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getBri() {
        return bri;
    }

    public void setBri(int bri) {
        this.bri = bri;
    }

    public int getHue() {
        return hue;
    }

    public void setHue(int hue) {
        this.hue = hue;
    }

    public int getSat() {
        return sat;
    }

    public void setSat(int sat) {
        this.sat = sat;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public List<Double> getXy() {
        return xy;
    }

    public void setXy(List<Double> xy) {
        this.xy = xy;
    }

    public int getCt() {
        return ct;
    }

    public void setCt(int ct) {
        this.ct = ct;
    }

    public String getAlert() {
        return alert;
    }

    public void setAlert(String alert) {
        this.alert = alert;
    }

    public String getColormode() {
        return colormode;
    }

    public void setColormode(String colormode) {
        this.colormode = colormode;
    }

    public boolean isReachable() {
        return reachable;
    }

    public void setReachable(boolean reachable) {
        this.reachable = reachable;
    }

    @Override
    public String toString() {
        return "State{" +
                "on=" + on +
                ", bri=" + bri +
                ", hue=" + hue +
                ", sat=" + sat +
                ", effect='" + effect + '\'' +
                ", xy=" + xy +
                ", ct=" + ct +
                ", alert='" + alert + '\'' +
                ", colormode='" + colormode + '\'' +
                ", reachable=" + reachable +
                '}';
    }
}
