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

    @GetMapping("/salaries")
    public Iterable<Salaries> getSalaries() {
        return salariesService.getSalaries();
    }

    @GetMapping("/salaries/{nom}")
    public Iterable<Salaries> getSalarieNom(@RequestParam(required = false) String nom) {
        if (nom != null && !nom.isEmpty()) {
            return salariesService.getSalarieNom(nom);
        } else {
            return salariesService.getSalaries();
        }

    }
    @GetMapping("/salarie/{id}")
    public Optional<Salaries> getSalaries(@PathVariable int id) {
        return salariesService.getSalaries(id);
    }

    @DeleteMapping("/salaries/{id}")
    public void deleteSalaries(@RequestBody final int id) {
        salariesService.deleteSalaries(id);
    }

    @PutMapping("/salaries")
    public Salaries saveSalaries(@RequestBody Salaries salaries)  {
        return salariesService.saveSalaries(salaries);
    }


}
