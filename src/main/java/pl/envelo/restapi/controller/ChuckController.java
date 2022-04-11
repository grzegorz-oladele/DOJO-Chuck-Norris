package pl.envelo.restapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.envelo.restapi.dto.ChuckNorris;
import pl.envelo.restapi.service.ChuckService;

@RestController
@RequestMapping("/chuck")
@RequiredArgsConstructor
public class ChuckController {

    private final ChuckService service;

    @GetMapping()
    public ChuckNorris getJoke() {
        return service.getJoke();
    }
}
