import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VendedorRegistrarCliente metas = new VendedorRegistrarCliente();
        RegistroVendedor vendedor = new RegistroVendedor();
        RegistroCliente cliente = new RegistroCliente();
        ComprarProdutos compra = new ComprarProdutos(vendedor,cliente,null);
        BuscarRegistrados regis = new BuscarRegistrados(vendedor,cliente,compra);
        Scanner read = new Scanner(System.in);
//
//        System.out.println("Digite como você quer entrar");
//        System.out.println("1- Vendedor\n2- Cliente");
//        int opcao = read.nextInt();
//        switch (opcao){
//
//            case 1:
//                System.out.println("PRIMEIRO VOCÊ PRECISA DE SE CADASTRAR");
//                vendedor.cadastroUnico();
//                System.out.println("Você deseja\n1-realizar compra do cliente\n2-cadastrar clientes");
//                Integer resultado = read.nextInt();
//                if (resultado.equals(1)){
//                        System.out.println("PARA REALIZAR A COMPRA DO CLIENTE VOCÊ PRECISA CADASTRAR O CLIENTE");
//                        cliente.registration();
//                        System.out.println("AGORA VAMOS AS COMPRASSSS");
//                        // metodo de compras
//                } if (resultado.equals(2)){
//                System.out.println("PRIMEIRO VC PRECISA DE SE CADASTRAR COMO VENDEDOR");
//                vendedor.cadastroUnico();
//                System.out.println("AGORA SEU OBJETIVO É CUMPRIR METAS");
//                System.out.println("-A CADA CLIENTE REGISTRADO UMA NOVA VENDA A SER CUMPRIDA");
//                metas.VendedorRegistrar();
//                }else {
//            System.out.println("Opção inválida");
//        } case 2:
//                System.out.println("Você deseja \n1-realizar compras?\n 2- Fazer apenas cadastro");
//                Integer resultado2 = read.nextInt();
//                if (resultado2.equals(1)){
//                    System.out.println("Para realizar as compras primeiro você precisa de se cadastrar");
//                    cliente.registration();
//
//
//
//                }
//        }


        cliente.registration();
        compra.escolherProduto(cliente);

    }
}