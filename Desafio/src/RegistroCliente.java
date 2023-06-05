
import java.time.format.DateTimeFormatter;
import java.util.*;

public class RegistroCliente extends Cliente implements Registro{
   /* 1- arrumar o cpf e o hashmap OK
    2- arrumar o localDate OK
    3- colocar cpf em String que passe numeros OK
    4- colocar email em stringn OK
    5- fazer o metodo final OK
    6- fazer que o sistema crie mais cliente e armazenar OK
    7- como escolher o vendedor que for somar o produto , quando  o usuario entrar como cliente
    os vendedores ja estarão cadastrados OK

     8- arrumar detalhes
    9- Fazer um try catch para cada
    */


    Scanner read = new Scanner(System.in);
    String dataRegistro;
    private HashMap<String,String> cpfCliente;
    private List<Cliente> clientesRegistrados;

    public RegistroCliente() {
        this.cpfCliente = new HashMap<>();
        clientesRegistrados = new ArrayList<>();
    }


    public void nameOfCostumer(Cliente cliente){
        System.out.print("Digite seu nome: ");
        setName(read.next());
    }
    public void cpfOfCostumer(Cliente cliente) {

        System.out.print("Digite seu cpf: ");
        setCpf(read.next());
    }
    public void genderOfCostumer (Cliente cliente){
        System.out.println("Digite seu gênero: ");
        setGender(read.next());

    }
    public void dataRegistroOfCostumer(Cliente cliente){
        System.out.println("Digite a data de registro: ");
         dataRegistro = read.next();
        DateTimeFormatter padraoEsperado = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        setDataRegister(dataRegister);
    }
    public void emailOfCostumer(Cliente cliente){
        System.out.println("Digite seu email: ");
        setEmail(read.next());
    }

    public void showCpfAndName(){
        cpfCliente.put(getCpf(), getName());
        for (Map.Entry<String, String> entry : cpfCliente.entrySet()) {
            System.out.println("Cpf: " + entry.getKey() + "\nNome: " + entry.getValue());
        }

    }

    @Override
    public void registration() {

        boolean continuarCadastrando = true;
        while (continuarCadastrando){

            Cliente cliente =new Cliente();
            nameOfCostumer(cliente);
            cpfOfCostumer(cliente);
            genderOfCostumer(cliente);
            emailOfCostumer(cliente);
            dataRegistroOfCostumer(cliente);

            clientesRegistrados.add(cliente);

            System.out.println("=========================");
            System.out.println("OS DADOS FORAM REGISTRADOS");
            System.out.println("=============================");



            System.out.println("Deseja fazer mais cadastro? (S/N)");
            String opcap = read.next();
        if (opcap.equalsIgnoreCase("N")){
            continuarCadastrando = false;
        }
        }
        System.out.println("Os clientes registrados foram: ");
        for (Cliente cliente1 : clientesRegistrados){
            showCpfAndName();
            System.out.println("Gênero: "+getGender());
            System.out.println("Email: "+getEmail());
            System.out.println("================");
            System.out.println("Parabéns você foi cadatrado");
            System.out.println("Data do registro -- "+dataRegistro);
            System.out.println("================");
        }
    }
}

