package projet_perso.services;

import projet_perso.model.Salaries;
import projet_perso.repository.SalariesRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class SalariesService {

    @Autowired
    private SalariesRepository salariesRepository;

    //int
    public Optional<Salaries> getSalaries(final long id) {
        return salariesRepository.findById(id);
    }

    public Iterable<Salaries> getSalaries() {
        return salariesRepository.findAll();
    }

    //int
    public void deleteSalaries(final long id) {
        salariesRepository.deleteById(id);
    }

    public Salaries saveSalaries(Salaries salaries) {
        Salaries savedSalaries = salariesRepository.save(salaries);
        return savedSalaries;
    }

    public Iterable<Salaries> getSalarieNom(String nom) {
        Iterable<Salaries> savedSalaries = salariesRepository.findByNomContaining(nom);
        return savedSalaries;
        }
}

