package java_prepa;

public class UserInput {

    public static class TextInput {
        private StringBuilder value; // Pour stocker la valeur

        public TextInput() {
            value = new StringBuilder(); // Initialisation
        }

        // Ajoute un caractère à la valeur
        public void add(char c) {
            value.append(c); // Ajoute le caractère
        }

        // Renvoie la valeur actuelle
        public String getValue() {
            return value.toString(); // Conversion en chaîne
        }
    }

    public static class NumericInput extends TextInput {

        // Remplace la méthode add pour accepter uniquement les chiffres
        @Override
        public void add(char c) {
            if (Character.isDigit(c)) { // Vérifie si c'est un chiffre
                super.add(c); // Appelle la méthode de la classe parente
            }
            // Ignore les autres caractères
        }
    }

    public static void main(String[] args) {
        TextInput input = new NumericInput(); // Crée un NumericInput
        input.add('1'); // Ajoute '1'
        input.add('a'); // Ignore 'a'
        input.add('0'); // Ajoute '0'
        System.out.println(input.getValue()); // Affiche "10"
    }
}
