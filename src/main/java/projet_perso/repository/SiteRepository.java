package projet_perso.repository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;
import projet_perso.model.Site;

@Repository
public interface SiteRepository extends CrudRepository<Site, Long> {
}