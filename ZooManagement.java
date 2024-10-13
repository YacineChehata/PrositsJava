import java.util.Scanner;

public class ZooManagement {

    private int nbrCages;
    private String zooName;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ZooManagement zoo = new ZooManagement();

        System.out.print("Entrez le nom du zoo: ");
        zoo.zooName = scanner.nextLine();

        System.out.print("Entrez le nombre de cages: ");
        while (true) {
            if (scanner.hasNextInt()) {
                zoo.nbrCages = scanner.nextInt();
                if (zoo.nbrCages > 0) {
                    break;
                } else {
                    System.out.print("Veuillez entrer un nombre positif: ");
                }
            } else {
                System.out.print("Entrée invalide. Veuillez entrer un nombre entier: ");
                scanner.next();
            }
        }


        Zoo myZoo = new Zoo("Safari Park", "New York", 3);

        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal elephant = new Animal("Elephantidae", "Elephant", 10, true);
        Animal parrot = new Animal("Psittacidae", "Parrot", 2, false);
        Animal tiger = new Animal("Felidae", "Tiger", 4, true);

        // Adding animals to the zoo
        myZoo.addAnimal(lion);
        myZoo.addAnimal(elephant);
        myZoo.addAnimal(parrot);

        // Attempting to add one more animal (when the zoo is full)
        boolean success = myZoo.addAnimal(tiger);
        System.out.println("Was the tiger added to the zoo? " + success);

        System.out.println(myZoo.toString());

        System.out.println(lion.toString());
        System.out.println(parrot.toString());
        System.out.println(elephant.toString());

    }

    public void afficherDetails() {
        System.out.println(zooName + " comporte " + nbrCages + " cages.");
    }
}
