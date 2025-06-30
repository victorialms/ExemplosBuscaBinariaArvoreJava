# Exemplos de Busca Binária e Árvore Binária em Java

Este repositório contém as implementações em Java dos exemplos e projetos descritos no material de estudo sobre Busca Binária e Árvore Binária de Busca.

## Estrutura do Repositório

O projeto está dividido em duas pastas principais:

1.  **`BuscaBinaria/`**: Contém um exemplo simples e um projeto de cadastro de produtos usando um `ArrayList` ordenado e busca binária.
2.  **`ArvoreBinaria/`**: Contém um exemplo simples de árvore binária com inteiros e um projeto de cadastro de produtos usando uma Árvore Binária de Busca.

---

## 1. Busca Binária

### 1.1. Exemplo Simples

Demonstração de uma busca binária em um array de inteiros primitivos.

-   **Localização:** `BuscaBinaria/ExemploSimples/`
-   **Como executar:**
    ```bash
    # Navegue até a pasta do exemplo
    cd BuscaBinaria/ExemploSimples
    
    # Compile o arquivo Java
    javac BuscaBinariaExemplo.java
    
    # Execute o programa
    java BuscaBinariaExemplo
    ```

### 1.2. Projeto: Cadastro de Produtos com Busca Binária

Sistema de console para adicionar, listar e buscar produtos por ID. A busca é otimizada com o algoritmo de busca binária sobre um `ArrayList`.

-   **Localização:** `BuscaBinaria/ProjetoCadastroProdutos/`
-   **Como executar:**
    ```bash
    # Navegue até a pasta do projeto
    cd BuscaBinaria/ProjetoCadastroProdutos
    
    # Compile todos os arquivos Java
    javac *.java
    
    # Execute a classe principal
    java Main
    ```

---

## 2. Árvore Binária

### 2.1. Exemplo Simples

Demonstração da criação, inserção, busca e percurso em ordem (in-order) de uma árvore binária de busca com inteiros.

-   **Localização:** `ArvoreBinaria/ExemploSimples/`
-   **Como executar:**
    ```bash
    # Navegue até a pasta do exemplo
    cd ArvoreBinaria/ExemploSimples
    
    # Compile todos os arquivos Java
    javac *.java
    
    # Execute a classe de teste
    java TesteArvore
    ```

### 2.2. Projeto: Cadastro de Produtos com Árvore Binária

Sistema de console similar ao anterior, mas utilizando uma Árvore Binária de Busca para armazenar e buscar os produtos por ID. Esta abordagem evita a necessidade de reordenar a lista a cada inserção.

-   **Localização:** `ArvoreBinaria/ProjetoCadastroProdutosComArvore/`
-   **Como executar (compilando com pacotes):**
    ```bash
    # Navegue até a pasta do projeto
    cd ArvoreBinaria/ProjetoCadastroProdutosComArvore

    # Compile os fontes e gere os .class na estrutura de pacotes correta
    # O comando -d . diz ao compilador para criar a estrutura de pacotes no diretório atual
    javac -d . model/Produto.java structure/ArvoreProduto.java Main.java

    # Execute a classe principal (sem necessidade de especificar o caminho do pacote aqui)
    java Main
    ```
