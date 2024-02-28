package projet_perso.controller;

import org.springframework.web.bind.annotation.*;
import projet_perso.model.Services;
import projet_perso.services.ServicesService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:9300")
public class ServicesController {

    @Autowired
    private ServicesService servicesService;

    @GetMapping("/services")
    public Iterable<Services> getServices() {
        return servicesService.getServices();
    }

    @GetMapping("/services/{id}")
    public Optional<Services> getServices(Long id) {
        return servicesService.getServices(id);
    }

    @DeleteMapping("/services/{id}")
    public void deleteServices(@RequestBody final Long id) {
        servicesService.deleteServices(id);
    }

    @PutMapping("/services")
    public Services saveServices(@RequestBody Services services)  {
        return servicesService.saveServices(services);
    }
}
