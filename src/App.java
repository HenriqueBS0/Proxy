import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ICantor cantor = new ProxyCantor("Autor C");

        mostrarMusicas(cantor.getMusicas());
        mostrarMusicas(cantor.getMusicas());

    }

    private static void mostrarMusicas(ArrayList<Musica> musicas) {
        for (Musica musica : musicas) {
            System.out.println(musica.getNome());
        }
    }
}
