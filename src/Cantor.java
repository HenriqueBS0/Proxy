import java.util.ArrayList;

public class Cantor implements ICantor {

    private String nome;

    Cantor(String nome) {
        this.nome = nome;
    }

    public ArrayList<Musica> getMusicas() {
        ArrayList<Musica> musicas = new ArrayList<Musica>();

        for (Musica musica : RepositorioMusicas.getMusicas()) {
            if(musica.getAutor() == nome) {
                musicas.add(musica);
            }
        }

        return musicas;
    }
}
