package java_prepa;

public class GamePlatform {
    public static double calculateFinalSpeed(double initialSpeed, int[] inclineDegrees) {
        for (int incline : inclineDegrees) {
            if (incline == 0) {
                // Pas de changement de vitesse
                continue;
            } else if (incline < 0) {
                // Pente descendante, on diminue la vitesse
                initialSpeed += incline; // incline est négatif, donc cela réduit la vitesse
            } else {
                // Pente montante, on augmente la vitesse
                initialSpeed += incline; // incline est positif, donc cela augmente la vitesse
            }

            // Si la vitesse devient 0 ou négative, retourner 0
            if (initialSpeed <= 0) {
                return 0;
            }
        }
        return initialSpeed;
    }

    public static void main(String[] args) {
        double initialSpeed = 60.0; // vitesse initiale
        int[] inclineDegrees = { -30, 30, -45, 0, 45 }; // angles d'inclinaison

        double finalSpeed = calculateFinalSpeed(initialSpeed, inclineDegrees);
        System.out.println("Vitesse finale : " + finalSpeed + " km/h");
    }
}
