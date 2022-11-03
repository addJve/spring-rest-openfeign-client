package com.addjve.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "${app.feign.config.name}",
        url = "${app.feign.config.url}")
public interface RootProxy {
    @RequestMapping(method = RequestMethod.GET, value = "/forecast")
    Root getRoot(@RequestParam("latitude") double latitude,
                   @RequestParam("longitude") double longitude,
                   @RequestParam("current_weather") boolean isCurrentWeather);
}