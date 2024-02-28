package projet_perso.model;

public class All {

    Long id;
    String nom;

    String prenom;

    String telephone_fixe;

    String telephone_portable;

    String email;

    String ville;

    String fonction;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelephoneFixe() {
        return telephone_fixe;
    }

    public void setTelephoneFixe(String telephone_fixe) {
        this.telephone_fixe = telephone_fixe;
    }

    public String getTelephonePortable() {
        return telephone_portable;
    }

    public void setTelephonePortable(String telephone_portable) {
        this.telephone_portable = telephone_portable;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }
}