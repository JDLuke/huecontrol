package com.jdluke.hue.config;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jd on 10/24/2016.
 */
@Component
public class Hub {
    private String hubUrl = "http://192.168.1.14";

    public List<HueResponse> readHubInfo() {
        RestTemplate restTemplate = new RestTemplate();
        List<HueResponse> hubConfiguration = restTemplate.getForObject(hubUrl + "/api", List.class);
        return hubConfiguration;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    private String userName = "xqE10fO4e84n4959UHzsJNBNmyE6-6L9t-qTqXlF";

    public String createUser() {
        RestTemplate restTemplate = new RestTemplate();
        UserCreationRequestObject requestObject = new UserCreationRequestObject();
        requestObject.setDevicetype("huecontrol#devWorkstation");
        Map<String, Object> uriParms = new HashMap<>();
        List<HueResponse> userRecord = restTemplate.postForObject(hubUrl + "/api", requestObject, List.class, uriParms);
        System.out.println(userRecord.toString());
        return userRecord.toString();

    }

    public Lights getLights() {
        System.out.println("getLights");
        RestTemplate restTemplate = new RestTemplate();
        Lights lights = restTemplate.getForObject(hubUrl + "/api/" + getUserName() + "/lights", Lights.class);
        return lights;
    }
}
