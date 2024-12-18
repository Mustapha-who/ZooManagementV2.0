import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AffectationHashMap {
    // Une collection dynamique non triée : HashMap pour stocker les paires employé-département
    private HashMap<String, département> affectations;

    // Constructeur
    public AffectationHashMap() {
        this.affectations = new HashMap<>();
    }



    public void ajouterEmployeDepartement(String employe, département departement) {
        if (affectations.containsKey(employe)) {
            System.out.println("Erreur : L'employé " + employe + " est déjà affecté à un département.");
        } else {
            affectations.put(employe, departement);
            System.out.println("L'employé " + employe + " a été ajouté au département " + departement.getNom() + ".");
        }
    }


    // Méthode pour affecter un employé à un département
    public void affecterEmploye(String employe, département departement) {
        if (affectations.containsKey(employe)) {
            System.out.println("Erreur : L'employé " + employe + " est déjà affecté à un département.");
        } else {
            affectations.put(employe, departement);
            System.out.println("L'employé " + employe + " a été affecté au département " + departement.getNom() + ".");
        }
    }


    // Méthode pour supprimer un employé de la collection
    public void supprimerEmploye(String employe) {
        if (affectations.containsKey(employe)) {
            affectations.remove(employe);
            System.out.println("L'employé " + employe + " a été supprimé.");
        } else {
            System.out.println("Erreur : L'employé " + employe + " n'existe pas dans la collection.");
        }
    }

    // Méthode pour supprimer un employé d'un département spécifique
    public void supprimerEmployeEtDepartement(String employe, département departement) {
        if (affectations.containsKey(employe)) {
            // Vérifier si l'employé est affecté au département spécifié
            if (affectations.get(employe).equals(departement)) {
                affectations.remove(employe);
                System.out.println("L'employé " + employe + " a été supprimé du département " + departement.getNom() + ".");
            } else {
                System.out.println("Erreur : L'employé " + employe + " n'est pas affecté au département " + departement.getNom() + ".");
            }
        } else {
            System.out.println("Erreur : L'employé " + employe + " n'existe pas dans la collection.");
        }
    }


    // Méthode pour rechercher un employé dans la collection
    public boolean rechercherEmploye(String employe) {
        if (affectations.containsKey(employe)) {
            System.out.println("L'employé " + employe + " est présent dans la collection.");
            return true;
        } else {
            System.out.println("L'employé " + employe + " n'existe pas dans la collection.");
            return false;
        }
    }

    // Méthode pour rechercher un département dans la collection
    public boolean rechercherDepartement(département d) {
        if (affectations.containsValue(d)) {
            System.out.println("Le département " + d.getNom() + " est présent dans la collection.");
            return true;
        } else {
            System.out.println("Le département " + d.getNom() + " n'existe pas dans la collection.");
            return false;
        }
    }


    // Méthode pour afficher les employés et leurs départements
    public void afficherEmployesEtDepartements() {
        if (affectations.isEmpty()) {
            System.out.println("Aucune affectation disponible.");
        } else {
            affectations.forEach((employe, departement) ->
                    System.out.println("Employé : " + employe + " -> Département : " + departement.getNom())
            );
        }
    }

    // Méthode pour afficher uniquement les employés
    public void afficherEmployes() {
        if (affectations.isEmpty()) {
            System.out.println("Aucun employé dans la collection.");
        } else {
            System.out.println("Liste des employés :");
            affectations.keySet().forEach(employe -> System.out.println(employe));
        }
    }

    // Méthode pour afficher uniquement les départements
    public void afficherDepartements() {
        if (affectations.isEmpty()) {
            System.out.println("Aucun département dans la collection.");
        } else {
            System.out.println("Liste des départements :");
            affectations.values().forEach(departement -> System.out.println(departement.getNom()));
        }
    }




}
