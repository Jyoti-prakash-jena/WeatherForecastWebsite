package com.web.weather.apiresponse;

import org.springframework.stereotype.Component;

@Component
public class WeatherResponse {
    private Current current;

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }

   
}
