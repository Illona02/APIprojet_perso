package projet_perso.repository;

import projet_perso.controller.ServicesController;
import projet_perso.controller.SiteController;
import projet_perso.model.All;
import projet_perso.model.Salaries;
import projet_perso.model.Services;
import projet_perso.model.Site;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class AllRepository {

    @Autowired
    private SiteController siteController;

    @Autowired
    private ServicesController servicesController;
    public List<All> getAll(Iterable<Salaries> salaries, Long service, Long site) {
        List<All> listAll = new ArrayList<All>();
        for (Salaries salarie : salaries) {
            Optional<Site> respSite = siteController.getSite(salarie.getFkSite());
            Optional<Services> respServices = servicesController.getServices(salarie.getFkService());
            if (service == null && site == null || service == null && site == respSite.get().getId() || service == respServices.get().getId() && site == null || site == respSite.get().getId() && service == respServices.get().getId()) {
                All resp = new All();
                resp.setId(salarie.getId());
                resp.setNom(salarie.getNom());
                resp.setPrenom(salarie.getPrenom());
                resp.setTelephoneFixe(salarie.getTelephoneFixe());
                resp.setTelephonePortable(salarie.getTelephonePortable());
                resp.setEmail(salarie.getEmail());

                resp.setVille(respSite.get().getVille());
                resp.setFonction(respServices.get().getFonction());
                listAll.add(resp);
            }
        }
        return listAll;
    }

}
