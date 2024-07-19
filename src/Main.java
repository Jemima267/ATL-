//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import JKL.ParcVehicule;
import TSH.Vehicule;

import java.util.Scanner;

public class Main {
    private static ParcVehicule parc = new ParcVehicule();
    private static Scanner scanner;

    public Main() {
    }

    public static void main(String[] args) {
        boolean quitter = false;

        while(!quitter) {
            afficherMenu();
            System.out.print("Choix : ");
            int choix = scanner.nextInt();
            scanner.nextLine();
            switch (choix) {
                case 1:
                    ajouterVehicule();
                    break;
                case 2:
                    supprimerVehicule();
                    break;
                case 3:
                    modifierVehicule();
                    break;
                case 4:
                    rechercherVehiculeParNom();
                    break;
                case 5:
                    listerVehiculesParLettre();
                    break;
                case 6:
                    quitter = true;
                    System.out.println("Bye bye!");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez saisir un nombre entre 1 et 6.");
            }
        }

    }

    private static void afficherMenu() {
        System.out.println("\n=== Menu ===");
        System.out.println("1. Ajouter un véhicule");
        System.out.println("2. Supprimer un véhicule");
        System.out.println("3. Modifier un véhicule");
        System.out.println("4. Rechercher un véhicule par nom");
        System.out.println("5. Lister les véhicules par lettre");
        System.out.println("6. Quitter");
    }

    private static void ajouterVehicule() {
        System.out.print("ID du véhicule : ");
        int id = scanner.nextInt();
        System.out.print("Marque du véhicule : ");
        scanner.nextLine();
        String marque = scanner.nextLine();
        System.out.print("Modèle du véhicule : ");
        String modele = scanner.nextLine();
        System.out.print("L'annee de Production : ");
        int anneeProduction = scanner.nextInt();
        Vehicule vehicule = new Vehicule(id, marque, modele, anneeProduction);
        ParcVehicule parc = new ParcVehicule();
        parc.ajouterVehicule(id, vehicule);
        System.out.println("Véhicule ajouté avec succès.");
    }

    private static void supprimerVehicule() {
        System.out.print("ID du véhicule à supprimer : ");
        int id = scanner.nextInt();
        parc.supprimerVehicule(id);
        System.out.println("Véhicule supprimé avec succès.");
    }

    private static void modifierVehicule() {
        System.out.print("ID du véhicule à modifier : ");
        int id = scanner.nextInt();
        System.out.print("Nouvelle marque du véhicule : ");
        String nouvelleMarque = scanner.nextLine();
        System.out.print("Nouveau modèle du véhicule : ");
        String nouveauModele = scanner.nextLine();
        System.out.print("L'annee de Production : ");
        int anneeProduction = scanner.nextInt();
        Vehicule nouveauVehicule = new Vehicule(id, nouvelleMarque, nouveauModele, anneeProduction);
        parc.modifierVehicule(id, nouveauVehicule);
        System.out.println("Véhicule modifié avec succès.");
    }

    private static void rechercherVehiculeParNom() {
        System.out.print("Nom du véhicule à rechercher : ");
        String nom = scanner.nextLine();
        Vehicule vehicule = parc.rechercherVehiculeParNom(nom);
        if (vehicule != null) {
            System.out.println("Véhicule trouvé : " + String.valueOf(vehicule));
        } else {
            System.out.println("Aucun véhicule trouvé avec ce nom.");
        }

    }

    private static void listerVehiculesParLettre() {
        System.out.print("Lettre pour filtrer les véhicules par marque : ");
        String lettre = scanner.nextLine();
        char premiereLettre = lettre.toLowerCase().charAt(0);
        System.out.println("Liste des véhicules dont la marque commence par '" + lettre + "' :");
        parc.listerVehiculeParLettre(premiereLettre).forEach((id, vehicule) -> {
            System.out.println("ID : " + id + ", Véhicule : " + String.valueOf(vehicule));
        });
    }

    static {
        scanner = new Scanner(System.in);
    }
}
