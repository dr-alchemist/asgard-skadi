package norse.asgard.skadi.controller;

import norse.asgard.skadi.model.DarkSkyReturnResponse;
import norse.asgard.skadi.service.SkadiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkadiController {

    @Autowired
    private SkadiService skadiService;

    @GetMapping("/weatherinfo")
    @ResponseBody
    public DarkSkyReturnResponse weatherForecast() throws Exception {

        skadiService.showWeatherData();
//        DarkSkyReturnResponse darkSkyReturnResponse = new DarkSkyReturnResponse();

        return skadiService.showWeatherData();
    }


}
