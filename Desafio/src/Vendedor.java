import java.time.LocalDate;

public class Vendedor {
    // fazer interação para o vendedor vender com objetivos e metas OK

    private String cpf,email,name,gender;
    protected LocalDate dataRegister;

    public String setCpf(String cpf) {
        this.cpf = cpf;
        return cpf;
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