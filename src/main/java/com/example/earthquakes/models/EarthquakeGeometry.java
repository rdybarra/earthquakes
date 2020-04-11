package com.example.earthquakes.models;

import java.util.Arrays;

public class EarthquakeGeometry {
    private Double[] coordinates = new Double[3];

    public void setCoordinates(Double[] coordinates) {
        this.coordinates = coordinates;
    }

    public Double[] getCoordinates() {
        return coordinates;
    }

    @Override
    public String toString() {
        return "EarthquakeGeometry{" +
                "coordinates=" + Arrays.toString(coordinates) +
                '}';
    }
}
