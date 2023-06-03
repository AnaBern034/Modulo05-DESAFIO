import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class RegistroCliente extends Cliente implements Registro{
    Scanner read = new Scanner(System.in);
    @Override
    public void registration() {
            System.out.println("Para fazer o registro você precisa inserir os seguinte dados:");
            System.out.println("Digte seu nome: ");
            setName(read.next());

            System.out.println("Digite seu gênero: ");
            setGender(read.next());

            System.out.println("Digite a data de registro: ");
            String dataRegistro = read.next();
            DateTimeFormatter padraoEsperado = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            setDataRegister(dataRegister);

            System.out.println("Digite seu cpf");
            setCpf(read.next());
           // cpfNome.put("Cpf:"+getCpf(cpf)+"....\n"," Nome:"+getName(name));


            System.out.println("Seus dados cadastrados foram");
            System.out.println(getCpfNome());
            System.out.println("Gênero: "+getGender());
            System.out.println("Data de registro: ");

        }
    }

