import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Cliente {
    private String cpf,email,name,gender;
    protected LocalDate dataRegister;

   List<ProdutoFragrância> produtoEscolhido = new ArrayList<>();


    public void setCompra(ProdutoFragrância produto, int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            produtoEscolhido.add(produto);

        }
    }

    public List<ProdutoFragrância> getProdutoEscolhido(Cliente cpf) {
        System.out.println("Os produtos escolhidos foram");
        for (ProdutoFragrância produto: produtoEscolhido) {
            System.out.println(produto.getName() + " -R$" + produto.getPreco());
        }
        return produtoEscolhido;
    }

    public Cliente(){
        this.email=getEmail();
        this.gender = getGender();
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDataRegister(LocalDate dataRegister) {
        this.dataRegister = dataRegister;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
    }
