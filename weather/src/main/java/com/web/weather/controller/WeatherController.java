package com.web.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.weather.apiresponse.WeatherResponse;
import com.web.weather.service.WeatherService;


@Controller
public class WeatherController {
    @Autowired
    private WeatherService weatherService;

   @GetMapping("/")
     public String homePage(){

        return "home";
     }

@PostMapping("/welcome")
    public String welcome(@RequestParam("cityName") String cityName,Model model){
         WeatherResponse weatherResponse= weatherService.getWeather(cityName);
       model.addAttribute("weatherResponse",weatherResponse );
        return "weather";
    }
    
}
