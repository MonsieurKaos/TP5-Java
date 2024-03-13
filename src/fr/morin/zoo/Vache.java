package fr.morin.zoo;

public class Vache extends Mammifere{

    public Vache(String nom, Sexe sexe) {
        super(nom, sexe, 4);
    }

    @Override
    public String toString() {
        return super.toString()+" Je suis aussi une vache";
    }
}
