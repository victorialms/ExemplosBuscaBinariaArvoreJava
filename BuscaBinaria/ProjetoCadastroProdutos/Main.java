import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProdutoService service = new ProdutoService();
        Scanner sc = new Scanner(System.in);
        int opcao = -1;

        do {
            System.out.println("\n=== Menu Produtos (Busca Binária) ===");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Buscar por ID (binária)");
            System.out.println("3 - Listar produtos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = sc.nextInt();

                switch (opcao) {
                    case 1 -> {
                        System.out.print("ID: ");
                        int id = sc.nextInt();
                        sc.nextLine(); // Consome a nova linha
                        System.out.print("Nome: ");
                        String nome = sc.nextLine();
                        System.out.print("Preço: ");
                        double preco = sc.nextDouble();
                        service.adicionarProduto(new Produto(id, nome, preco));
                    }
                    case 2 -> {
                        System.out.print("ID para buscar: ");
                        int idBusca = sc.nextInt();
                        Produto encontrado = service.buscarPorId(idBusca);
                        if (encontrado != null) {
                            System.out.println("Produto encontrado: " + encontrado);
                        } else {
                            System.out.println("Produto com ID " + idBusca + " não encontrado.");
                        }
                    }
                    case 3 -> service.listarProdutos();
                    case 0 -> System.out.println("Saindo do sistema...");
                    default -> System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Por favor, insira um número.");
                sc.nextLine(); // Limpa o buffer do scanner
                opcao = -1; // Reseta a opção para continuar no loop
            }

        } while (opcao != 0);

        sc.close();
    }
}
