package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal {
  private  String habitat; // The habitat where the aquatic animal lives

    // Constructeur paramétré
    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal); // Appeler le constructeur de Animal
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }


    // Swim method for Aquatic animals
    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }

    public String toString() {
        return "Aquatic{" + "habitat='" + habitat + '\'' + "} " + super.toString();
    }

}
