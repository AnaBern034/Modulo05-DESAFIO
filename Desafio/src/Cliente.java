import java.time.LocalDate;

public class Cliente {
    private String cpf,email,name,gender;
    protected LocalDate dataRegister;


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
