package projet_perso.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import projet_perso.model.Services;

@Repository
public interface ServicesRepository extends CrudRepository<Services, Long> {
}