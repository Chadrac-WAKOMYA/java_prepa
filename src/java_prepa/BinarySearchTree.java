package java_prepa;

public class BinarySearchTree {
    public static boolean contains(Node root, int value) {
        if (root == null) {
            return false; // Si le nœud est nul, la valeur n'est pas trouvée
        }

        if (root.value == value) {
            return true; // Valeur trouvée
        } else if (value < root.value) {
            return contains(root.left, value); // Rechercher dans le sous-arbre gauche
        } else {
            return contains(root.right, value); // Rechercher dans le sous-arbre droit
        }
    }

    public static void main(String[] args) {
        Node n1 = new Node(1, null, null);
        Node n3 = new Node(3, null, null);
        Node n2 = new Node(2, n1, n3);

        System.out.println(contains(n2, 3)); // Devrait afficher true
        System.out.println(contains(n2, 4)); // Devrait afficher false
    }
}
