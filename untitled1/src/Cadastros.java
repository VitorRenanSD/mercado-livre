import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cadastros {
    private List<String> usuarios = new ArrayList<>();
    private List<String> produtos = new ArrayList<>();

    public void CadastraroUser(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("digite o nome do usuário: ");
        String usuario = leitor.nextLine();
        usuarios.add(usuario);
    }

    public void CadastroProduto(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("digite o nome do produto: ");
        String usuario = leitor.nextLine();
        produtos.add(usuario);
    }
    
    public void RemoverProduto(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("digite o nome do produto a ser removido");
        String produto = leitor.nextLine();
        produtos.remove(produto);
    }
}

