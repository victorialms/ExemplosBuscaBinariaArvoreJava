package structure;

import model.Produto;

public class ArvoreProduto {
    private static class No {
        Produto produto;
        No esquerda, direita;

        No(Produto produto) {
            this.produto = produto;
            this.esquerda = null;
            this.direita = null;
        }
    }

    private No raiz;

    public void inserir(Produto produto) {
        if (produto == null) return;
        raiz = inserirRec(raiz, produto);
        System.out.println("Produto inserido na árvore.");
    }

    private No inserirRec(No atual, Produto produto) {
        if (atual == null) {
            return new No(produto);
        }

        if (produto.getId() < atual.produto.getId()) {
            atual.esquerda = inserirRec(atual.esquerda, produto);
        } else if (produto.getId() > atual.produto.getId()) {
            atual.direita = inserirRec(atual.direita, produto);
        }

        return atual;
    }

    public Produto buscar(int id) {
        return buscarRec(raiz, id);
    }

    private Produto buscarRec(No atual, int id) {
        if (atual == null) {
            return null; // Não encontrado
        }
        if (id == atual.produto.getId()) {
            return atual.produto; // Encontrado
        }
        return id < atual.produto.getId()
            ? buscarRec(atual.esquerda, id)
            : buscarRec(atual.direita, id);
    }

    public void listarEmOrdem() {
        if (raiz == null) {
            System.out.println("Nenhum produto cadastrado na árvore.");
            return;
        }
        System.out.println("\n--- Lista de Produtos (Em Ordem por ID) ---");
        listarRec(raiz);
        System.out.println("-------------------------------------------");
    }

    private void listarRec(No atual) {
        if (atual != null) {
            listarRec(atual.esquerda);
            System.out.println(atual.produto);
            listarRec(atual.direita);
        }
    }
}
