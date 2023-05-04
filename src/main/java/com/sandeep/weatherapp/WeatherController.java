package com.sandeep.weatherapp;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/weather")
public class WeatherController {




@Value("${OPENWEATHERMAP_API_KEY}")
     String API_KEY = System.getenv("OPENWEATHERMAP_API_KEY");


    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/{city}")
    public ResponseEntity<WeatherData> getWeather(@PathVariable String city) {
        RestTemplate restTemplate = new RestTemplate();
        String apiUrl = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + API_KEY + "&units=metric";
        WeatherData weatherData = restTemplate.getForObject(apiUrl, WeatherData.class);
        return ResponseEntity.ok(weatherData);
    }
}

