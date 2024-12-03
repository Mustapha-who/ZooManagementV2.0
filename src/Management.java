import java.util.*;
import java.util.function.*;

public interface Management {

    // Affiche tous les étudiants avec une action (consumer) sur chaque étudiant
    void displayStudents(List<Etudiant> students, Consumer<Etudiant> con);

    // Affiche les étudiants qui satisfont un filtre (predicate)
    void displayStudentsByFilter(List<Etudiant> students, Predicate<Etudiant> pre, Consumer<Etudiant> con);

    // Renvoie une chaîne avec les noms des étudiants, en utilisant une fonction
    String returnStudentsNames(List<Etudiant> students, Function<Etudiant, String> fun);

    // Crée un étudiant via un fournisseur
    Etudiant createStudent(Supplier<Etudiant> sup);

    // Trie les étudiants par id en utilisant un comparateur
    List<Etudiant> sortStudentsById(List<Etudiant> students, Comparator<Etudiant> com);
}
