package codeki.vuelos_api.controller;

import codeki.vuelos_api.modelo.Flight;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flights")


public class FlightController {

    Flight flight1 = new Flight();

    @GetMapping
    public Flight hola() {
        return flight1;
    }
}
