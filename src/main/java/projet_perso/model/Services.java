package projet_perso.model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "service")
public class Services {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fonction;

    public Long getId() {
        return id;
    }

    public String getFonction() {
        return fonction;
    }
}
