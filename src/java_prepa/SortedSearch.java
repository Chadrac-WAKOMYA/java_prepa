package java_prepa;

public class SortedSearch {
    public static int countNumbers(int[] sortedArray, int lessThan) {
        int left = 0; // Début du tableau
        int right = sortedArray.length; // Fin du tableau

        // Recherche binaire pour trouver la position
        while (left < right) {
            int mid = left + (right - left) / 2; // Calcul de l'indice du milieu

            if (sortedArray[mid] < lessThan) {
                left = mid + 1; // Cherche dans la moitié droite
            } else {
                right = mid; // Cherche dans la moitié gauche
            }
        }

        return left; // La position où lessThan serait inséré
    }

    public static void main(String[] args) {
        System.out.println(SortedSearch.countNumbers(new int[] { 1, 3, 5, 7, 11 }, 11)); // Affiche 2
    }
}
