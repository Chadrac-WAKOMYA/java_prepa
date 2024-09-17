package java_prepa;

public class Song {
    private String name;
    private Song nextSong;

    public Song(String name) {
        this.name = name;
    }

    public void setNextSong(Song nextSong) {
        this.nextSong = nextSong;
    }

    public boolean isInRepeatingPlaylist() {
        Song slow = this; // Pointeur lent
        Song fast = this; // Pointeur rapide

        // Boucle pour détecter un cycle
        while (fast != null && fast.nextSong != null) {
            slow = slow.nextSong; // Avance d'un pas
            fast = fast.nextSong.nextSong; // Avance de deux pas

            if (slow == fast) { // Cycle détecté
                return true;
            }
        }
        return false; // Pas de cycle*

        // Song currentSong = this;
        // while (currentSong != null) {
        // currentSong = currentSong.nextSong;
        // if (this == currentSong) {
        // return true;
        // }
        // }
        // return false;

    }

    public static void main(String[] args) {
        Song first = new Song("Hello");
        Song second = new Song("Eye of the tiger");

        first.setNextSong(second);
        second.setNextSong(first); // Crée une boucle

        System.out.println(first.isInRepeatingPlaylist()); // Affiche true
    }
}
