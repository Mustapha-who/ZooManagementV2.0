import java.util.*;

public class ZooManagement {


    public static void main(String[] args) {
        // Creating an animal (lion)
        Animal lion = new Animal("Felidae", "Lion", 5, true);


        // Creating a zoo
        Zoo myZoo = new Zoo("just_a_zoo", "tunisia");

        Animal tiger = new Animal("Felidae", "Tiger", 4, true);
        Animal elephant = new Animal("Elephantidae", "Elephant", 10, true);
        Animal zebra = new Animal("Equidae", "Zebra", 3, false);
        Animal zebra1 = new Animal("Equidae", "Zebra", 3, false);


        // Adding animals to the zoo
        myZoo.addAnimal(zebra);
        myZoo.addAnimal(elephant);
        myZoo.addAnimal(tiger);

// Searching for an animal
        int searchIndex = myZoo.searchAnimal(zebra1);
        if (searchIndex != -1) {
            System.out.println("Animal trouvé à l'indice: " + searchIndex);
        } else {
            System.out.println("Animal non trouvé.");
        }

// Displaying the current state of the zoo
        System.out.println("\n=== État actuel du zoo ===");
        myZoo.displayZoo();

// Removing an animal from the zoo
        System.out.println("\n=== Suppression d'un animal (Lion) ===");
        myZoo.removeAnimal(lion);

// Displaying the updated state of the zoo
        System.out.println("\n=== État mis à jour du zoo après suppression ===");
        myZoo.displayZoo();

// Displaying the zoo's details
        System.out.println("\n=== Détails du zoo ===");
        System.out.println(myZoo);

// Displaying the details of the lion
        System.out.println("\n=== Détails de l'animal (Lion) ===");
        System.out.println(lion.toString());

// Creating and adding animals to new zoos
        Zoo myZoo1 = new Zoo("zoo1", "tunisia");
        Zoo myZoo2 = new Zoo("zoo2", "sfax");

        System.out.println("\n=== Addition d'un nouveau animal ===");
        Animal test = new Animal("Equidae", "test", 3, false);
        myZoo.addAnimal(test);
        myZoo2.addAnimal(test);
        System.out.println("\n=== Le resultat apres l'addition un nouveau animal ===");
        myZoo.displayZoo();

// Comparing zoos and displaying the largest zoo
        Zoo largestZoo = Zoo.comparerZoo(myZoo1, myZoo2);
        System.out.println("\n=== Comparaison des zoos ===");
        System.out.println("Le zoo avec le plus d'animaux est : " + largestZoo.getName());



    }
}


