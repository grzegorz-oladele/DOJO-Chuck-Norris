package pl.envelo.restapi.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.envelo.restapi.dto.ChuckNorris;

@Service
@Slf4j
public class ChuckService {

    private final RestTemplate restTemplate = new RestTemplate();
    private final ObjectMapper objectMapper = new ObjectMapper();

    public String getJoke() {
        ChuckNorris response = restTemplate.getForObject("https://api.chucknorris.io/jokes/random", ChuckNorris.class);
        return objectMapper.convertValue(response, ChuckNorris.class).getValue();
    }
}
