package com.kodilla.testing.weather.mock;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double averageTemperature() {
        int numberOfMeasurements = temperatures.getTemperatures().size();
        double sumOfTemperatures = 0.0;
        for(Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            sumOfTemperatures += temperature.getValue();
        }
        double averageTemperature = sumOfTemperatures / numberOfMeasurements;
        return averageTemperature;
    }

    public double medianTemperature() {
        double median = 0.0;
        int numberOfMeasurements = temperatures.getTemperatures().size();

        ArrayList<Double> list = new ArrayList<>(temperatures.getTemperatures().values());
        Collections.sort(list);

        if(list.size() % 2 != 0) {
            median = list.get(numberOfMeasurements / 2 );
        } else {
            double temp = 0.0;
            temp = list.get(numberOfMeasurements/2) + list.get(numberOfMeasurements/2 - 1);
            median = temp/2;
        }
        return median;
    }
}