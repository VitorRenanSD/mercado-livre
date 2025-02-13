import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cadastros {
    private List<String> usuarios = new ArrayList<>();
    private List<String> produtos = new ArrayList<>();

    public void CadastraUser(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("digite o nome do usuário para cadastrar: ");
        String usuario = leitor.nextLine();
        usuarios.add(usuario);
        System.out.println(usuario);
    }

    public void CadastroProduto(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("digite o nome do produto para cadastrar: ");
        String produto = leitor.nextLine();
        produtos.add(produto);
        System.out.println(produto);

    }

    public void RemoverProduto(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("digite o nome do produto a ser removido");
        String produto = leitor.nextLine();
        System.out.println(produto);
        produtos.remove(produto);
        System.out.println(produtos);
    }
}

