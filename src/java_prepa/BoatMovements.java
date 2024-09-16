package java_prepa;

public class BoatMovements {
    public static boolean canTravelTo(boolean[][] gameMatrix, int fromRow, int fromColumn, int toRow, int toColumn) {
        // Vérifie si la destination est hors limites
        if (toRow < 0 || toRow >= gameMatrix.length || toColumn < 0 || toColumn >= gameMatrix[0].length) {
            return false; // Hors limites
        }

        // Vérifie si la destination est de l'eau
        if (!gameMatrix[toRow][toColumn]) {
            return false; // Terre
        }

        // Mouvement horizontal
        if (fromRow == toRow) {
            int startCol = Math.min(fromColumn, toColumn);
            int endCol = Math.max(fromColumn, toColumn);
            for (int col = startCol + 1; col < endCol; col++) {
                if (!gameMatrix[fromRow][col]) {
                    return false; // Terre sur le chemin
                }
            }
            return true; // Mouvement valide
        }

        // Mouvement vertical
        if (fromColumn == toColumn) {
            int startRow = Math.min(fromRow, toRow);
            int endRow = Math.max(fromRow, toRow);
            for (int row = startRow + 1; row < endRow; row++) {
                if (!gameMatrix[row][fromColumn]) {
                    return false; // Terre sur le chemin
                }
            }
            return true; // Mouvement valide
        }

        return false; // Mouvement non valide
    }

    public static void main(String[] args) {
        boolean[][] gameMatrix = {
                { false, true, true, false, false, false },
                { true, true, true, false, false, false },
                { true, true, true, true, true, true },
                { false, true, true, false, true, true },
                { false, true, true, true, false, true },
                { false, false, false, false, false, false },
        };

        System.out.println(canTravelTo(gameMatrix, 3, 2, 2, 2)); // true
        System.out.println(canTravelTo(gameMatrix, 3, 2, 3, 4)); // false
        System.out.println(canTravelTo(gameMatrix, 3, 2, 6, 2)); // false
    }
}
