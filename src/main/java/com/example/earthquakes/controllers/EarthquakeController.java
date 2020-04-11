package com.example.earthquakes.controllers;

import com.example.earthquakes.repositories.USGSRepository;
import com.example.earthquakes.models.USGSEarthquake;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@RestController
public class EarthquakeController {

    @RequestMapping("/")
    public ArrayList<USGSEarthquake> index() {
        final USGSRepository usgsRepository = new USGSRepository();
        return usgsRepository.get1Point0EarthquakesPastDay();
    }
}
