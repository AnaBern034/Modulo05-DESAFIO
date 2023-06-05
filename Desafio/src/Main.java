import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        RegistroVendedor vendedor = new RegistroVendedor();
        RegistroCliente cliente = new RegistroCliente();
       ListaProdutos compra = new ListaProdutos(vendedor);
        Scanner read = new Scanner(System.in);
//        System.out.println("Digite como você quer entrar");
//        System.out.println("1- Vendedor\n2- Cliente");
//        String opcao = read.next();
//        if (opcao.equalsIgnoreCase("vendedor")){
//            System.out.println("Digite a opção que deseja");
//            System.out.println("1- Cadastrar vendedor\n 2- Vender");
//            Integer digito = read.nextInt();
//            if (digito.equals(1)){
//                vendedor.registration();
//            }
//        } else if (opcao.equalsIgnoreCase("cliente")) {
//            System.out.println("1 para cadastro");
//            int ooo= read.nextInt();
//            if (ooo==1){
//
//            }
//
//        }else {
//            System.out.println("Opção inválida, digite novamente");
//        }
//    }e
//}
        vendedor.registration();
        compra.quemVendeuProduto();



    }
}