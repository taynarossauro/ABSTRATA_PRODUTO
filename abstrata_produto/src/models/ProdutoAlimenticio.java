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
    public String salvar() {
    	return
	        getNome() +  ", " + getPrecoCusto() + ", " + getPrecoVenda() + ", " + getDataValidade() + ", " +  getInformacoesNutricionais();
    	//return "INSERT INTO Produto_Alimenticio (nome, precoCusto, precoVenda, dataValidade, informacoesNutricionais)\n" + "VALUES ";
    }
    
    //Método para deletar o produto do banco
    @Override
    public String deletar() {
        return "DELETE FROM ProdutoAlimenticio WHERE nome = '" + getNome() + "';";
    }
    
    
    // Método para atualizar o produto no banco
    @Override
    public String atualizar() {
        return "UPDATE ProdutoAlimenticio SET precoCusto = " + getPrecoCusto() + ", precoVenda = " + getPrecoVenda() +
               ", dataValidade = '" + dataValidade + "', informacoesNutricionais = '" + informacoesNutricionais +
               "' WHERE nome = '" + getNome() + "';";
    }

}