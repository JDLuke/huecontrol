package com.jdluke.hue.exceptions;

/**
 * Created by jd on 10/28/2016.
 */
public class InvalidDeviceException extends Throwable {
    String message;
    public InvalidDeviceException(String s) {
        message = s;
    }

    @Override
    public String toString() {
        return "InvalidDeviceException{" +
                "message='" + message + '\'' +
                '}';
    }
}
