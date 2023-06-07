
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
    public List<ProdutoFragrância> getProdutoEscolhido(Cliente cpf) {
        System.out.println("Os produtos escolhidos foram");
        for (ProdutoFragrância produto: produtoEscolhido) {
            System.out.println(produto.getName() + " -R$" + produto.getPreco());
        }
        return produtoEscolhido;
    }


    public RegistroCliente() {
        this.cpfCliente = new HashMap<>();
       // this.clientesRegistrados = new ArrayList<>();
        this.gendAndEmail = new HashMap<>();
    }
    public void nomeCliente(Cliente cliente) {

        System.out.print("Digite seu nome: ");
        cliente.setNome(read.next());
    }

    public void cpfDoCliente(Cliente cliente) {

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
            cpfDoCliente(cliente);
        }
    }

    public void generoDoCliente(Cliente cliente) {
        System.out.print("Digite seu genêro: ");
        setGender(read.next());

    }

    public void dataRegistroCliente(Cliente cliente) {
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

    public void emailCliente(Cliente cliente) {
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

    public void mostrarCPFeNome(Cliente cliente) {
        if (!cpfCliente.containsKey(cliente.getCpf())){
            cpfCliente.put(cliente.getCpf(),cliente.getNome());
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

           // nomeCliente(cliente);
            cpfDoCliente(cliente);
//            dataRegistroCliente(cliente);
//            emailCliente(cliente);


            generoDoCliente(cliente);


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
           mostrarClientesRegistrados();
    }

    public void setClientesRegistrados(Cliente clienteRegistrado) {
        clientesRegistrados.add(clienteRegistrado);

    }

    public List<Cliente> getClientesRegistrados() {
        return clientesRegistrados;
    }

    public void mostrarClientesRegistrados() {
            for (Cliente cliente: clientesRegistrados){
                mostrarCPFeNome(cliente);
               showGenderAndEmail(cliente);
            }
    }
    public Cliente buscarCliente (Cliente cpf) {
        for (Cliente cliente : clientesRegistrados){
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    } public void cadastroUnico(){
        Cliente cliente = new Cliente();

         nomeCliente(cliente);
        cpfDoCliente(cliente);
        dataRegistroCliente(cliente);
        emailCliente(cliente);


        setClientesRegistrados(cliente);

        System.out.println("=========================");
        System.out.println("OS DADOS FORAM REGISTRADOS");
        System.out.println("Parabéns você foi cadatrado");
        System.out.println("Data do registro -- " + dataRegistro);
        System.out.println("=============================");



    }
}



