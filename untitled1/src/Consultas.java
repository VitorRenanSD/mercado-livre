import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Consultas {

    public void ListarVendas(){
        private List<String> vendas = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);
        System.out.println("digite o numero da venda: ");
        String venda = leitor.nextLine();
        vendas.add(venda);
    }
}
