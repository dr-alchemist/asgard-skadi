package norse.asgard.skadi.service.impl;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import norse.asgard.skadi.model.DarkSkyResponse;
import norse.asgard.skadi.model.DarkSkyReturnResponse;
import norse.asgard.skadi.service.SkadiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class SkadiServiceImpl implements SkadiService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SkadiServiceImpl.class);

    @Override
    public DarkSkyReturnResponse showWeatherData() throws Exception {

        DarkSkyReturnResponse darkSkyReturnResponse = new DarkSkyReturnResponse();

        try {
            DarkSkyResponse darkSkyResponse = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                    .readValue(new File("/Users/sameerboppana/Downloads/darksky.json"), DarkSkyResponse.class);

            if (darkSkyResponse != null) {
                LOGGER.info("mapping object is not empty");
                darkSkyReturnResponse.setLatitude(darkSkyResponse.getLatitude());
                darkSkyReturnResponse.setLongitude(darkSkyResponse.getLongitude());
                darkSkyReturnResponse.setOffset(darkSkyResponse.getOffset());

            } else {
                LOGGER.error("*****Error****");
            }
        } catch (Exception e) {
//            LOGGER.error("Exception", e);
            throw new Exception("Mapping error", e);
        }

        return darkSkyReturnResponse;
    }

}
