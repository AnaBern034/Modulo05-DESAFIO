import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RegistroVendedor cadastro = new RegistroVendedor();

        Scanner read = new Scanner(System.in);
        System.out.println("Digite como você quer entrar");
        System.out.println("1- Vendedor\n2- Cliente");
        Integer opcao = read.nextInt();
        if (opcao.equals(1)){
            System.out.println("Digite a opção que deseja");
            System.out.println("1- Cadastrar vendedor\n 2- Vender");
            Integer digito = read.nextInt();
            if (digito.equals(1)){
                cadastro.registration();
            } else if (digito.equals(2)){
                ...
            }
        }
    }
}
