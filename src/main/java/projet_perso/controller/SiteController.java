package projet_perso.controller;

import org.springframework.web.bind.annotation.*;
import projet_perso.model.Site;
import projet_perso.services.SiteService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:9300")

public class SiteController {

    @Autowired
    private SiteService siteService;

    //Retourne tous les sites
    @GetMapping("/site")
    public Iterable<Site> getSite() {
        return siteService.getSite();
    }
    //Retourne un site en fonction de son id
    @GetMapping("/site/{id}")
    public Optional<Site> getSite(Long id) {
        return siteService.getSite(id);
    }
    //Supprime un site en fonction de son id
    @DeleteMapping("/site/{id}")
    public void deleteSite(@PathVariable final Long id) {
        siteService.deleteSite(id);
    }

    //Modifie un site
    @PutMapping("/site")
    public Site saveSite(@RequestBody Site site)  {
        return siteService.saveSite(site);
    }
}
