public class Main {
    public static void main(String[] args) {

        Cadastros cadastros = new Cadastros();


        String username = "Ffffff";
        String cpf_cnpj = "1234567";
        String endereco = "Rua das Flores, 13";
        String email = "joao.nilva@example.com";
        String senha = "senha23";

        System.out.println("Verificando se o usuário já existe...");
        boolean usuarioExiste = cadastros.existeUsuarioCampo(1, username, cpf_cnpj,endereco,
                email, senha);

        if (usuarioExiste) {
            System.out.println("Usuário já existe no banco de dados.");
        } else {
            System.out.println("Usuário não encontrado no banco de dados.");
        }

        String nome = "Notebook Dell";
        String descricao = "Notebook Dell Inspiron 15, 8GB RAM, 256GB SSD";
        float preco_venda = 3500f;
        int estoque = 10;
        String imagem_caminho = "imagens/notebook_dell.jpg";
        boolean usado = false;

        System.out.println("Verificando se o produto já existe...");
        boolean produtoExiste = cadastros.existeProductCamp(nome,descricao, preco_venda, estoque, imagem_caminho);

        if (produtoExiste) {
            System.out.println("Produto já existe no banco de dados.");
        } else {
            System.out.println("Produto não encontrado no banco de dados.");
        }

        int fk_usuario = 2;
        int fk_produto = 2;
        int quantidade = 1;
        int fk_frm_pgto = 3;
        boolean cancelado = true;
        String motivo_cancelamento = "Produto indisponivel";

        System.out.println("Verificando se a venda já existe...");
        boolean vendaExiste = cadastros.existeCampVend(fk_usuario, fk_produto, quantidade, fk_frm_pgto, cancelado,
                motivo_cancelamento);

        if (vendaExiste) {
            System.out.println("Venda já existe no banco de dados.");
        } else {
            System.out.println("Venda não encontrada no banco de dados.");
        }



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
