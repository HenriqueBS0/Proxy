import java.util.ArrayList;

public class RepositorioMusicas {
    public static ArrayList<Musica> getMusicas() {
        ArrayList<Musica> musicas = new ArrayList<Musica>();

        musicas.add(new Musica("Musica 1", "Autor A"));
        musicas.add(new Musica("Musica 2", "Autor A"));
        musicas.add(new Musica("Musica 3", "Autor A"));
        musicas.add(new Musica("Musica 4", "Autor B"));
        musicas.add(new Musica("Musica 5", "Autor B"));
        musicas.add(new Musica("Musica 6", "Autor B"));
        musicas.add(new Musica("Musica 7", "Autor B"));
        musicas.add(new Musica("Musica 8", "Autor C"));
        musicas.add(new Musica("Musica 9", "Autor C"));
        musicas.add(new Musica("Musica 10","Autor C"));

        return musicas;
    }
}
