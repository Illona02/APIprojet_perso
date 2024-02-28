package projet_perso.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "salaries")
public class Salaries {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String nom;
    private String prenom;
    private String telephone_fixe;
    private String telephone_portable;
    private String email;

    private Long site_id;
    private Long service_id;

    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getTelephoneFixe() {
        return telephone_fixe;
    }

    public String getTelephonePortable() {
        return telephone_portable;
    }

    public String getEmail() {
        return email;
    }

    public Long getFkService() {
        return service_id;
    }

    public Long getFkSite() {
        return site_id;
    }
}
