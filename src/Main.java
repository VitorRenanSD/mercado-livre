public class Main {
    public static void main(String[] args) {

        Cadastros cadastros = new Cadastros();


        String username = "Ffffff";
        String cpf_cnpj = "1234567";
        String endereco = "Rua das Flores, 13";
        String email = "joao.nilva@example.com";
        String senha = "senha23";

        System.out.println("Verificando se o usuário já existe...");
        boolean usuarioExiste = cadastros.existeUsuarioCampo(cpf_cnpj, email);

        if (usuarioExiste) {
            System.out.println("Usuário já existe no banco de dados.");
        } else {
            System.out.println("Usuário não encontrado no banco de dados.");
        }

        System.out.println("Tentando adicionar um novo usuário...");
        cadastros.adicionaUsuario(username, cpf_cnpj, endereco, email, senha);

        RepositorioUsuario repositorioUsuario = new RepositorioUsuario();
        Usuario usuario = repositorioUsuario.getById(1);

        if (usuario != null) {
            usuario.exibirInformacao();
        } else {
            System.out.println("Usuário com ID 1 não encontrado.");
        }
        RepositorioProduto repositorioProduto = new RepositorioProduto();
        Produto produto = repositorioProduto.getById(1);

        if (produto != null) {
            produto.exibirInformacao();
        } else {
            System.out.println("Produto com ID 1 não encontrado.");
        }

        RepositorioVendas repositorioVendas = new RepositorioVendas();
        Vendas vendas = repositorioVendas.getById(11);

        if (vendas != null) {
            vendas.exibirInformacao();
        } else {
            System.out.println("Venda com ID 1 não encontrado.");
        }
        RepositorioFormasPagamento repositorioFormasPagamento = new RepositorioFormasPagamento();
        FormasPagamento formasPagamento = repositorioFormasPagamento.getById(7);

        if (formasPagamento != null) {
            formasPagamento.ExibirInformacao();
        } else {
            System.out.println("Venda com ID 1 não encontrado.");
        }

        RepositorioAvalicao repositorioAvalicao = new RepositorioAvalicao();
        AvaliaCao avaliaCao = repositorioAvalicao.getById(1);

        if (avaliaCao != null) {
            avaliaCao.exibirInformacao();
        } else {
            System.out.println("Venda com ID 1 não encontrado.");
        }
    }
}


