package tn.esprit.gestionzoo.entities;

public class Terrestrial implements Omnivore<Food> {
    private  int nbrLegs; // Number of legs of the terrestrial animal

    public void eatMeat(Food food) {
        if (food == Food.MEAT || food == Food.BOTH) {
            System.out.println("L'animal terrestre mange de la viande.");
        } else {
            System.out.println("L'animal terrestre ne mange pas de viande.");
        }
    }

    @Override
    public void eatPlant(Food food) {
        if (food == Food.PLANT || food == Food.BOTH) {
            System.out.println("L'animal terrestre mange des plantes.");
        } else {
            System.out.println("L'animal terrestre ne mange pas de plantes.");
        }
    }

    @Override
    public void eatPlantAndMeat(Food food) {
        if (food == Food.BOTH) {
            System.out.println("L'animal terrestre mange à la fois de la viande et des plantes.");
        } else {
            System.out.println("L'animal terrestre ne mange pas les deux.");
        }
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
