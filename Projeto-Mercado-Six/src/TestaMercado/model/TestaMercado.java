package TestaMercado.model;

public class TestaMercado {
    private String nome;
    private float preco;
    private float desconto;
    private float validade;
    private String categoria;
    private int ID;

    public TestaMercado(String nome, float preco, float desconto, float validade, String categoria, int ID) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
        this.validade = validade;
        this.categoria = categoria;
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public float getValidade() {
        return validade;
    }

    public void setValidade(float validade) {
        this.validade = validade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void visualizar() {
        System.out.println("\n************************************************");
        System.out.println("Dados do Produto");
        System.out.println("\n************************************************");
        System.out.println("\nNome: " + getNome());
        System.out.println("\npreco: " + getPreco());
        System.out.println("\nDesconto: " + getDesconto());
        System.out.println("\nValidade: " + getValidade());
        System.out.println("\nCategoria: " + getCategoria());
        System.out.println("\nID: " + getID());
    }
}