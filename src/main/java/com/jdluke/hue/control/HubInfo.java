package com.jdluke.hue.control;

import com.jdluke.hue.config.Hub;
import com.jdluke.hue.config.HueResponse;
import com.jdluke.hue.config.Light;
import com.jdluke.hue.config.Lights;
import com.jdluke.hue.exceptions.InvalidDeviceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by jd on 10/24/2016.
 */
@RestController
public class HubInfo {
    @Autowired
    private Hub hub;


    @RequestMapping("/light/{index}/{desiredState}")
    String setLightState(@PathVariable int index, @PathVariable String desiredState) {
       return "Unimplemented, stay tuned!";
    }


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
}
