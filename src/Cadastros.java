import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Cadastros {

    public boolean existeUsuarioCampo(int id, String username, String cnpf_cnpj, String endereco, String email, String senha) {
        String sql = "SELECT COUNT(*) FROM cad_usuarios WHERE  username = ? OR  cpf_cnpj = ? OR endereco = ? OR email = ? OR senha = ?";

        try (Connection connection = new ConnectionDB().getConnection();
             PreparedStatement pstm = connection.prepareStatement(sql)) {

            pstm.setString(1, username);
            pstm.setString(2, cnpf_cnpj);
            pstm.setString(3, endereco);
            pstm.setString(4, email);
            pstm.setString(5, senha);

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
            pstm.setFloat(3,preco_venda);
            pstm.setInt(4, estoque);
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

    public boolean existeCampVend(int fk_usuario, int fk_produto, int quantidade, int fk_fr_pgto, boolean cancelado, String motivo_cancelamento ) {
        String sql = "SELECT COUNT(*) FROM vendas WHERE fk_produto = ? OR fk_user = ? OR quantidade = ? OR fk_frm_pgto = ? OR cancelado = ? OR motivo_cancel = ?";

        try (Connection connection = new ConnectionDB().getConnection();
             PreparedStatement pstm = connection.prepareStatement(sql)) {

            pstm.setInt(1, fk_usuario);
            pstm.setInt(2, fk_produto );
            pstm.setInt(3, quantidade);
            pstm.setInt(4, fk_fr_pgto);
            pstm.setBoolean(5,cancelado);
            pstm.setString(6,motivo_cancelamento);

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
