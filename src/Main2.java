import servicos.ServicoProduto;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ServicoProduto servicoProduto = new ServicoProduto();

        while (true) {
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Adicionar Estoque");
            System.out.println("3 - Editar Produto");
            System.out.println("4 - Editar Estoque");
            System.out.println("5 - Visualizar Produto");
            System.out.println("6 - Listar Avaliações");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do Produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Descrição: ");
                    String descricao = scanner.nextLine();
                    System.out.print("Preço: ");
                    float preco = scanner.nextFloat();
                    System.out.print("Usado (true/false): ");
                    boolean usado = scanner.nextBoolean();

                    servicoProduto.cadastrarProduto(nome, descricao, preco, 5, "http://google.com.brz", false);
                    break;

                case 2:
                    System.out.print("ID do Produto: ");
                    int fkProduto = scanner.nextInt();
                    System.out.print("Quantidade: ");
                    int quantidade = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Modelo: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Caminho da Imagem: ");
                    String caminhoImagem = scanner.nextLine();

                    servicoProduto.adicionarEstoque(fkProduto, quantidade, modelo, caminhoImagem);
                    break;

                case 3:
                    System.out.print("ID do Produto: ");
                    int idProduto = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Novo Nome do Produto: ");
                    String novoNome = scanner.nextLine();
                    System.out.print("Nova Descrição: ");
                    String novaDescricao = scanner.nextLine();
                    System.out.print("Novo Preço: ");
                    float novoPreco = scanner.nextFloat();
                    System.out.print("Usado (true/false): ");
                    boolean novoUsado = scanner.nextBoolean();

                    servicoProduto.editarProduto(idProduto, novoNome, novaDescricao, novoPreco, novoUsado);
                    break;

                case 4:
                    System.out.print("ID do Estoque: ");
                    int idEstoque = scanner.nextInt();
                    System.out.print("Nova Quantidade: ");
                    int novaQuantidade = scanner.nextInt();

                    servicoProduto.editarEstoque(idEstoque, novaQuantidade);
                    break;

                case 5:
                    System.out.print("ID do Produto: ");
                    int idProdutoVisu = scanner.nextInt();
                    servicoProduto.visualizaProduto(idProdutoVisu);
                    break;

                case 6:
                    System.out.print("ID do Produto: ");
                    int idProdutoAvaliacao = scanner.nextInt();
                    servicoProduto.listaAvaliacao(idProdutoAvaliacao);
                    break;

                case 0:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
    }
}

