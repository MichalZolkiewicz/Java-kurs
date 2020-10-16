package com.kodilla.testing.weather.stub;

import java.util.*;

import static java.util.Collections.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for(Map.Entry<String, Double> temperature: temperatures.getTemperatures().entrySet()){
            //adding 1 celsius degree to current value
            //as a temporary weather forecast

            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public Double calculateAverageTemperature() {
        double temperaturesSum = 0;
        double roundCounter = 0;

        for(Map.Entry<String, Double> averageTemp: temperatures.getTemperatures().entrySet()){

            temperaturesSum += averageTemp.getValue();
            roundCounter++;
        }
        return temperaturesSum/roundCounter;
    }

    public List<Double> calculateMedianTemperature() {

        List<Double> sorted = new ArrayList<>();
        for(Map.Entry<String, Double> unsorted: temperatures.getTemperatures().entrySet()) {

            sorted.add(unsorted.getValue());

        }
        Collections.sort(sorted);
        return sorted;
    }
}
