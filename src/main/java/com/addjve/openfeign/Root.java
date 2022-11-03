package com.addjve.openfeign;

public class Root {

    private Integer elevation;
    private Double generationtime_ms;
    private String timezone_abbreviation;
    private String timezone;
    private Double latitude;
    private Integer utc_offset_seconds;
    private CurrentWeather current_weather;
    private Double longitude;

    public Integer getElevation() {

        return elevation;

    }

    public void setElevation(Integer elevation) {

        this.elevation = elevation;

    }

    public Double getGenerationtime_ms() {

        return generationtime_ms;

    }

    public void setGenerationtime_ms(Double generationtime_ms) {

        this.generationtime_ms = generationtime_ms;

    }

    public String getTimezone_abbreviation() {

        return timezone_abbreviation;

    }

    public void setTimezone_abbreviation(String timezone_abbreviation) {

        this.timezone_abbreviation = timezone_abbreviation;

    }

    public String getTimezone() {

        return timezone;

    }

    public void setTimezone(String timezone) {

        this.timezone = timezone;

    }

    public Double getLatitude() {

        return latitude;

    }

    public void setLatitude(Double latitude) {

        this.latitude = latitude;

    }

    public Integer getUtc_offset_seconds() {

        return utc_offset_seconds;

    }

    public void setUtc_offset_seconds(Integer utc_offset_seconds) {

        this.utc_offset_seconds = utc_offset_seconds;

    }

    public CurrentWeather getCurrent_weather() {

        return current_weather;

    }

    public void setCurrent_weather(CurrentWeather current_weather) {

        this.current_weather = current_weather;

    }

    public Double getLongitude() {

        return longitude;

    }

    public void setLongitude(Double longitude) {

        this.longitude = longitude;

    }

}
