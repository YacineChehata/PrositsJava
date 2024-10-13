import java.util.Scanner;

public class ZooManagement {
    // Déclaration des variables
    private int nbrCages;
    private String zooName;

    public static void main(String[] args) {
        // Création d'une instance de Scanner pour lire les entrées de l'utilisateur
        Scanner scanner = new Scanner(System.in);
        ZooManagement zoo = new ZooManagement();

        // Demande à l'utilisateur d'entrer le nom du zoo
        System.out.print("Entrez le nom du zoo: ");
        zoo.zooName = scanner.nextLine();

        // Demande à l'utilisateur d'entrer le nombre de cages
        System.out.print("Entrez le nombre de cages: ");
        while (true) {
            if (scanner.hasNextInt()) {
                zoo.nbrCages = scanner.nextInt();
                if (zoo.nbrCages > 0) {
                    break; // Sortir de la boucle si le nombre est valide
                } else {
                    System.out.print("Veuillez entrer un nombre positif: ");
                }
            } else {
                System.out.print("Entrée invalide. Veuillez entrer un nombre entier: ");
                scanner.next(); // Consomme l'entrée invalide
            }
        }

        // Affichage des détails
        zoo.afficherDetails();
        // Ferme le scanner
        scanner.close();
    }

    // Méthode pour afficher les détails du zoo
    public void afficherDetails() {
        System.out.println(zooName + " comporte " + nbrCages + " cages.");
    }
}
