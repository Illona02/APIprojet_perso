package projet_perso.controller;

import projet_perso.model.All;
import projet_perso.services.AllService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:9300/")
public class AllController {

    @Autowired
    private AllService allService;

    //Retourne tous les salaries avec les valeurs fk (villes,fonction)
    @GetMapping("/all")
    public List<All> getAll(@RequestParam(required = false) String nom, @RequestParam(required = false) Long service, @RequestParam(required = false) Long site) {
        return allService.getAll(nom, service, site);
    }
}