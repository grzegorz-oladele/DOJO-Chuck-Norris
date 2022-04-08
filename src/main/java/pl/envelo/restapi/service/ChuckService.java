package pl.envelo.restapi.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.envelo.restapi.dto.ChuckNorris;

@Service
@Slf4j
public class ChuckService {

    private final RestTemplate restTemplate = new RestTemplate();

    public String getJoke() {
        return restTemplate.getForObject("https://api.chucknorris.io/jokes/random", ChuckNorris.class).getValue();
    }
}
