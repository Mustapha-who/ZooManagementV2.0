package tn.esprit.gestionzoo.entities;

public abstract class Aquatic extends Animal implements Carnivore<Aquatic> {
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

    public String toString() {
        return "Aquatic{" + "habitat='" + habitat + '\'' + "} " + super.toString();
    }

    // abstract method you can define and use it in subclasses
    public  abstract void swim();


    // Checks if two Aquatic animals are equal based on their name, age, and habitat
    @Override
    public boolean equals(Object obj) {
        // Check if the two objects are the same reference
        if (this == obj) {
            return true;
        }

        // Check if the object is an instance of Aquatic
        if (obj == null || !(obj instanceof Aquatic)) {
            return false;
        }

        // Cast the object to Aquatic
        Aquatic other = (Aquatic) obj;

        // Compare the name, age, and habitat
        return this.getName().equals(other.getName()) &&
                this.getAge() == other.getAge() &&
                this.getHabitat().equals(other.getHabitat());
    }



}
