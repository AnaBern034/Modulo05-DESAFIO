
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

public class RegistroCliente extends Cliente implements Registro {
  /* 8- arrumar detalhes OK
    9- Fazer um try catch para cada OK
    */
    Scanner read = new Scanner(System.in);
    String dataRegistro;
    private HashMap<String, String> cpfCliente;
    private HashMap<String, String> gendAndEmail;
    private List<Cliente> clientesRegistrados=new ArrayList<>();


    public RegistroCliente() {
        this.cpfCliente = new HashMap<>();
       // this.clientesRegistrados = new ArrayList<>();
        this.gendAndEmail = new HashMap<>();
    }
    public void nameOfCostumer(Cliente cliente) {

        System.out.print("Digite seu nome: ");
        cliente.setName(read.next());
    }

    public void cpfOfCostumer(Cliente cliente) {

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
            cliente.setCpf(cpfInput);
        } else {
            System.out.println("Opção inválida. Digite apenas números para o CPF.");
            cpfOfCostumer(cliente);
        }
    }

    public void genderOfCostumer(Cliente cliente) {
        System.out.print("Digite seu genêro: ");
        setGender(read.next());

    }

    public void dataRegistroOfCostumer(Cliente cliente) {
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
            cliente.setDataRegister(dataRegister);
        } catch (DateTimeParseException erro){
            System.out.println("Formato de data inválido, Digite novamente");
        }

    }
    }

    public void emailOfCostumer(Cliente cliente) {
        System.out.print("Digite seu email: ");
        String email= read.next();

        boolean emailValido = validarEmail(email);

        while (!emailValido){
            System.out.println("Email iválido, verifique so seu email possui '.' e '@'");
            System.out.println("Digite seu email novamente: ");
            email=read.next();
            emailValido = validarEmail(email);

        }
        cliente.setEmail(email);
    }
    private boolean validarEmail(String email){
        return email.contains(".") && email.contains("@");
    }

    public void showCpfAndName(Cliente cliente) {
        if (!cpfCliente.containsKey(cliente.getCpf())){
            cpfCliente.put(cliente.getCpf(),cliente.getName());
        }
        for (Map.Entry<String, String> entry : cpfCliente.entrySet()) {
            System.out.println("Cpf: " + entry.getKey() + "\nNome: " + entry.getValue());
        }

    }
    public void showGenderAndEmail(Cliente cliente) {
        gendAndEmail.put(cliente.getGender(),cliente.getEmail());
        for (Map.Entry<String, String> entry : gendAndEmail.entrySet()) {
            System.out.println("Email: " + entry.getKey() + "\nGênero: " + entry.getValue());
        }

    }


    @Override
    public void registration() {

        boolean continuarCadastrando = true;
        while (continuarCadastrando) {

            Cliente cliente = new Cliente();

             //nameOfCostumer(cliente);
             cpfOfCostumer(cliente);
//             genderOfCostumer(cliente);
//            emailOfCostumer(cliente);
//            dataRegistroOfCostumer(cliente);

            setClientesRegistrados(cliente);

            System.out.println("=========================");
            System.out.println("OS DADOS FORAM REGISTRADOS");
            System.out.println("Parabéns você foi cadatrado");
            System.out.println("Data do registro -- " + dataRegistro);
            System.out.println("=============================");


            System.out.println("Deseja fazer mais cadastro? (S/N)");
            String opcap = read.next();
            if (opcap.equalsIgnoreCase("N")) {
                continuarCadastrando = false;
            }
        }
            System.out.println("Os clientes registrados foram: ");
            getClientesRegistrados();
    }

    public void setClientesRegistrados(Cliente clienteRegistrado) {
        clientesRegistrados.add(clienteRegistrado);
    }

    public void   getClientesRegistrados() {
            for (Cliente cliente: clientesRegistrados){
                showCpfAndName(cliente);
               showGenderAndEmail(cliente);
            }

    }
    public Cliente buscarCliente (String cpf) {
        for (Cliente cliente : clientesRegistrados){
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
//        for (int i=0; i < clientesRegistrados.size();i++){
//            if (clientesRegistrados.get(i).getCpf().toLowerCase().equals(cpf.toLowerCase())){
//                return clientesRegistrados.get(i);
            }
        return null;

    }
}


