import java.util.*;
import java.util.function.*;

public class StudentManagement implements Management {

    // Affiche tous les étudiants avec une action (consumer) sur chaque étudiant
    @Override
    public void displayStudents(List<Etudiant> students, Consumer<Etudiant> con) {
        // Parcourt la liste d'étudiants et applique l'action 'con' sur chaque étudiant
        students.forEach(con);
    }

    // Affiche les étudiants qui satisfont un filtre (predicate)
    @Override
    public void displayStudentsByFilter(List<Etudiant> students, Predicate<Etudiant> pre, Consumer<Etudiant> con) {
        // Filtre les étudiants avec le prédicat 'pre' et applique l'action 'con' sur ceux qui passent le filtre
        students.stream().filter(pre).forEach(con);
    }

    // Renvoie une chaîne avec les noms des étudiants, en utilisant une fonction
    @Override
    public String returnStudentsNames(List<Etudiant> students, Function<Etudiant, String> fun) {
        // Utilise la fonction 'fun' pour obtenir le nom de chaque étudiant et les concatène dans une seule chaîne
        StringBuilder names = new StringBuilder();
        for (Etudiant etudiant : students) {
            names.append(fun.apply(etudiant)).append(", ");
        }
        return names.toString();
    }

    // Crée un étudiant via un fournisseur
    @Override
    public Etudiant createStudent(Supplier<Etudiant> sup) {
        // Crée et retourne un étudiant en utilisant le fournisseur 'sup'
        return sup.get();
    }

    // Trie les étudiants par id en utilisant un comparateur
    @Override
    public List<Etudiant> sortStudentsById(List<Etudiant> students, Comparator<Etudiant> com) {
        // Trie les étudiants en utilisant le comparateur 'com' et retourne la liste triée
        students.sort(com);
        return students;
    }
}
