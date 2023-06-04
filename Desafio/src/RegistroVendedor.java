import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RegistroVendedor extends Vendedor implements Registro{
    Scanner read = new Scanner(System.in);
    String dataRegistro;
    private HashMap<String,String> cpfCliente;

    public  RegistroVendedor() {
        this.cpfCliente = new HashMap<>();
    }

    public void nameOfSeller(){
        System.out.print("Digite seu nome: ");
        setName(read.next());
    }
    public void cpfOfSeller() {

        System.out.print("Digite seu cpf: ");
        setCpf(read.next());
    }
    public void genderOfSeller(){
        System.out.println("Digite seu gênero: ");
        setGender(read.next());

    }
    public void dataRegistroOfSeller(){
        System.out.println("Digite a data de registro: ");
        dataRegistro = read.next();
        DateTimeFormatter padraoEsperado = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        setDataRegister(dataRegister);
    }
    public void emailOfSeller(){
        System.out.println("Digite seu email: ");
        setEmail(read.next());
    }

    public void showCpdAndName(){
        cpfCliente.put(getCpf(), getName());
        for (Map.Entry<String, String> entry : cpfCliente.entrySet()) {
            System.out.println("Cpf: " + entry.getKey() + "\nNome: " + entry.getValue());
        }

    }
    @Override

    public void registration() {
        nameOfSeller();
        cpfOfSeller();
        genderOfSeller();
        emailOfSeller();
        dataRegistroOfSeller();

        System.out.println("=================");
        System.out.println("OS DADOS REGISTRADOS FORAM");
        showCpdAndName();
        System.out.println("Gênero: "+getGender());
        System.out.println("Email: "+getEmail());
        // System.out.println("Digite 1 para continuar"); complementos
        System.out.println("================");
        System.out.println("Parabéns você foi cadatrado");
        System.out.println("Data do registro -- "+dataRegistro);
        System.out.println("================");

    }
}
