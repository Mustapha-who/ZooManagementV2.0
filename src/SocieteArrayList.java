import java.util.ArrayList;
import java.util.Comparator;

public class SocieteArrayList implements IGestion<employe> {

    private ArrayList<employe> employes;

    public SocieteArrayList() {
        employes = new ArrayList<>();
    }

    @Override
    public void ajouterEmploye(employe employe) {
        employes.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (employe employe : employes) {
            if (employe.getNom().equalsIgnoreCase(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(employe employe) {
        return employes.contains(employe);
    }

    @Override
    public void supprimerEmploye(employe employe) {
        employes.remove(employe);
    }

    @Override
    public void displayEmploye() {
        for (employe employe : employes) {
            System.out.println(employe);
        }
    }

    @Override
    public void trierEmployeParId() {
        employes.sort(null); // Comparable par défaut, trier par id
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        employes.sort(new Comparator<employe>() {
            @Override
            public int compare(employe e1, employe e2) {
                int nomCompare = e1.getNom().compareTo(e2.getNom());
                if (nomCompare != 0) return nomCompare;

                int depCompare = e1.getDepartement().compareTo(e2.getDepartement());
                if (depCompare != 0) return depCompare;

                return Integer.compare(e1.getGrade(), e2.getGrade());
            }
        });
    }
}
