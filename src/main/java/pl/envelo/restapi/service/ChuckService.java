package pl.envelo.restapi.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.envelo.restapi.dto.ChuckNorris;

@Service
public class ChuckService {

    private final RestTemplate restTemplate = new RestTemplate();
    private final ObjectMapper objectMapper = new ObjectMapper();

    public ChuckNorris getJoke() {
        ChuckNorris response = restTemplate.getForObject("https://api.chucknorris.io/jokes/random", ChuckNorris.class);
        return objectMapper.convertValue(response, ChuckNorris.class);
    }
}
