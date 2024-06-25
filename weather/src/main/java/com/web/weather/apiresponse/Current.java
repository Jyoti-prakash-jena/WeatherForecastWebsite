package com.web.weather.apiresponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Current {
    @JsonProperty("temp_c")
    private double tempC;

    public double getTempC() {
        return tempC;
    }

    public void setTempC(int tempC) {
        this.tempC = tempC;
    }
   
}
