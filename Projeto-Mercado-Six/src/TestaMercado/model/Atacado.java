package TestaMercado.model;

public class Atacado extends TestaMercado{

 private float promocao;

    public Atacado(String nome, float preco, float desconto, float validade, String categoria, int ID, float promocao) {
        super(nome, preco, desconto, validade, categoria, ID);
        this.promocao = promocao;
    }

    public float getPromocao() {
        return promocao;
    }

    public void setPromocao(float promocao) {
        this.promocao = promocao;
    }

    public void visualizar() {
        super.visualizar();
        System.out.println("\nPromoção do dia: " + this.promocao);
    }
}
