public class Zoo {
   private Animal[] animals;
   private String name;
   private String city;
   private final int nbrCages = 25;
   private int animalCount = 0;

    // Parameterized constructor
    public Zoo(String name, String city) {
        setName(name); // Utiliser le setter pour appliquer la vérification
        this.city = city;
        animals = new Animal[nbrCages];
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Le nom du zoo ne doit pas être vide.");
        }
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public int getAnimalCount() {
        return animalCount;
    }

    public void setAnimalCount(int animalCount) {
        this.animalCount = animalCount;
    }

    // Méthode pour afficher le zoo
    public void displayZoo() {
        System.out.println("Zoo Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of Cages: " + nbrCages);
        System.out.println("Animals in the Zoo:");


        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i].toString());
        }
    }

    // Méthode pour chercher un animal selon son nom
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }


    // Méthode pour ajouter un animal au zoo
    public boolean addAnimal(Animal animal) {
        // Vérifier si l'animal existe déjà
        if (searchAnimal(animal) != -1) {
            System.out.println("L'animal: " + animal.getName() + " déjà existe dans le zoo.");
            return false;
        }

        // Vérifier si le zoo est plein
        if (isZooFull()) {
            System.out.println("Le zoo est plein, impossible d'ajouter un autre animal.");
            return false;
        } else {
            animals[animalCount] = animal;
            animalCount++;
            System.out.println("L'animal "+ animal.getName() +" a été ajouté au zoo.");
            return true;
        }
    }


    // Méthode pour supprimer un animal du zoo
    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal); // Cherche l'animal

        if (index != -1) { // Si l'animal est trouvé
            // Décale tous les animaux suivants d'une position vers la gauche
            for (int i = index; i < animalCount - 1; i++) {
                animals[i] = animals[i + 1];
            }
            animals[animalCount - 1] = null; // Réinitialise la dernière position
            animalCount--; // Diminue le compteur d'animaux
            return true; // Suppression réussie
        } else {
            System.out.println("Cet animal n'existe pas dans le zoo.");
            return false; // L'animal n'a pas été trouvé
        }

    }

    // Méthode pour vérifier si le zoo est plein
    public boolean isZooFull() {
        return animalCount >= nbrCages; // Returns true if full
    }

    // Méthode pour comparer deux zoos et retourner celui avec le plus d'animaux
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.animalCount > z2.animalCount) {
            return z1; // Retourner z1 si z1 a plus d'animaux
        } else {
            return z2; // Retourner z2 si z2 a plus d'animaux ou s'ils sont égaux
        }
    }



}
