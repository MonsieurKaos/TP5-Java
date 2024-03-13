package fr.morin.zoo;

public class Animal {
    private String Nom = "";
    private Sexe Sexe;
    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        this.Nom = nom;
    }

    public Sexe getSexe() {
        return Sexe;
    }

    public void setSexe(Sexe sexe) {
        this.Sexe = sexe;
    }

    public Animal(String nom ,Sexe sexe) {
        this.setNom(nom);
        this.setSexe(sexe);
    }

    @Override
    public String toString() {
        return "Je suis un animal du nom de "+getNom()+" et de sexe "+getSexe();
    }
}
