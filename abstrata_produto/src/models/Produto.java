package models;

// Superclasse abstrata
public abstract class Produto {
    private String nome;
    private double precoCusto;
    private double precoVenda;

    // Construtor
    public Produto(String nome, double precoCusto, double precoVenda) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }
    
    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    // Método para calcular lucro
    public double calcularLucro() {
        return precoVenda - precoCusto;
    }

    // Métodos para operações de banco de dados
    public abstract String salvar();
    public abstract String deletar();
    public abstract String atualizar();
}
