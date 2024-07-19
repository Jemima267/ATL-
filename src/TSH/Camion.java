package TSH;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Camion extends Vehicule {
    private int poidsMaximum;
    private int volumeChargement;

    public Camion(int identifiant, String marque, String modele, int anneeProduction, int poidsMaximum, int volumeChargement) {
        super(identifiant, marque, modele, anneeProduction);
        this.poidsMaximum = poidsMaximum;
        this.volumeChargement = volumeChargement;
    }

    public int getPoidsMaximum() {
        return this.poidsMaximum;
    }

    public int getVolumeChargement() {
        return this.volumeChargement;
    }
}

