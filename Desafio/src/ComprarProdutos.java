
import java.util.Map;
import java.util.Scanner;

public class ComprarProdutos {
    Scanner read = new Scanner(System.in);

    ListaProdutos lista =new ListaProdutos();
    private RegistroVendedor registroVendedor;
    private RegistroCliente registroCliente;
    public ComprarProdutos(RegistroVendedor registroVendedor, RegistroCliente registroCliente, ComprarProdutos compra) {
        this.registroVendedor =registroVendedor;
        this.registroCliente = registroCliente;
    }

    public void escolherProduto(RegistroCliente cliente) {
    double total = 0.0;
    boolean continuarComprando = true;

        System.out.println("Digiteo cpf do cliente");
        String cpf = read.nextLine();

        Cliente cliente1 = registroCliente.buscarCliente(cpf);
        if (cliente1 == null){
            System.out.println("Cliente não encotrado");
            return;
        }

    while (continuarComprando) {
        System.out.println("Digite o numero do produto que você quer comprar");
        System.out.println("1- SABONETE\n2- CREME\n3- PERFUME");
        Integer opcao = read.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("============================");
                lista.listaSabonete();
                System.out.println("=============================");
                System.out.print("Digite o código do sabonete que você deseja comprar: ");
                Integer codigoSabonete = read.nextInt();
                System.out.println("Digite a quantidade de sabonete que você deseja comprar: ");
                int quantidadeSabonete = read.nextInt();

                if (codigoSabonete.equals(71)) {
                    ProdutoFragrância sabonete1 = new ProdutoFragrância(71, "Sabonete Perfumado", 10.99);
                    cliente.produtoEscolhido.put(sabonete1, quantidadeSabonete);
                    total += sabonete1.getPreco() * quantidadeSabonete;
                    cliente.setCompra(sabonete1,quantidadeSabonete);
                } else if (codigoSabonete.equals(72)) {
                    ProdutoFragrância sabonete2 = new ProdutoFragrância(72, "Sabonete Suave Delicado", 12.99);
                    cliente.produtoEscolhido.put(sabonete2, quantidadeSabonete);
                    total += sabonete2.getPreco() * quantidadeSabonete;
                } else if (codigoSabonete.equals(73)) {
                    ProdutoFragrância sabonete3 = new ProdutoFragrância(73, "Sabonete Relaxante Lavanda", 14.99);
                    cliente.produtoEscolhido.put(sabonete3, quantidadeSabonete);
                    total += sabonete3.getPreco() * quantidadeSabonete;
                } else {
                    System.out.println("Código de sabonete inválido");
                    return;
                }
                break;
            case 2:
                lista.listaCremes();
                System.out.print("Digite o código do creme que você deseja comprar: ");
                Integer codigoCreme = read.nextInt();
                System.out.println("Digite a quantidade de sabonete que você deseja comprar: ");
                int quantidadeCreme = read.nextInt();

                if (codigoCreme.equals(81)) {
                    ProdutoFragrância creme1 = new ProdutoFragrância(81, "Creme Hidratante", 20.99);
                    cliente.produtoEscolhido.put(creme1, quantidadeCreme);
                    total += creme1.getPreco() * quantidadeCreme;
                } else if (codigoCreme.equals(82)) {
                    ProdutoFragrância creme2 = new ProdutoFragrância(82, "Creme Flor de Cereja", 22.99);
                    cliente.produtoEscolhido.put(creme2, quantidadeCreme);
                    total += creme2.getPreco() * quantidadeCreme;
                } else if (codigoCreme.equals(83)) {
                    ProdutoFragrância creme3 = new ProdutoFragrância(83, "Creme Rosa Encantadora", 24.99);
                    cliente.produtoEscolhido.put(creme3, quantidadeCreme);
                    total += creme3.getPreco() * quantidadeCreme;
                } else {
                    System.out.println("Código de creme inválido");
                    return;
                }
                break;
            case 3:
               lista.listaPerfume();
                System.out.println("Digite o código do perfume que você deseja comprar:");
                int codigoPerfume = read.nextInt();
                System.out.println("Digite a quantidade de perfumes que você deseja comprar:");
                int quantidadePerfume = read.nextInt();

                if (codigoPerfume == 91) {
                    ProdutoFragrância perfume1 = new ProdutoFragrância(91, "Perfume Floral Romântico", 30.99);
                    cliente.produtoEscolhido.put(perfume1, quantidadePerfume);
                    total += perfume1.getPreco() * quantidadePerfume;
                } else if (codigoPerfume == 92) {
                    ProdutoFragrância perfume2 = new ProdutoFragrância(92, "Perfume Frutado Delicioso", 32.99);
                    cliente.produtoEscolhido.put(perfume2, quantidadePerfume);
                    total += perfume2.getPreco() * quantidadePerfume;
                } else if (codigoPerfume == 93) {
                    ProdutoFragrância perfume3 = new ProdutoFragrância(93, "Perfume Herbal Revigorante", 34.99);
                    cliente.produtoEscolhido.put(perfume3, quantidadePerfume);
                    total += perfume3.getPreco() * quantidadePerfume;
                } else {
                    System.out.println("Código de perfume inválido.");
                    return;
                }
                break;

            default:
                System.out.println("Opção inválida.");
                break;
        }
        System.out.println("Total a pagar R$" + total);

        System.out.println("Deseja comprar mais produtos? (S/N)");
        String resposta = read.next();
        if (!resposta.equalsIgnoreCase("S")) {
            continuarComprando = false;
        }
        System.out.println("Total de compras: "+ total);
    }

