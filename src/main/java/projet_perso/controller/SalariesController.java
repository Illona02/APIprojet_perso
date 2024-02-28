package projet_perso.controller;

import org.springframework.web.bind.annotation.*;
import projet_perso.model.Salaries;
import projet_perso.services.SalariesService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:9300")
public class SalariesController {

    @Autowired
    private SalariesService salariesService;

    //Retourne tous les salaries
    @GetMapping("/salaries")
    public Iterable<Salaries> getSalaries() {
        return salariesService.getSalaries();
    }

    //Retourne un salarie en fonction de son nom
    @GetMapping("/salaries/{nom}")
    public Iterable<Salaries> getSalarieNom(@RequestParam(required = false) String nom) {
        if (nom != null && !nom.isEmpty()) {
            return salariesService.getSalarieNom(nom);
        } else {
            return salariesService.getSalaries();
        }

    }
    //Retourne un salarie en fonction de son id
    @GetMapping("/salarie/{id}")
    public Optional<Salaries> getSalaries(@PathVariable int id) {
        return salariesService.getSalaries(id);
    }
    //Supprime un salarie en fonction de son id
    @DeleteMapping("/salaries/{id}")
    public void deleteSalaries(@RequestBody final int id) {
        salariesService.deleteSalaries(id);
    }
    //Modifie un salarie
    @PutMapping("/salaries")
    public Salaries saveSalaries(@RequestBody Salaries salaries)  {
        return salariesService.saveSalaries(salaries);
    }


}
