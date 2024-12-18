import java.util.TreeSet;
import java.util.TreeMap;

public class main {
    public static void main(String[] args) {
        // Création de l'instance de DepartementHashSet
        DepartementHashSet gestionDepartements = new DepartementHashSet();

        // Ajout de départements
        département dep1 = new département(1, "Informatique", 50);
        département dep2 = new département(2, "Mathematiques", 30);
        département dep3 = new département(3, "Physique", 20);

        gestionDepartements.ajouterDepartement(dep1);
        gestionDepartements.ajouterDepartement(dep2);
        gestionDepartements.ajouterDepartement(dep3);

        System.out.println("Liste des départements après ajout :");
        gestionDepartements.displayDepartement();

        // Recherche par nom
        System.out.println("\nRecherche du département 'Informatique' :");
        System.out.println(gestionDepartements.rechercherDepartement("Informatique"));

        // Recherche par objet
        System.out.println("\nRecherche du département dep1 :");
        System.out.println(gestionDepartements.rechercherDepartement(dep1));

        // Suppression d'un département
        System.out.println("\nSuppression du département dep2...");
        gestionDepartements.supprimerDepartement(dep2);



        System.out.println("\nListe des départements après suppression :");
        gestionDepartements.displayDepartement();

        // Tri des départements par ID
        System.out.println("\nDépartements triés par ID :");
        TreeSet<département> departementsTries = gestionDepartements.trierDepartementById();
        for (département d : departementsTries) {
            System.out.println(d);
        }

System.out.println("\n");

System.out.println("//**************************** PROSIT 11 *********************************************\\\\");

        AffectationHashMap gestionAffectations = new AffectationHashMap();

        département informatique = new département(1, "Informatique", 50);
        département mathematiques = new département(2, "Mathématiques", 30);

        // Affectations
        gestionAffectations.ajouterEmployeDepartement("Alice", informatique);
        gestionAffectations.ajouterEmployeDepartement("Bob", mathematiques);
        gestionAffectations.ajouterEmployeDepartement("Alice", mathematiques); // Test duplication



        // Afficher la liste des employés
        System.out.println("\nListe des employés :");
        gestionAffectations.afficherEmployes();

        // Afficher la liste des départements
        System.out.println("\nListe des départements :");
        gestionAffectations.afficherDepartements();

        // Rechercher un employé
        System.out.println("\nRecherche d'un employé :");
        gestionAffectations.rechercherEmploye("Alice");  // L'employé est trouvé
        gestionAffectations.rechercherEmploye("Charlie");  // L'employé n'existe pas

        // Rechercher un département
        System.out.println("\nRecherche d'un Département :");
        gestionAffectations.rechercherDepartement(informatique);  // Département trouvé
        gestionAffectations.rechercherDepartement(new département(3, "Physique", 20));  // Département trouvé



        // Afficher les employés et leurs départements
        System.out.println("\nListe des employés et leurs départements :");
        gestionAffectations.afficherEmployesEtDepartements();


        // Supprimer un employé
        gestionAffectations.supprimerEmploye("Alice");

        // Afficher de nouveau après la suppression
        System.out.println("\nListe des employés après suppression :");
        gestionAffectations.afficherEmployesEtDepartements();

        gestionAffectations.ajouterEmployeDepartement("Alice", informatique);

        // Supprimer un employé d'un département spécifique
        gestionAffectations.supprimerEmployeEtDepartement("Alice", informatique);

        // Afficher de nouveau après la suppression
        System.out.println("\nListe des employés après suppression :");
        gestionAffectations.afficherEmployesEtDepartements();
    }





}
