import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RegistroCliente extends Cliente implements Registro{
   /* 1- arrumar o cpf e o hashmap OK
    2- arrumar o localDate OK
    3- colocar cpf em String que passe numeros OK
    4- colocar email em stringn OK
    5- fazer o metodo final OK
    6- fazer que o sistema crie mais cliente e armazenar
    7- arrumar detalhes
    8- como escolher o vendedor que for somar o produto , quano do o usuario entrar como cliente
    os vendedores ja estarão cadastrados
    */
    Scanner read = new Scanner(System.in);
    String dataRegistro;
    private HashMap<String,String> cpfCliente;

    public RegistroCliente() {
        this.cpfCliente = new HashMap<>();
    }

    public void nameOfCostumer(){
        System.out.print("Digite seu nome: ");
        setName(read.next());
    }
    public void cpfOfCostumer() {

        System.out.print("Digite seu cpf: ");
        setCpf(read.next());
    }
    public void genderOfCostumer (){
        System.out.println("Digite seu gênero: ");
        setGender(read.next());

    }
    public void dataRegistroOfCostumer(){
        System.out.println("Digite a data de registro: ");
         dataRegistro = read.next();
        DateTimeFormatter padraoEsperado = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        setDataRegister(dataRegister);
    }
    public void emailOfCostumer(){
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
        nameOfCostumer();
        cpfOfCostumer();
        genderOfCostumer();
        emailOfCostumer();
        dataRegistroOfCostumer();

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

