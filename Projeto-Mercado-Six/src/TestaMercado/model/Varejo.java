package TestaMercado.model;

public class Varejo extends TestaMercado{

    private float unitario;

    public Varejo(String nome, float preco, float desconto, float validade, String categoria, int ID, float unitario) {
        super(nome, preco, desconto, validade, categoria, ID);
        this.unitario = unitario;
    }

    public float getUnitario() {
        return unitario;
    }

    public void setUnitario(float unitario) {
        this.unitario = unitario;
    }

    public void visualizar(){
        super.visualizar();
        System.out.println("\nValor por unidade: " + getUnitario());
    }
}
