import java.util.Scanner;

public class ListaProdutos {
    // 1 - arrumar detalhes no console
    Scanner read = new Scanner(System.in);
    public void listaSabonete() {
    ProdutoFragrância sabonete1 = new ProdutoFragrância(71, "Sabonete Perfumado", 10.99);
    ProdutoFragrância sabonete2 = new ProdutoFragrância(72, "Sabonete Suave Delicado", 12.99);
    ProdutoFragrância sabonete3 = new ProdutoFragrância(73, "Sabonete Relaxante Lavanda", 14.99);
    System.out.println("       --SABONETE--     ");
    System.out.println("Código: "+sabonete1.getCodigo()+" "+sabonete1.getName()+" Preço: R$"+ sabonete1.getPreco());
    System.out.println("Código: "+sabonete2.getCodigo()+" "+sabonete2.getName()+" Preço: R$"+ sabonete2.getPreco());
    System.out.println("Código: "+sabonete3.getCodigo()+" "+sabonete3.getName()+" Preço: R$"+ sabonete3.getPreco());
}
    public void listaCremes() {
        ProdutoFragrância creme1 = new ProdutoFragrância(81, "Creme Hidratante", 20.99);
        ProdutoFragrância creme2 = new ProdutoFragrância(82, "Creme Flor de Cereja", 22.99);
        ProdutoFragrância creme3 = new ProdutoFragrância(83, "Creme Rosa Encantadora", 24.99);
        System.out.println("     --CREME--     ");
        System.out.println("Código: "+creme1.getCodigo()+" "+creme1.getName()+" Preço: R$"+creme1.getPreco());
        System.out.println("Código: "+creme2.getCodigo()+" "+creme2.getName()+" Preço: R$"+creme2.getPreco());
        System.out.println("Código: "+creme3.getCodigo()+" "+creme3.getName()+" Preço: R$"+creme3.getPreco());

    }
    public void listPerfume(){
        ProdutoFragrância perfume1 = new ProdutoFragrância(91,"Perfume Floral Romântico",30.99);
        ProdutoFragrância perfume2 = new ProdutoFragrância(92,"Perfume Frutado Delicioso",32.99);
        ProdutoFragrância perfume3 = new ProdutoFragrância(92,"Perfume Herbal Revigorante",34.99);
        System.out.println("    --PERFUME---   ");
        System.out.println("Código: "+perfume1.getCodigo()+" "+perfume1.getName()+" Preço: R$"+ perfume1.getPreco());
        System.out.println("Código: "+perfume2.getCodigo()+" "+perfume2.getName()+" Preço: R$"+ perfume2.getPreco());
        System.out.println("Código: "+perfume3.getCodigo()+" "+perfume3.getName()+" Preço: R$"+ perfume3.getPreco());
    }
    public void escolherProduto(){
        System.out.println("Digite o numero do produto que você quer comprar");
        System.out.println("1- SABONETE\n2- CREME\n3- PERFUME");
        Integer opcao = read.nextInt();
        if (opcao.equals(1)){
            listaSabonete();
        } else if (opcao.equals(2)) {
            listaCremes();
        } else if (opcao.equals(3)) {
            listPerfume();
        } else {
            System.out.println("Opção inválida, digite novamente");
        }
    }


}
