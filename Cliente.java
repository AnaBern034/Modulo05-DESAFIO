import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

public class Cliente {
    // a classe cliente precisa de ter apenas os atributos do cliente
    protected HashMap<String, String> cpfNome;
    private String cpf;
    protected String name;
    private String gender;
    protected LocalDate dataRegister;

    public Cliente(){
        cpfNome = new HashMap<>();
    }


    public HashMap<String, String> getCpfNome() {
        return cpfNome;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(String name) {
        return this.name;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf(String cpf) {
        return this.cpf;
    }

    public void setDataRegister(LocalDate dataRegister) {
        this.dataRegister = dataRegister;
    }

    public LocalDate getDataRegister() {

        return dataRegister;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void registration() {
    }
}
