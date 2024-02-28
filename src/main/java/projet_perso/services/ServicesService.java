package projet_perso.services;

import projet_perso.model.Services;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import projet_perso.repository.ServicesRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Data
public class ServicesService {

    @Autowired
    private ServicesRepository servicesRepository;

    public Optional<Services> getServices(final Long id) {
        return servicesRepository.findById(id);
    }

    public Iterable<Services> getServices() {
        return servicesRepository.findAll();
    }

    public void deleteServices(final Long id) {
        servicesRepository.deleteById(id);
    }

    public Services saveServices(Services services) {
        Services savedServices = servicesRepository.save(services);
        return savedServices;
    }
}