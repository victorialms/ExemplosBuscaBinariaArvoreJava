import model.Produto;
import structure.ArvoreProduto;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArvoreProduto arvore = new ArvoreProduto();
        Scanner sc = new Scanner(System.in);
        int opcao = -1;

        do {
            System.out.println("\n=== Menu Produtos (Árvore Binária) ===");
            System.out.println("1 - Adicionar Produto");
            System.out.println("2 - Buscar Produto por ID");
            System.out.println("3 - Listar Produtos em Ordem");
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

                        arvore.inserir(new Produto(id, nome, preco));
                    }
                    case 2 -> {
                        System.out.print("ID para buscar: ");
                        int idBusca = sc.nextInt();
                        Produto p = arvore.buscar(idBusca);
                        if (p != null) {
                            System.out.println("Encontrado: " + p);
                        } else {
                            System.out.println("Produto com ID " + idBusca + " não encontrado.");
                        }
                    }
                    case 3 -> arvore.listarEmOrdem();
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
