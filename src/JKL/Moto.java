package JKL;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import TSH.Vehicule;

class Moto extends Vehicule {
    private int cylindree;
    private boolean estPermis125cc;

    public Moto(int identifiant, String marque, String modele, int anneeProduction, int cylindree, boolean estPermis125cc) {
        super(identifiant, marque, modele, anneeProduction);
        this.cylindree = cylindree;
        this.estPermis125cc = estPermis125cc;
    }

    public int getCylindree() {
        return this.cylindree;
    }

    public boolean getEstPermis125cc() {
        return this.estPermis125cc;
    }
}

