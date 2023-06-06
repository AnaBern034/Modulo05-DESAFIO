import java.time.LocalDate;
import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cliente {
    private String cpf,email,name,gender;
    protected LocalDate dataRegister;

    Map<ProdutoFragrância, Integer > produtoEscolhido = new HashMap<>();


    public Map<ProdutoFragrância, Integer> getProdutoEscolhido() {
        return produtoEscolhido;
    }

    public void setCompra(ProdutoFragrância produto, int quantidade) {
        produtoEscolhido.put(produto,quantidade);
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

    public String setName(String name) {
        this.name = name;
        return name;
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

    public String setGender(String gender) {
        this.gender = gender;
        return gender;
    }

    public String setEmail(String email) {
        this.email = email;
        return email;
    }

    public String getEmail() {
        return email;
    }
    }
