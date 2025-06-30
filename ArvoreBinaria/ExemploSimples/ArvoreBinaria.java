// Classe que gerencia a árvore binária
public class ArvoreBinaria {
    private No raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void inserir(int valor) {
        raiz = inserirRec(raiz, valor);
    }

    private No inserirRec(No atual, int valor) {
        if (atual == null) {
            return new No(valor);
        }

        if (valor < atual.valor) {
            atual.esquerda = inserirRec(atual.esquerda, valor);
        } else if (valor > atual.valor) {
            atual.direita = inserirRec(atual.direita, valor);
        }

        // Valor já existe, não faz nada
        return atual;
    }

    public boolean buscar(int valor) {
        return buscarRec(raiz, valor);
    }

    private boolean buscarRec(No atual, int valor) {
        if (atual == null) {
            return false;
        }
        if (valor == atual.valor) {
            return true;
        }
        return valor < atual.valor
            ? buscarRec(atual.esquerda, valor)
            : buscarRec(atual.direita, valor);
    }

    // Percurso em ordem (in-order traversal)
    public void emOrdem() {
        emOrdemRec(raiz);
    }

    private void emOrdemRec(No atual) {
        if (atual != null) {
            emOrdemRec(atual.esquerda);
            System.out.print(atual.valor + " ");
            emOrdemRec(atual.direita);
        }
    }
}
