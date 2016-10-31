package com.jdluke.hue.control;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jdluke.hue.config.*;
import com.jdluke.hue.exceptions.InvalidDeviceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by jd on 10/24/2016.
 */
@RestController
public class HubInfo {
    @Autowired
    private Hub hub;

    @RequestMapping("/light/{index}")
    Light lightAt(@PathVariable int index) {
        System.out.println("/light/" + index);
        try {
            return hub.getLights().lightAtIndex(index);
        } catch (InvalidDeviceException e) {
            return null;
        }
    }

    @RequestMapping("/displayHubInfo")
    public String displayHubInfo() {
        System.out.println("/displayHubInfo()");
        List<HueResponse> hubConfiguration = hub.readHubInfo();
        return hubConfiguration.toString();
    }

    @RequestMapping("/createUser")
    public String createUser() {
        return hub.createUser();
    }

    @RequestMapping("/lights")
    public Lights getLights() {
        System.out.println("/lights");
        return hub.getLights();
    }

    @Autowired
    ObjectMapper objectMapper;

    @RequestMapping(value = "/light/{index}", method = RequestMethod.PUT)
    Light setLightState(@PathVariable int index, @RequestBody String body) {

        try {
            System.out.println("Body: " + body);
            State state = objectMapper.readValue(body.toString(), State.class);

            System.out.println("setLightState(" + index + ", " + state + ")");
            String message = "setLightState received index " + index + " and state " + state;
            System.out.println(message);

            hub.setLightState(index, state);
        } catch (Exception e) {
            e.printStackTrace();
        }


        return lightAt(index);
    }
}
