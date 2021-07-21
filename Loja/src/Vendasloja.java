/**
 * Classe criada para efetuar as vendas relacionando clientes com os produtos
 * @author Adilson Luz
 * @since Classe Criada em 20/05/2021, 10:42:27
 */
public class Vendasloja {
    public static void main(String[] args) {
        
        //Clientes da Loja
        Cliente c1 = new Cliente("Ana Paula");
        Cliente c2 = new Cliente("Pedro Augusto");
        Cliente c3 = new Cliente("Josefa Paola");
        
        //Itens que a loja vende
        Produto p1 = new Produto(100, "Blusa", 45.75f);
        Produto p2 = new Produto(400, "Calça", 123.45f);
        Produto p3 = new Produto(300, "Camiseta", 23.65f);
        Produto p4 = new Produto(200, "Meia", 7.50f);
        Produto p5 = new Produto(500, "Jaqueta",235.99f);
        Produto p6 = new Produto(600, "Bolsa",148.99f);
        
        //A agregação entre objeto Cliente/Produto é feita neste momento
        c1.adiconarItemCompra(p1);
        c1.adiconarItemCompra(p2);
                
        c2.adiconarItemCompra(p5);
        c2.adiconarItemCompra(p1);
        c2.adiconarItemCompra(p3);
        
        c3.adiconarItemCompra(p4);
        c3.adiconarItemCompra(p6);
        c3.adiconarItemCompra(p3);
                
        c1.listarCompras();
        c2.listarCompras();
        c3.listarCompras();        
        
        c3.removerItemLista("camiseta");
        c2.buscarItemListaCliente("camiseta");
    }
}//fim da classe
