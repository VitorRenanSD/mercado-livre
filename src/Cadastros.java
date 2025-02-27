import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Cadastros {

    public boolean existeUsuarioCampo(String cnpf_cnpj,String email) {
        String sql = "SELECT COUNT(*) FROM cad_usuarios WHERE cpf_cnpj = ? OR email = ?";

        try (Connection connection = new ConnectionDB().getConnection();
             PreparedStatement pstm = connection.prepareStatement(sql)) {

            pstm.setString(1, cnpf_cnpj);
            pstm.setString(2, email);


            ResultSet resultset = pstm.executeQuery();

            if (resultset.next()) {
                return resultset.getInt(1) > 0;
            }
        } catch (SQLException e) {
            System.out.println("Erro ao tentar cadastrar o usuário: " + e.getMessage());
        }
        return false;
    }

    public boolean existeProductCamp(String nome, String descricao, float preco_venda, int estoque, String caminho_imagem) {
        String sql = "SELECT COUNT(*) FROM produtos WHERE nome = ? OR descricao = ? OR preco_venda = ? OR estoque = ? OR caminho_imagem = ?";

        try (Connection connection = new ConnectionDB().getConnection();
             PreparedStatement pstm = connection.prepareStatement(sql)) {

            pstm.setString(1, nome);
            pstm.setString(2, descricao);
            pstm.setString(3, String.valueOf(preco_venda));
            pstm.setString(4, String.valueOf(estoque));
            pstm.setString(5, caminho_imagem);

            ResultSet resultSet = pstm.executeQuery();

            if (resultSet.next()) {
                return resultSet.getInt(1) > 0;
            }
        } catch (SQLException e) {
            System.out.println("Erro ao tentar cadastrar o usuário: " + e.getMessage());
        }
        return false;
    }

    public boolean existeCampVend(int fk_produto, int fk_usuario, String texto) {
        String sql = "SELECT FROM avaliacoes WHERE fk_produto = ? AND fk_usuario = ? AND texto = ?";

        try (Connection connection = new ConnectionDB().getConnection();
             PreparedStatement pstm = connection.prepareStatement(sql)) {

            pstm.setString(1, String.valueOf(fk_produto));
            pstm.setString(2, String.valueOf(fk_produto));
            pstm.setString(5, texto);

            ResultSet resultSet = pstm.executeQuery();

            if (resultSet.next()) {
                return resultSet.getInt(1) > 0;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    public void adicionaUsuario(String username, String cpf_cnpj, String endereco, String email, String senha) {
        String sql = "INSERT INTO cad_usuarios (username, cpf_cnpj, endereco, email, senha) VALUES (?, ?, ?, ?, ?)";

        try (Connection connection = new ConnectionDB().getConnection();
             PreparedStatement pstm = connection.prepareStatement(sql)) {

            pstm.setString(1, username);
            pstm.setString(2, cpf_cnpj);
            pstm.setString(3, endereco);
            pstm.setString(4, email);
            pstm.setString(5, senha);

            int linhaAfet = pstm.executeUpdate();

            if (linhaAfet > 1) {
                System.out.println("Usuario cadastrado com exito");
            } else {
                System.out.println("Usuario não cadastrado");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}