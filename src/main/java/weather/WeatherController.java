package weather;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static weather.Temperature.TemperatureUnit.CELSIUS;

@RestController
public class WeatherController {

    @RequestMapping("/weather")
    public Weather weather() {
        City city = new City("Winterfell");
        Temperature temperature = new Temperature(-30, CELSIUS);
        return new Weather(city, temperature);
    }
    
}