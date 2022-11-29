import java.util.ArrayList;

public class ProxyCantor implements ICantor {
    private ArrayList<Musica> musicas;
    private Cantor cantor;

    ProxyCantor(String nome) {
        cantor = new Cantor(nome);
    }

    public ArrayList<Musica> getMusicas() {
        if(musicas == null) {
            System.out.println("Cache de musicas vazio.");
            musicas = cantor.getMusicas();
        }
        else {
            System.out.println("Musicas em cache.");
        }

        return musicas;
    }
}
