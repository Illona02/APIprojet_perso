package projet_perso.services;

import projet_perso.model.Site;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import projet_perso.repository.SiteRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Data
public class
    SiteService {

    @Autowired
    private SiteRepository siteRepository;

    public Optional<Site> getSite(final long id) {
        return siteRepository.findById(id);
    }

    public Iterable<Site> getSite() {
        return siteRepository.findAll();
    }

    public void deleteSite(final long id) {
        siteRepository.deleteById(id);
    }

    public Site saveSite(Site site) {
        Site savedSite = siteRepository.save(site);
        return savedSite;
    }
}