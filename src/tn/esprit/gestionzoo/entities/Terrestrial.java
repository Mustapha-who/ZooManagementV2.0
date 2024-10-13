package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal{
    private  int nbrLegs; // Number of legs of the terrestrial animal

    // Constructeur paramétré
    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal); // Appeler le constructeur de Animal
        this.nbrLegs = nbrLegs;
    }

    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    public String toString() {
        return "Terrestrial{" + "nbrLegs=" + nbrLegs + "} " + super.toString();
    }
}
