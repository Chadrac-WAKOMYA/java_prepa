package java_prepa;

import java.util.LinkedList;

public class TrainComposition {
    private LinkedList<Integer> wagons; // Liste pour stocker les wagons

    public TrainComposition() {
        wagons = new LinkedList<>(); // Initialisation de la liste des wagons
    }

    public void attachWagonFromLeft(int wagonId) {
        wagons.addFirst(wagonId); // Ajoute le wagon à gauche
    }

    public void attachWagonFromRight(int wagonId) {
        wagons.addLast(wagonId); // Ajoute le wagon à droite
    }

    public int detachWagonFromLeft() {
        if (wagons.isEmpty()) {
            throw new IllegalStateException("No wagons to detach from left."); // Vérifie si la liste est vide
        }
        return wagons.removeFirst(); // Supprime et retourne le wagon à gauche
    }

    public int detachWagonFromRight() {
        if (wagons.isEmpty()) {
            throw new IllegalStateException("No wagons to detach from right."); // Vérifie si la liste est vide
        }
        return wagons.removeLast(); // Supprime et retourne le wagon à droite
    }

    public static void main(String[] args) {
        TrainComposition train = new TrainComposition(); // Création d'une nouvelle composition de train
        train.attachWagonFromLeft(7); // Attache le wagon 7 à gauche
        train.attachWagonFromLeft(13); // Attache le wagon 13 à gauche
        System.out.println(train.detachWagonFromRight()); // Affiche 7 (détaché de droite)
        System.out.println(train.detachWagonFromLeft()); // Affiche 13 (détaché de gauche)
    }
}
