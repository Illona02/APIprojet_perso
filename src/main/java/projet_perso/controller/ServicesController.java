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

    //Retourne tous les services
    @GetMapping("/services")
    public Iterable<Services> getServices() {
        return servicesService.getServices();
    }
    //Retourne un service en fonction de son id
    @GetMapping("/services/{id}")
    public Optional<Services> getServices(Long id) {
        return servicesService.getServices(id);
    }
    //Supprime un service en fonction de son id
    @DeleteMapping("/services/{id}")
    public void deleteServices(@RequestBody final Long id) {
        servicesService.deleteServices(id);
    }

    //Modifie un service
    @PutMapping("/services")
    public Services saveServices(@RequestBody Services services)  {
        return servicesService.saveServices(services);
    }
}
