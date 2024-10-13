package tn.esprit.gestionzoo.entities;

public class Animal {
   private String family;
   private String name;
   private int age;
   private boolean isMammal;

    // Parameterized constructor
    public Animal(String family, String name, int age, boolean isMammal) {

        this.family = family;
        this.name = name;
        setAge(age); // Utiliser le setter pour appliquer la vérification
        this.isMammal = isMammal;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("L'âge ne peut pas être négatif");
        }
        this.age = age;
    }


    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    public String toString() {
        return "Animal Name: " + name + ", Family: " + family + ", Age: " + age + ", Mammal: " + isMammal;
    }

}