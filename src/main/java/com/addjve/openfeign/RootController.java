package com.addjve.openfeign;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/forecast")
public class RootController {
    private final RootProxy rootProxy;

    public RootController(RootProxy rootProxy) {
        this.rootProxy = rootProxy;
    }

    @GetMapping
    public ResponseEntity<Root> getRoot (
            @RequestParam("latitude") double latitude,
            @RequestParam("longitude") double longitude,
            @RequestParam("current_weather") boolean isCurrentWeather) {
        return ResponseEntity.ok(rootProxy.getRoot(latitude,longitude, isCurrentWeather));
    }

}
