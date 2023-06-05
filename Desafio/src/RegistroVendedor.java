import java.time.format.DateTimeFormatter;
import java.util.*;

public class RegistroVendedor extends Vendedor implements Registro{
    //tenho que fazer um try cacth para cada
    Scanner read = new Scanner(System.in);
    String dataRegistro;
    private HashMap<String,String> cpfCliente;
    private List<Vendedor> vendedoresRegistrados;

    public List<Vendedor> getVendedoresRegistrados() {
        return vendedoresRegistrados;
    }

    public  RegistroVendedor() {
        this.cpfCliente = new HashMap<>();
        this.vendedoresRegistrados = new ArrayList<>();
    }

    public void nameOfSeller(Vendedor vendedor){
        System.out.print("Digite seu nome: ");
        setName(read.next());
    }
    public void cpfOfSeller(Vendedor vendedor) {

        System.out.print("Digite seu cpf: ");
        setCpf(read.next());
    }
    public void genderOfSeller(Vendedor vendedor){
        System.out.println("Digite seu gênero: ");
        setGender(read.next());

    }
    public void dataRegistroOfSeller(Vendedor vendedor){
        System.out.println("Digite a data de registro: ");
        dataRegistro = read.next();
        DateTimeFormatter padraoEsperado = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        setDataRegister(dataRegister);
    }
    public void emailOfSeller(Vendedor vendedor){
        System.out.println("Digite seu email: ");
        setEmail(read.next());
    }

    public void showCpdAndName(Vendedor vendedor ){
        cpfCliente.put(getCpf(), getName());
        for (Map.Entry<String, String> entry : cpfCliente.entrySet()) {
            System.out.println("Cpf: " + entry.getKey() + "\nNome: " + entry.getValue());
        }

    }
    @Override

    public void registration() {
        boolean continuarCadastro = true;
        while (continuarCadastro) {

            Vendedor vendedor = new Vendedor();
            nameOfSeller(vendedor);
            cpfOfSeller(vendedor);
            genderOfSeller(vendedor);
            emailOfSeller(vendedor);
            dataRegistroOfSeller(vendedor);

            vendedoresRegistrados.add(vendedor);

            System.out.println("OS DADOS FORAM REGISTRADOS ");
            System.out.println();

            System.out.println("Deseja registrar mais vendedores ");
            String resposta = read.next();
            if (resposta.equalsIgnoreCase("N")) {
                continuarCadastro = false;
            }
            System.out.println("Os clientes registrados são");
            mostrarVededores();
            System.out.println("================");
            System.out.println("Parabéns você foi cadatrado");
            System.out.println("Data do registro -- "+dataRegistro);
            System.out.println("================");
        }
    }   public void mostrarVededores(){
        for (Vendedor vendedor : vendedoresRegistrados){
        System.out.println("=================");
        showCpdAndName(vendedor);
        System.out.println("Gênero: "+vendedor.getGender());
        System.out.println("Email: "+vendedor.getEmail());
    }
}
}

