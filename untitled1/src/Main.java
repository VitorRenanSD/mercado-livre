
public class Main {
    public static void main(String[] args) {

        Cadastros usuario1 = new Cadastros();
        usuario1.CadastraUser();

        Cadastros produto1 = new Cadastros();
        produto1.CadastroProduto();

        Consultas listar = new Consultas();
        listar.ListarVendas();

        Cadastros remover = new Cadastros();
        remover.RemoverProduto();



    }
}
