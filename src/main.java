import java.util.TreeSet;

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
    }
}
