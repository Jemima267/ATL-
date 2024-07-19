package JKL;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import JKL.Moto;
import TSH.Camion;
import TSH.Vehicule;
import TSH.Voiture;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ParcVehicule {
    private Map<Integer, Vehicule> vehicules = new HashMap();

    public void ajouterVehicule(int id, Vehicule vehicule) {
    }

    public ParcVehicule() {
    }

    public void ajouterVehicule(Vehicule vehicule) {
        this.vehicules.put(vehicule.getIdentifiant(), vehicule);
    }

    public void supprimerVehicule(int identifiant) {
        this.vehicules.remove(identifiant);
    }

    public void modifierVehicule(int identifiant, Vehicule nouveauVehicule) {
        this.vehicules.put(identifiant, nouveauVehicule);
    }

    public Vehicule rechercherVehiculeParNom(String nom) {
        return (Vehicule)this.vehicules.values().stream().filter((v) -> {
            return v.getMarque().equalsIgnoreCase(nom) || v.getModele().equalsIgnoreCase(nom);
        }).findFirst().orElse ((Vehicule) null);
    }

    public Map<Integer, Vehicule> listerVehiculeParLettre(char lettre) {
        return (Map)this.vehicules.values().stream().filter((v) -> {
            return v.getMarque().startsWith(String.valueOf(lettre)) || v.getModele().startsWith(String.valueOf(lettre));
        }).collect(Collectors.toMap(Vehicule::getIdentifiant, (v) -> {
            return v;
        }));
    }

    public int getNombreVehicules() {
        return this.vehicules.size();
    }

    public void afficherDetailsVehicule(int identifiant) {
        Vehicule vehicule = (Vehicule)this.vehicules.get(identifiant);
        if (vehicule != null) {
            System.out.println("Identifiant : " + vehicule.getIdentifiant());
            System.out.println("Marque : " + vehicule.getMarque());
            System.out.println("Modèle : " + vehicule.getModele());
            System.out.println("Année de production : " + vehicule.getAnneeProduction());
            if (vehicule instanceof Voiture) {
                Voiture voiture = (Voiture)vehicule;
                System.out.println("Nombre de portes : " + voiture.getNbPortes());
                System.out.println("Puissance moteur : " + voiture.getPuissanceMoteur() + " ch");
            } else if (vehicule instanceof Camion) {
                Camion camion = (Camion)vehicule;
                System.out.println("Poids maximum : " + camion.getPoidsMaximum() + " kg");
                System.out.println("Volume de chargement : " + camion.getVolumeChargement() + " m³");
            } else if (vehicule instanceof Moto) {
                Moto moto = (Moto)vehicule;
                PrintStream var10000 = System.out;
                int var10001 = moto.getCylindree();
                var10000.println("Cylindrée : " + var10001 + " cc");
                System.out.println("Permis 125cc : " + (moto.getEstPermis125cc() ? "Oui" : "Non"));
            }
        } else {
            System.out.println("Aucun véhicule avec cet identifiant.");
        }

    }

    public void afficherVehiculesParMarque(String marque) {
        Map<Integer, Vehicule> vehiculesParMarque = (Map)this.vehicules.values().stream().filter((v) -> {
            return v.getMarque().equalsIgnoreCase(marque);
        }).collect(Collectors.toMap(Vehicule::getIdentifiant, (v) -> {
            return v;
        }));
        if (vehiculesParMarque.isEmpty()) {
            System.out.println("Aucun véhicule de la marque " + marque + " dans le parc.");
        } else {
            System.out.println("Véhicules de la marque " + marque + " :");
            vehiculesParMarque.forEach((id, v) -> {
                System.out.println("- Identifiant : " + id + ", Modèle : " + v.getModele());
            });
        }

    }
}
