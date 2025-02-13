import java.util.ArrayList;
import java.util.List;

public class Cadastros {
    private List<String> usuarios = new ArrayList<>();
    private List<String> produtos = new ArrayList<>();

    public void CadastraUser(String usuario){
      usuarios.add(usuario);
        System.out.println(usuario);
    }

    public void CadastroProduto(String cadastraproduto){
       produtos.add(cadastraproduto);
        System.out.println(cadastraproduto);
    }

    public void RemoverProduto(String removeproduto){
        produtos.remove(removeproduto);
        System.out.println(removeproduto);
    }
}

