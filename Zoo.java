public class Zoo {
    private String zooName;
    private String city;
    private Animal[] animals; // An array to store the animals
    private int animalCount; // Counter to track the number of animals

    // Constructor
    public Zoo(String zooName, String city, int maxAnimals) {
        this.zooName = zooName;
        this.city = city;
        this.animalCount = 0; // Initially 0 animals
        this.animals = new Animal[maxAnimals]; // Array size set by maxAnimals
    }

    // Add animal method
    public boolean addAnimal(Animal animal) {
        if (animalCount < animals.length) {
            animals[animalCount] = animal;
            animalCount++;
            return true;
        } else {
            System.out.println("Zoo is full. Cannot add more animals.");
            return false;
        }
    }

    // Display Zoo Information
    public void displayZoo() {
        System.out.println("Zoo Name: " + zooName);
        System.out.println("City: " + city);
        System.out.println("Number of Cages: " + animals.length);
    }
}
