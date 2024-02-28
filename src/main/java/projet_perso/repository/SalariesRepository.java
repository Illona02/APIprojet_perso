package projet_perso.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import projet_perso.model.Salaries;

@Repository
public interface SalariesRepository extends CrudRepository<Salaries, Long> {
    Iterable<Salaries> findByNomContaining(String nom);
}