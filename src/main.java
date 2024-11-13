public class main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        employe e1 = new employe(5, "Sara", "Ahmed", "IT", 5);
        employe e2 = new employe(8, "Mohamed", "Zouari", "HR", 4);
        employe e3 = new employe(1, "Ali", "Moussa", "Finance", 3);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);

        // Affichage des employés
        System.out.println("Liste des employés:");
        societe.displayEmploye();

        // Tri par id
        societe.trierEmployeParId();
        System.out.println("Après tri par ID:");
        societe.displayEmploye();

        // Tri par nom, département et grade
        societe.trierEmployeParNomDépartementEtGrade();
        System.out.println("Après tri par nom, département et grade:");
        societe.displayEmploye();

        // Recherche d'un employé
        System.out.println("Recherche de l'employé 'Ali': " + societe.rechercherEmploye("Ali"));
    }
}
