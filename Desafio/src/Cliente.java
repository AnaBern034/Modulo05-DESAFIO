import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Cliente {
    private String cpf,email,nome, genero;
    protected LocalDate dataRegister;

   List<ProdutoFragrância> produtoEscolhido = new ArrayList<>();


    public void setCompra(ProdutoFragrância produto, int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            produtoEscolhido.add(produto);

        }
    }

    public Cliente(){
        this.email=getEmail();
        this.genero = getGender();
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {

        return nome;
    }

    public void setDataRegister(LocalDate dataRegister) {
        this.dataRegister = dataRegister;
    }

    public String getGender() {
        return genero;
    }

    public void setGender(String gender) {
        this.genero = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
    }
