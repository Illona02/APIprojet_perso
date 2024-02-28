package projet_perso.services;

import projet_perso.controller.SalariesController;
import projet_perso.model.All;
import projet_perso.model.Salaries;
import projet_perso.repository.AllRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AllService {

    @Autowired
    private AllRepository allRepository;
    @Autowired
    private SalariesController salariesController;
    public List<All> getAll(String nom, Long services, Long site) {
        Iterable<Salaries> salaries = salariesController.getSalarieNom(nom);
        return allRepository.getAll(salaries, services, site);
    }
}