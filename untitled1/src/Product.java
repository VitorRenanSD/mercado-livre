import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {
    private String url;
    private String usuario;
    private String senha;

    public Connection connection(){
        url = "jdbc:postgresql://localhost:5432/MercadoFake";
        usuario = "postgres";
        senha = "password";

        Connection conectado = null;

        try {
            conectado = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão efetuada com sucesso");
            return conectado;
        }catch (SQLException e) {
            System.out.println("Conexão não efetuada com o banco de dados");
            return null;

        }
    }
}

