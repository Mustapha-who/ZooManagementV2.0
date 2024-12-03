import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        // Liste d'étudiants
        List<Etudiant> students = new ArrayList<>();
        students.add(new Etudiant(3, "wiem", 22));
        students.add(new Etudiant(5, "mustapha", 20));
        students.add(new Etudiant(1, "omar", 23));

        // Création de l'instance de gestion
        Management management = new StudentManagement();

        // Affichage des étudiants
        System.out.println("All students:");
        management.displayStudents(students, System.out::println);

        // Affichage des étudiants filtrés par âge
        System.out.println("\nStudents older than 21:");
        management.displayStudentsByFilter(students, s -> s.getAge() > 21, System.out::println);

        // Récupération des noms des étudiants
        String names = management.returnStudentsNames(students, Etudiant::getNom);
        System.out.println("\nStudents names: " + names);

        // Création d'un nouvel étudiant
        Etudiant newStudent = management.createStudent(() -> new Etudiant(4, "ali", 24));
        System.out.println("\nNew student: " + newStudent);

        // Tri des étudiants par ID
        List<Etudiant> sortedStudents = management.sortStudentsById(students, Comparator.comparingInt(Etudiant::getId));
        System.out.println("\nSorted students by ID:");
        sortedStudents.forEach(System.out::println);
    }
}
