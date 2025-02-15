public class Cadastro {

    public void AdicionaUser(){
        String sql = "INSERT INTO cad_usuarios(username, cpf_cnpj, endereco, email, senha) VALUES  ("João Silva", "12345678901" , 
            "Rua A 123" , "joao.silva@email.com", "senha123)";
    }

    public  void  AdicionarProduto(){
        String sql = "INSERT INTO produtos(nome, descricao, preco_venda, estoque, caminho_imagem, usado) ("Nootebok Deel", "Notebook Del Inspirion 15"  8GB RAMM 256 SSD,
             "3.500,00", "imagens/notebook_dell.jpg", "False");
    }
}
