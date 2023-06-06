public class VendedorRegistrarCliente {
    RegistroVendedor vendedor = new RegistroVendedor();
    RegistroCliente cliente = new RegistroCliente();
    public void VendedorRegistrar(){
        System.out.println("Você escolheu entrar como vendedor");
        System.out.println("Primeiro vamos te registrar");
        vendedor.registration();
        System.out.println("Parabens você foi cadastrado");
        System.out.println("Seu objetivo é cadastrar até 3 clientes");
        cliente.registration();
        System.out.println("==============");
        System.out.println("Parabens suas metas foram concluidas");
        System.out.println("================");
        System.out.println("Digite sim para encerrar");




    }

}