    System.out.println("DIGITE SIM CASO QUEIRO CONCLUIR A COMPRA, se não quiser digite (encerar)");
    String sEn = read.next();
    if (sEn.equalsIgnoreCase("Sim")) {
        System.out.println("COMPRA REALIZADA COM SUCESSO");
       //quemComprouProduto(cpf);
       // quemVendeuProduto();
    } else if (sEn.equalsIgnoreCase("encerrar")) {
        return;
    }
//    } public void MostrarProdutos(){
//        System.out.println("Os produtos escolhidos foram");
//            for (Map.Entry<ProdutoFragrância, Integer> entry : cliente.produtoEscolhido.entrySet()) {
//                ProdutoFragrância produto = entry.getKey();
//                int quantidade = entry.getValue();
//                System.out.println(quantidade + "x " + produto.getName() + " - R$" + produto.getPreco());
//            }
//         }
//    public void quemVendeuProduto(){
//            boolean vendedorEncontrado = false;
//            System.out.println("Qual desses vendedores te atendeu? ");
//            registroVendedor.mostrarVededores();
//            while (!vendedorEncontrado){
//                System.out.println("Digite o CPF do vendedor que te atendeu:");
//                String cpf = read.nextLine();
//                for (Vendedor vendedor: registroVendedor.getVendedoresRegistrados())
//                    if (cpf.equals(registroVendedor.getCpf())){
//                        vendedorEncontrado=true;
//                        System.out.println("Obrigada pela informação!!");
//                        break;
//                    }else{
//                        System.out.println("cpf inválido,digite novamente");
//                        cpf= read.nextLine();
//                    }
//            }
//        }
//        public void quemComprouProduto(String cpf){
//            System.out.println("Digite o cpf: ");
//             cpf = read.nextLine();
//            Cliente cliente1 =registroCliente.buscarCliente(cpf);
//            if (cliente1 == null){
//                System.out.println("Cliente não encontrado");
//                return;
//            }
//            System.out.println("Os produtos escolhidos foram");
//            for (Map.Entry<ProdutoFragrância, Integer> entry : cliente.produtoEscolhido.entrySet()) {
//                ProdutoFragrância produto = entry.getKey();
//                int quantidade = entry.getValue();
//                System.out.println(quantidade + "x " + produto.getName() + " - R$" + produto.getPreco());
//            }
//        }
    }
}


