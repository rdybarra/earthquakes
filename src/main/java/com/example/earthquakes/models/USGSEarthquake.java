package com.example.earthquakes.models;

import com.example.earthquakes.models.EarthquakeGeometry;
import com.example.earthquakes.models.EarthquakeProperties;

public class USGSEarthquake {
    private EarthquakeProperties properties;
    private EarthquakeGeometry geometry;

    public void setProperties(EarthquakeProperties properties) {
        this.properties = properties;
    }

    public void setGeometry(EarthquakeGeometry geometry) {
        this.geometry = geometry;
    }

    public EarthquakeGeometry getGeometry() {
        return geometry;
    }

    public EarthquakeProperties getProperties() {
        return properties;
    }

    @Override
    public String toString() {
        return "USGSEarthquake{" +
                "properties=" + properties.toString() +
                "geometry=" + geometry.toString() +
                '}';
    }
}

