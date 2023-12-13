package com.wmdemo.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class WeatherController {

    @PostMapping(value = "/weather", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String weatherForecast(@ModelAttribute("location") String location) {

        if (location == null || location.equals("")){
            return "unkonwn location";
        }

        String content = Constants.WEATHER_TEMPLATE;
            content = content.replace("${LOCATION}", location);
            content = content.replace("${TEMPMIN}", String.valueOf(random(18.0, 25.0)));
            content = content.replace("${TEMP}", String.valueOf(random(18.0, 25.0)));
            content = content.replace("${TEMPFEEL}", String.valueOf(random(18.0, 25.0)));
            content = content.replace("${TEMPMAX}", String.valueOf(random(18.0, 25.0)));
        return content;
    }


    private double random(double min, double max) {
        Random r = new Random();
        return (r.nextInt((int)((max-min)*10+1))+min*10) / 10.0;
    }

}
