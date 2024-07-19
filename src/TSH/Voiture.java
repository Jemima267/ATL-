package TSH;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Voiture extends Vehicule {
    private int nbPortes;
    private int puissanceMoteur;

    public Voiture(int identifiant, String marque, String modele, int anneeProduction, int nbPortes, int puissanceMoteur) {
        super(identifiant, marque, modele, anneeProduction);
        this.nbPortes = nbPortes;
        this.puissanceMoteur = puissanceMoteur;
    }

    public int getNbPortes() {
        return this.nbPortes;
    }

    public int getPuissanceMoteur() {
        return this.puissanceMoteur;
    }
}
