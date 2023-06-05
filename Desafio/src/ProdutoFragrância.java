
public class ProdutoFragrância {
    private String name;
    private double preco;
    private int codigo;

    public ProdutoFragrância(int codigo,String name,double preco) {
        this.codigo = codigo;
        this.name= name;
        this.preco=preco;
    }

    public String getName() {
        return name;
    }

    public double getPreco() {
        return preco;
    }

    public int getCodigo() {
        return codigo;
    }
}



