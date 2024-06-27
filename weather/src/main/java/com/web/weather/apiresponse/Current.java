package com.web.weather.apiresponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Current {
    @JsonProperty("temp_c")
    private double tempC;
    @JsonProperty("wind_kph")
    private int windSpeed;
    @JsonProperty("humidity")
    private double humidity;
    public double getTempC() {
        return tempC;
    }
    public void setTempC(double tempC) {
        this.tempC = tempC;
    }
    public int getWindSpeed() {
        return windSpeed;
    }
    public void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
    }
    public double getHumidity() {
        return humidity;
    }
    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }
   
}
