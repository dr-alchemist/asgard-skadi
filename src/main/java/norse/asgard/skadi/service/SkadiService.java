package norse.asgard.skadi.service;

import norse.asgard.skadi.model.DarkSkyReturnResponse;
import org.springframework.stereotype.Service;

@Service
public interface SkadiService {

    public DarkSkyReturnResponse showWeatherData() throws Exception;

}
