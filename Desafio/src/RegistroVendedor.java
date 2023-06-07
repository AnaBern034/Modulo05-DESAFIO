import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

public class RegistroVendedor extends Vendedor implements Registro{
    //tenho que fazer um try cacth para cada  OK
    Scanner read = new Scanner(System.in);
    String dataRegistro;
    private HashMap<String,String> cpfCliente;
    private HashMap<String,String> GenderAndEmail;

    private List<Vendedor> vendedoresRegistrados;

    public List<Vendedor> getVendedoresRegistrados() {
        return vendedoresRegistrados;
    }

    public  RegistroVendedor() {
        this.cpfCliente = new HashMap<>();
        this.GenderAndEmail=new HashMap<>();
        this.vendedoresRegistrados = new ArrayList<>();
    }

    public void nomeVendedor(Vendedor vendedor){
        System.out.print("Digite seu nome: ");
        setName(read.next());
    }
    public void cpfVendedor(Vendedor vendedor) {
        System.out.print("Digite seu cpf sem o simbolo que separa os ultimos dois digitos: ");
        String cpfInput = read.next();
        boolean valido = true;
        for (int i = 0; i < cpfInput.length(); i++) {
            if (!Character.isDigit(cpfInput.charAt(i))) {
                valido = false;
                break;
            }
        }
        if (valido) {
            setCpf(cpfInput);
        } else {
            System.out.println("Opção inválida. Digite apenas números para o CPF.");
            cpfVendedor(vendedor);

        }
    }
    public void generoVendedor(Vendedor vendedor){
        System.out.print("Digite seu gênero: ");
        String gender = read.next();
        setGender(gender);
    }
    public void dataRegistroVendedor(Vendedor vendedor){
        boolean dataValida = false;
        while (!dataValida){
            System.out.print("Digite a data de registro: ");
            dataRegistro = read.next();
            try {
                DateTimeFormatter padraoEsperado = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate data = LocalDate.parse(dataRegistro,padraoEsperado);

                int anoLimite = 2024;
                int anoAtual = LocalDate.now().getYear();
                if (data.getYear() > anoLimite || data.getYear() < 2000){
                    System.out.println("Ano inválido.Digite novamente");
                    continue;
                }
                dataRegistro= data.format(padraoEsperado);
                dataValida= true;
                setDataRegister(dataRegister);
            } catch (DateTimeParseException erro) {
                System.out.println("Formato de data inválido, Digite novamente");
            }
        }
    }
    public void emailVendedor(Vendedor vendedor){

        System.out.print("Digite seu email: ");
        String email= read.next();

        boolean emailValido = validarEmail(email);

        while (!emailValido){
            System.out.println("Email iválido, verifique so seu email possui '.' e '@'");
            System.out.println("Digite seu email novamente: ");
            email=read.next();
            emailValido = validarEmail(email);

        }
        setEmail(email);
    }
    private boolean validarEmail(String email){
        return email.contains(".") && email.contains("@");
    }

    public void mostrarNomeCPF(Vendedor vendedor ){
        cpfCliente.put(getCpf(), getName());
        for (Map.Entry<String, String> entry : cpfCliente.entrySet()) {
            System.out.println("Cpf: " + entry.getKey() + "\nNome: " + entry.getValue());
        }
    }
    public void mostraEmailGenero(Vendedor vendedor){
        GenderAndEmail.put(getEmail(),getGender());
        for (Map.Entry<String,String>entry: GenderAndEmail.entrySet()){
            System.out.println("Email: " + entry.getKey() + "\nGenêro " + entry.getValue());
        }

    }
    @Override

    public void registration() {
        boolean continuarCadastro = true;
        while (continuarCadastro) {

            Vendedor vendedor = new Vendedor();
            nomeVendedor(vendedor);
            cpfVendedor(vendedor);
            generoVendedor(vendedor);
            emailVendedor(vendedor);
            dataRegistroVendedor(vendedor);

            vendedoresRegistrados.add(vendedor);

            System.out.println("OS DADOS FORAM REGISTRADOS ");
            System.out.println();

            System.out.println("Deseja registrar mais vendedores ");
            String resposta = read.next();
            if (resposta.equalsIgnoreCase("N")) {
                continuarCadastro = false;
            }
            System.out.println("Os vendedores registrados são");
            mostrarVededores();
            System.out.println("================");
            System.out.println("Parabéns você foi cadatrado");
            System.out.println("Data do registro -- "+dataRegistro);
            System.out.println("================");
        }
    }
    public void mostrarVededores(){
        for (Vendedor vendedor : vendedoresRegistrados){
        System.out.println("=================");
        mostrarNomeCPF(vendedor);
        mostraEmailGenero(vendedor);
    }
}
public void cadastroUnico(){
    Vendedor vendedor = new Vendedor();
   // nomeVendedor(vendedor);
    cpfVendedor(vendedor);
//    generoVendedor(vendedor);
//     emailVendedor(vendedor);
//    dataRegistroVendedor(vendedor);

    vendedoresRegistrados.add(vendedor);

    System.out.println("OS DADOS FORAM REGISTRADOS ");
    System.out.println();
    System.out.println("================");
    System.out.println("Parabéns você foi cadatrado");
    System.out.println("Data do registro -- "+dataRegistro);
    System.out.println("================");

}
}

