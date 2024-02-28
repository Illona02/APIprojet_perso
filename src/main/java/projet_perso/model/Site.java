package projet_perso.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "site")

public class Site {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ville;

    public Long getId() {
        return id;
    }

    public String getVille() {
        return ville;
    }

}