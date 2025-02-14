public class Cadastro {


    public void AdicionaUser(){
        String sql = "INSERT INTO cad_usuarios(username, cpf_cnpj, endereco, email, senha) VALUES  (?, ?, ?, ?, ?)";

    }

    public  void  AdicionarProduto(){
        String sql = "INSERT INTO produtos(nome, descricao, preco_venda, estoque, caminho_imagem, usado) (?, ?, ?, ?, ?, ?)";
    }
}
