// Classe principal para testar a árvore
public class TesteArvore {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        arvore.inserir(40);
        arvore.inserir(20);
        arvore.inserir(60);
        arvore.inserir(10);
        arvore.inserir(30);
        arvore.inserir(50);
        arvore.inserir(70);

        System.out.print("Percurso em ordem: ");
        arvore.emOrdem(); // Saída esperada: 10 20 30 40 50 60 70

        System.out.println("\nBusca 30: " + arvore.buscar(30)); // true
        System.out.println("Busca 99: " + arvore.buscar(99)); // false
    }
}
