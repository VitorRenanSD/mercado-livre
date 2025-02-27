
public class AvaliaCao {
    private final int id;
    private final Produto produto;
    private final Usuario usuario;
    private int rating;
    private final String texto;

    public AvaliaCao(int id, Produto produto, Usuario usuario, int rating, String texto) {
        this.id = id;
        this.produto = produto;
        this.usuario = usuario;
        this.rating = rating;
        this.texto = texto;
    }

    public int getId() {
        return id;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getRating() {
        return rating;
    }

    public String getTexto() {
        return texto;
    }
}

