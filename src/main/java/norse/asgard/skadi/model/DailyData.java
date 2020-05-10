package norse.asgard.skadi.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class DailyData {

    private BigDecimal time;
    private String summary;
    private String icon;
    private BigDecimal sunriseTime;
    private BigDecimal sunsetTime;
    private BigDecimal moonPhase;
    private BigDecimal precipIntensity;
    private BigDecimal precipIntensityMax;
    private BigDecimal precipIntensityMaxTime;
    private BigDecimal precipProbability;
    private String precipType;
    private BigDecimal temperatureHigh;
    private BigDecimal temperatureHighTime;
    private BigDecimal temperatureLow;
    private BigDecimal temperatureLowTime;
    private BigDecimal apparentTemperatureHigh;
    private BigDecimal apparentTemperatureHighTime;
    private BigDecimal apparentTemperatureLow;
    private BigDecimal apparentTemperatureLowTime;
    private BigDecimal dewPoint;
    private BigDecimal humidity;
    private BigDecimal pressure;
    private BigDecimal windSpeed;
    private BigDecimal windGust;
    private BigDecimal windGustTime;
    private BigDecimal windBearing;
    private BigDecimal cloudCover;
    private BigDecimal uvIndex;
    private BigDecimal uvIndexTime;
    private BigDecimal visibility;
    private BigDecimal ozone;
    private BigDecimal temperatureMin;
    private BigDecimal temperatureMinTime;
    private BigDecimal temperatureMax;
    private BigDecimal temperatureMaxTime;
    private BigDecimal apparentTemperatureMin;
    private BigDecimal apparentTemperatureMinTime;
    private BigDecimal apparentTemperatureMax;
    private BigDecimal apparentTemperatureMaxTime;


}
