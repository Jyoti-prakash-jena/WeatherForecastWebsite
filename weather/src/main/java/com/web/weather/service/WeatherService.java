package com.web.weather.service;


import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.web.weather.apiresponse.WeatherResponse;

@Service
public class WeatherService {
    

    private static final  String apiKey="26d9316847d54eeb96445128242506";
    private static final String api = "https://api.weatherapi.com/v1/current.json?key=API_KEY&q=CITY&aqi=no";

    public WeatherResponse getWeather(String city){

     String finalApi = api.replace("CITY", city).replace("API_KEY", apiKey);

     RestTemplate restTemplate = new RestTemplate();

    WeatherResponse response = restTemplate.getForObject(finalApi,WeatherResponse.class);
    
    return response;
    }
    
}
