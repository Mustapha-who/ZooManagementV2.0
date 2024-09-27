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


        myZoo.addAnimal(zebra);
        myZoo.addAnimal(lion);
        myZoo.addAnimal(elephant);
        myZoo.addAnimal(tiger);


        if (myZoo.searchAnimal(zebra1) != 1) {
            System.out.println("Animal trouvé à l'indice: " + myZoo.searchAnimal(zebra1));
        } else {
            System.out.println("Animal non trouvé.");
        }


        myZoo.displayZoo();

        myZoo.removeAnimal(lion);

        myZoo.displayZoo();


        System.out.println(myZoo);

        System.out.println(myZoo);
        System.out.println(lion.toString());

        Zoo myZoo1 = new Zoo("zoo1", "tunisia");
        Zoo myZoo2 = new Zoo("zoo2", "sfax");
        myZoo1.addAnimal(zebra);

        Zoo largestZoo = Zoo.comparerZoo(myZoo1, myZoo2);
        System.out.println("Le zoo avec le plus d'animaux est : " + largestZoo.name);


    }
}


