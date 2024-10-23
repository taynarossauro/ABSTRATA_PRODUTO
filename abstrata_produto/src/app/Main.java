package app;
import models.*;

public class Main {
    public static void main(String[] args) {
        // Criando um produto alimentício
        ProdutoAlimenticio produtoAlimenticio = new ProdutoAlimenticio(
                "Arroz", 10.0, 22.0, "2024-20-23", "Informação nutricional"
        );
        // Printando o produto alimentício
        System.out.println("Produto Alimentício: " + produtoAlimenticio.getNome());
        System.out.println("Lucro: " + produtoAlimenticio.calcularLucro());
        
        //Testando métodos para operações de banco de dados
        System.out.println("Operações Banco de Dados\n");
        System.out.println("Salvar: " + produtoAlimenticio.salvar());
        System.out.println("Atualizar: " + produtoAlimenticio.atualizar());
        System.out.println("Deletar: " + produtoAlimenticio.deletar() + "\n\n");


        
        // Instanciando um produto de vestuário
        ProdutoVestuario produtoVestuario = new ProdutoVestuario(
                "Camiseta", 20.0, 45.0, "PP", "Branca", "poliéster"
        );
        
        // Printando o produto de vestuário
        System.out.println("Produto de Vestuário: " + produtoVestuario.getNome());
        System.out.println("Lucro: " + produtoVestuario.calcularLucro());
        
        //Testando métodos para operações de banco de dados
        System.out.println("Operações Banco de Dados\n");
        System.out.println("Salvar: " + produtoVestuario.salvar());
        System.out.println("Atualizar: " + produtoVestuario.atualizar());
        System.out.println("Deletar: " + produtoVestuario.deletar());
    }
}
