import java.util.*;

public class ZooManagement {


    public static void main(String[] args) {
        // Creating an animal (lion)
        Animal lion = new Animal("Felidae", "Lion", 5, true);

        // Creating a zoo
        Zoo myZoo = new Zoo("just_a_zoo", "tunisia", 10);

        myZoo.displayZoo();

        System.out.println(myZoo);

        System.out.println(myZoo.toString());
        System.out.println(lion.toString());


    }
}


