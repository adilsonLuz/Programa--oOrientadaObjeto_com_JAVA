
import javax.swing.JOptionPane;

/**
 * Classe criada para implementar os metodos da interface pizza
 * @author Adilson Luz
 * @since Classe Criada em 06/05/2021, 11:33:37
 */
public class Pão implements Pizzas{
    float valor = 10;

    @Override
    public void montarIngredientes() {
        System.out.println("Pão Caseiro");
        System.out.println("Ingredientes: farinha, ovos, sal e leite");
    }

    @Override
    public void assar() {
        System.out.println("Tempo de forno 45 min");
    }

    @Override
    public void cobrar() {
        System.out.println("Valor R$ " + this.valor);
    }

    @Override
    public void exibirMensagem() {
        String msg;
        msg = "Pão Caseiro"
                + "\nIngredientes: farinha, ovos, sal e leite"
                + "\nTempo de forno 45 min\n"
                + "Valor R$ " + this.valor;
        JOptionPane.showMessageDialog(null, msg);
    }
    
    @Override
    public float getValor(){
        return this.valor;
    }

}//fim da classe
