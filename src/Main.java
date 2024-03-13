import fr.morin.zoo.*;

public class Main {
    public static void main(String[] args) {
            Animal[] animaux = new Animal[5];
            animaux[0] = new Animal("Rex", Sexe.Masculin);
            animaux[1] = new Mammifere("Médor", Sexe.Indetermine);
            animaux[2] = new Humain("Jacques", Sexe.Masculin);
            animaux[3] = new Vache("Noiraude", Sexe.Feminin);
            animaux[4] = new Vache("Gnnnnn", Sexe.Masculin);
            for(Animal animal : animaux)
                System.out.println(animal);
    }
}