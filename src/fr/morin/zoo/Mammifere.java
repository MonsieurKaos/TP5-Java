package fr.morin.zoo;

public class Mammifere extends Animal{

    private int nbmamelles = 0;
    public int getNbmamelles() {
        return nbmamelles;
    }

    public void setNbmamelles(int nbmamelles) {
        this.nbmamelles = nbmamelles;
    }
    public Mammifere(String nom, Sexe sexe, int nbmamelles) {
        super(nom, sexe);
        setNbmamelles(nbmamelles);
    }
    public Mammifere(String nom, Sexe sexe) {
        super(nom, sexe);
        setNbmamelles(nbmamelles);
    }

    @Override
    public String toString() {
        return super.toString()+" Je suis aussi un mammifere";
    }
}
