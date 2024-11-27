import java.util.HashSet;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<département> {
    private HashSet<département> departements;

    // Constructor
    public DepartementHashSet() {
        this.departements = new HashSet<>();
    }

    @Override
    public void ajouterDepartement(département t) {
        departements.add(t);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (département d : departements) {
            if (d.getNom().equalsIgnoreCase(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(département t) {
        return departements.contains(t);
    }

    @Override
    public void supprimerDepartement(département t) {
        departements.remove(t);
    }

    @Override
    public void displayDepartement() {
        for (département d : departements) {
            System.out.println(d);
        }
    }

    @Override
    public TreeSet<département> trierDepartementById() {
        TreeSet<département> sortedSet = new TreeSet<>((d1, d2) -> Integer.compare(d1.getId(), d2.getId()));
        sortedSet.addAll(departements);
        return sortedSet;
    }
}
