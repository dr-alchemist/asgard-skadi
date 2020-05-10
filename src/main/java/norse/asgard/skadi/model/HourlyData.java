package norse.asgard.skadi.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class HourlyData {

    private BigDecimal time;
    private String summary;
    private String icon;
    private BigDecimal precipIntensity;
    private BigDecimal precipProbability;
    private String precipType;
    private BigDecimal temperature;
    private BigDecimal apparentTemperature;
    private BigDecimal dewPoint;
    private BigDecimal humidity;
    private BigDecimal pressure;
    private BigDecimal windSpeed;
    private BigDecimal windGust;
    private BigDecimal windBearing;
    private BigDecimal cloudCover;
    private BigDecimal uvIndex;
    private BigDecimal visibility;
    private BigDecimal ozone;

}
