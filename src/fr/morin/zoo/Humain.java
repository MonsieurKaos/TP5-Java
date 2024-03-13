package fr.morin.zoo;

public class Humain extends Mammifere{
    public Humain(String nom, Sexe sexe) {
        super(nom, sexe, 2);
    }
    @Override
    public String toString() {
        return super.toString()+" Je suis aussi un humain";
    }
}
