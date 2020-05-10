package norse.asgard.skadi.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class Alerts {

    private String title;
    private List<String> regions;
    private String severity;
    private BigDecimal time;
    private BigDecimal expires;
    private String description;
    private String uri;

}
