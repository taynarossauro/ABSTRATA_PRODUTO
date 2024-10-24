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
        produtoAlimenticio.salvar();
        produtoAlimenticio.atualizar();
        produtoAlimenticio.deletar();

        System.out.println("\n");
        
        // Instanciando um produto de vestuário
        ProdutoVestuario produtoVestuario = new ProdutoVestuario(
                "Camiseta", 20.0, 45.0, "PP", "Branca", "poliéster"
        );
        
        // Printando o produto de vestuário
        System.out.println("Produto de Vestuário: " + produtoVestuario.getNome());
        System.out.println("Lucro: " + produtoVestuario.calcularLucro());
        
        //Testando métodos para operações de banco de dados
        produtoVestuario.salvar();
        produtoVestuario.atualizar();
        produtoVestuario.deletar();
    }
}
