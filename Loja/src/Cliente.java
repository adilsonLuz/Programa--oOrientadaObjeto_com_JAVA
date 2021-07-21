
import java.util.ArrayList;

/**
 * Classe criada para instanciar um cliente e permitir a inclusao de produtos
 * para ele.
 * @author Adilson Luz
 * @since Classe Criada em 20/05/2021, 10:30:00
 */
public class Cliente {
    String nome;
    ArrayList<Produto> listaCompra = new ArrayList();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Produto> getListaCompra() {
        return listaCompra;
    }

    public void setListaCompra(ArrayList<Produto> listaCompra) {
        this.listaCompra = listaCompra;
    }
    
    public void adiconarItemCompra(Produto p){
        listaCompra.add(p);
    }
    
    public void listarCompras(){
        float totalCompra = 0;
        System.out.println("\nCliente: " + getNome());
        for(Produto p:listaCompra){
            System.out.println("Produto: " + p.getDescricao());
            totalCompra += p.getPreco();
        }//fim do laço
        System.out.println("-----------------------------------");
        System.out.println("Total: R$ " + totalCompra);
    }
    
    public void removerItemLista(String nomeProduto){
        for(Produto p : listaCompra)
            if(p.getDescricao().equalsIgnoreCase(nomeProduto)){
                listaCompra.remove(p);
            System.out.println("========>Item Excluído!!!");
            }
            else{
                System.out.println("=======Item não localizado!!!========");
                }
    
}
    
    public void buscarItemListaCliente(String nomeProduto){
        for(Produto p : listaCompra)
            if(p.getDescricao().equalsIgnoreCase(nomeProduto)){
                System.out.println("\n-----------------------------------");
                System.out.println("Codigo: " + p.getCodigo() +
                        "\nDescrição: " + p.getDescricao() +
                        "\nPreço: R$" + p.getPreco());
            }
    }//fim do metodo

}//fim da classe
