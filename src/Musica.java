public class Musica {
    private String nome;
    private String autor;

    public Musica(String nome, String autor) {
        this.nome = nome;
        this.autor = autor;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

}
