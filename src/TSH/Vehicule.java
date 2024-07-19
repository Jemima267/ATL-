package TSH;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Vehicule {
    protected int identifiant;
    protected String marque;
    protected String modele;
    protected int anneeProduction;

    public Vehicule(int identifiant, String marque, String modele, int anneeProduction) {
        this.identifiant = identifiant;
        this.marque = marque;
        this.modele = modele;
        this.anneeProduction = anneeProduction;
    }

    public int getIdentifiant() {
        return this.identifiant;
    }

    public String getMarque() {
        return this.marque;
    }

    public String getModele() {
        return this.modele;
    }

    public int getAnneeProduction() {
        return this.anneeProduction;
    }
}

