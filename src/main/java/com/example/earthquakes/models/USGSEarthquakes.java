package com.example.earthquakes.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class USGSEarthquakes {
    private ArrayList<USGSEarthquake> earthquakes = new ArrayList();

    @JsonProperty("features")
    public void setEarthquakes(ArrayList<USGSEarthquake> earthquakes) {
        this.earthquakes = earthquakes;
    }

    public ArrayList<USGSEarthquake> getEarthquakes() {
        return earthquakes;
    }

    @Override
    public String toString() {
        String outputString = "";

        for(int i = 0; i < earthquakes.size(); i++) {
            outputString = outputString + earthquakes.get(i) + "\n\n";
        }

        return "USGSEarthquakes{" +
                "earthquakes=\n" + outputString +
                '}';
    }
}
