package models;

public class ProdutoAlimenticio extends Produto {
	//Declarando atributos
    private String dataValidade;
    private String informacoesNutricionais;

    //Construtor da classe
    public ProdutoAlimenticio(String nome, double precoCusto, double precoVenda, String dataValidade, String informacoesNutricionais) {
    	super(nome, precoCusto, precoVenda);
    	this.dataValidade = dataValidade;
    	this.informacoesNutricionais = informacoesNutricionais;
    }
    
    //Getters
    public String getDataValidade() {
    	return dataValidade;
    }
    
    public String getInformacoesNutricionais() {
    	return informacoesNutricionais;
    }
    
    //Setters
    public void setInformacoesNutricionais(String informacoesNutricionais) {
    	this.informacoesNutricionais = informacoesNutricionais;
    }
    
    public void getDataValidade(String dataValidade) { 
    	this.dataValidade = dataValidade;
    }
    
    //Método para salvar o produto no banco
    public void salvar() {
    	System.out.println("Produto salvo no banco de dados.");
    }
    
    //Método para deletar o produto do banco
    @Override
    public void deletar() {
    	System.out.println("Produto deletado no banco de dados.");
    }
    
    // Método para atualizar o produto no banco
    @Override
    public void atualizar() {
    	System.out.println("Produto atualizado no banco de dados.");
    }

}