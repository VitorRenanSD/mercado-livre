
public class Main {
    public static void main(String[] args) {

        Cadastros usuario1 = new Cadastros();
        usuario1.CadastraUser("Douglas");

        Cadastros produto1 = new Cadastros();
        produto1.CadastroProduto("Banana");

        Consultas listar = new Consultas();
        listar.ListarVendas("Banana");

        Cadastros remover = new Cadastros();
        remover.RemoverProduto("Banana");
    }
}

