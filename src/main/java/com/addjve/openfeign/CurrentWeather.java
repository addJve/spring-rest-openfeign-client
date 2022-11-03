package com.addjve.openfeign;

public class CurrentWeather {

    private Integer weathercode;
    private Double temperature;
    private Double windspeed;
    private String time;
    private Integer winddirection;

    public Integer getWeathercode() {

        return weathercode;

    }

    public void setWeathercode(Integer weathercode) {

        this.weathercode = weathercode;

    }

    public Double getTemperature() {

        return temperature;

    }

    public void setTemperature(Double temperature) {

        this.temperature = temperature;

    }

    public Double getWindspeed() {

        return windspeed;

    }

    public void setWindspeed(Double windspeed) {

        this.windspeed = windspeed;

    }

    public String getTime() {

        return time;

    }

    public void setTime(String time) {

        this.time = time;

    }

    public Integer getWinddirection() {

        return winddirection;

    }

    public void setWinddirection(Integer winddirection) {

        this.winddirection = winddirection;

    }

}
