package codeki.vuelos_api.Services;

import codeki.vuelos_api.modelo.Flight;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {

    Flight flightint1 = new Flight(5l, "MIA", "BUe", "Lun-23", "Lun-23", 342.500, "Diaria");


    public List<Flight> listarFlights() {
        return List.of(flightint1);
    }
}
