package com.example.earthquakes.models;

import java.util.Date;

public class EarthquakeProperties {
    private float mag;
    private String place;
    private Date time;

    public void setMag(float mag) {
        this.mag = mag;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public float getMag() {
        return mag;
    }

    public String getPlace() {
        return place;
    }

    public Date getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "EarthquakeProperties{" +
                "mag=" + mag +
                ", place='" + place + '\'' +
                ", time=" + time +
                '}';
    }
}
