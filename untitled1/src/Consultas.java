import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Consultas {

    public void ListarVendas(){
        List<String> vendas = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);
        System.out.println("digite o nome do produto para listar em vendas: ");
        String venda = leitor.nextLine();
        vendas.add(venda);
        System.out.println(venda);

    }
}
