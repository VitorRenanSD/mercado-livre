import classes.AvaliaCao;
import classes.Vendas;
import repositorios.RepositorioAvalicao;
import repositorios.RepositorioProduto;
import repositorios.RepositorioUsuario;
import repositorios.RepositorioVendas;

public class Main {
    public static void main(String[] args) {

        RepositorioProduto repoProduto = new RepositorioProduto();
        Produto produto = repoProduto.getById(1);
        System.out.println("Produto encontrado: " + (produto != null ? produto.getNome() : "Nenhum produto encontrado"));


        RepositorioUsuario repoUsuario = new RepositorioUsuario();
        Usuario usuario = repoUsuario.getById(1);
        System.out.println("Usuário encontrado: " + (usuario != null ? usuario.getUsername() : "Nenhum usuário encontrado"));


        RepositorioVendas repoVendas = new RepositorioVendas();
        Vendas venda = repoVendas.getById(1);
        System.out.println("Venda encontrada: " + (venda != null ? "Venda ID " + venda.getId() : "Nenhuma venda encontrada"));


        RepositorioAvalicao repoAvaliacao = new RepositorioAvalicao();
        AvaliaCao avaliacao = repoAvaliacao.getById(1);
        System.out.println("Avaliação encontrada: " + (avaliacao != null ? "Rating " + avaliacao.getRating() : "Nenhuma avaliação encontrada"));
    }
}
