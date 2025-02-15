public class Cadastro {

    public void AdicionaUser(){
         String sql = "INSERT INTO cad_usuarios(username, cpf_cnpj, endereco, email, senha) 
             VALUES ('João Silva', '12345678901', 'Rua A 123', 'joao.silva@email.com', 'senha123')";
    }

    public void AicioanarProduto(){
 String sql = "INSERT INTO produtos(nome, descricao, preco_venda, estoque, caminho_imagem, usado)
    VALUES ('Notebook Dell', 'Notebook Dell Inspiron 15 com 8GB RAM e 256GB SSD', '3500.00', 'imagens/notebook_dell.jpg', 'False')";
    }
}
