# Sistema_de_Produtos

Este projeto implementa um sistema de gerenciamento de produtos com diferentes categorias, utilizando herança em Java. A classe `Produto` define atributos e métodos comuns, enquanto as classes `ProdutoAlimenticio` e `ProdutoVestuario` especializam o comportamento de produtos alimentícios e de vestuário. O sistema também inclui métodos para salvar, deletar e atualizar registros em um banco de dados relacional.

## 🚀 Começando

O objetivo é aplicar conceitos de Programação Orientada a Objetos (POO), como herança, e implementar operações CRUD (Create, Read, Update, Delete) para diferentes tipos de produtos.

### Características

•⁠  ⁠Classe `Produto` com atributos:  
    - `nome`  
    - `preço de custo`  
    - `preço de venda`  
    - Método concreto `calcularLucro()`: calcula o lucro com base na diferença entre o preço de venda e o preço de custo.

•⁠  ⁠Classe `ProdutoAlimenticio`, que herda de `Produto`, com atributos adicionais:  
    - `data de validade`  
    - `informações nutricionais`

•⁠  ⁠Classe `ProdutoVestuario`, que herda de `Produto`, com atributos adicionais:  
    - `tamanho`  
    - `cor`  
    - `material`


## 🔧 Instalação

1. Clone o repositório.
2. Abra o projeto na sua IDE favorita (Eclipse, IntelliJ, etc.).
3. Conecte o projeto a um banco de dados relacional (ex.: MySQL, PostgreSQL).
4. Execute a classe `Main` para testar as funcionalidades.

## 🛠️ Construído com

•⁠  ⁠Linguagem: `Java`  
•⁠  ⁠Banco de Dados: `MySQL`  
•⁠  ⁠IDE: `Eclipse`  

## 📌 Versão

Versão 1.0

**Autor:** Taynara Raquel
