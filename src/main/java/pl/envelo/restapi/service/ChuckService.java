package pl.envelo.restapi.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class ChuckService {

    private final RestTemplate restTemplate = new RestTemplate();

    public String getJoke() {
        String response = restTemplate.getForObject("https://api.chucknorris.io/jokes/random", String.class);
        log.info(response);
        return response;
    }
}
