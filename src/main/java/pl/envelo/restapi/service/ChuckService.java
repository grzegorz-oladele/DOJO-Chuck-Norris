package pl.envelo.restapi.service;

import com.fasterxml.jackson.databind.ObjectMapper;
<<<<<<< HEAD
=======
import lombok.extern.slf4j.Slf4j;
>>>>>>> d5a198506165b288476ff02753db1bf4c5d4c9f2
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.envelo.restapi.dto.ChuckNorris;

@Service
public class ChuckService {

    private final RestTemplate restTemplate = new RestTemplate();
    private final ObjectMapper objectMapper = new ObjectMapper();

<<<<<<< HEAD
    public ChuckNorris getJoke() {
        ChuckNorris response = restTemplate.getForObject("https://api.chucknorris.io/jokes/random", ChuckNorris.class);
        return objectMapper.convertValue(response, ChuckNorris.class);
=======
    public String getJoke() {
        ChuckNorris response = restTemplate.getForObject("https://api.chucknorris.io/jokes/random", ChuckNorris.class);
        return objectMapper.convertValue(response, ChuckNorris.class).getValue();
>>>>>>> d5a198506165b288476ff02753db1bf4c5d4c9f2
    }
}
