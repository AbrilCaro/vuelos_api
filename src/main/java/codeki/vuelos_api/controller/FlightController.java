package codeki.vuelos_api.controller;

import codeki.vuelos_api.Services.FlightService;
import codeki.vuelos_api.modelo.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flights")


public class FlightController {

    @Autowired
    private FlightService flightService;

    @GetMapping
    public List<Flight> hola() {

        return flightService.listarFlights();
    }
}
