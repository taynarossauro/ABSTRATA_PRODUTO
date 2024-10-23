package models;

public class ProdutoVestuario extends Produto {
	//Declarando atributos
    private String tamanho;
    private String cor;
    private String material;

    // Construtor da classe
    public ProdutoVestuario(String nome, double precoCusto, double precoVenda, String tamanho, String cor, String material) {
        super(nome, precoCusto, precoVenda);
        this.tamanho = tamanho;
        this.cor = cor;
        this.material = material;
    }

    // Getters
    public String getTamanho() {
        return tamanho;
    }
    
    public String getCor() {
        return cor;
    }
    
    public String getMaterial() {
        return material;
    }

    
    //Setters
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    //Método para salvar o produto no banco
    @Override
    public String salvar() {
        return "INSERT INTO ProdutoVestuario (nome, precoCusto, precoVenda, tamanho, cor, material) VALUES ('" 
            + getNome() + "', " + getPrecoCusto() + ", " + getPrecoVenda() + ", '" + tamanho + "', '" + cor + "', '" + material + "');";
    }

    //Método para deletar o produto do banco
    @Override
    public String deletar() {
        return "DELETE FROM ProdutoVestuario WHERE nome = '" + getNome() + "';";
    }

    // Método para atualizar o produto no banco
    @Override
    public String atualizar() {
        return "UPDATE ProdutoVestuario SET precoCusto = " + getPrecoCusto() + ", precoVenda = " + getPrecoVenda() +
               ", tamanho = '" + tamanho + "', cor = '" + cor + "', material = '" + material +
               "' WHERE nome = '" + getNome() + "';";
    }
}
