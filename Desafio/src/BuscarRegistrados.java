import java.util.Scanner;

//Fazer com que o cliente seja o produto ou seja
// a cada cliente registrado vai ser uma iteração para  produto
// inves cadastrar produto ele vai cadastrar cliente e obter uma meta
public class BuscarRegistrados extends ComprarProdutos{
    Scanner read = new Scanner(System.in);
    private RegistroCliente registroCliente;

    public BuscarRegistrados(RegistroVendedor registroVendedor, RegistroCliente registroCliente,ComprarProdutos compra){
        super(registroVendedor, registroCliente,compra);

    }

    public Cliente buscarCliente (String cpf) {
       for (Cliente cliente : registroCliente.getClientesRegistrados()){
           if (cliente.getCpf().equals(cpf)){
               return cliente;
           }
       }
       return null;

       }
    }
//}Cliente clienteEncontrado = new Cliente();
//       for (Cliente cliente : registroCliente.getClientesRegistrados()) {
//               if (cpf.equals(cliente.getCpf())) {
//               clienteEncontrado = cliente;
//
//
//               }if (clienteEncontrado != null) {
//               MostrarProdutos(cliente.getCpf());
//               }else {
//               System.out.println("Cliente não encontrado");
//               }