
import javax.swing.JOptionPane;

/**
 * Classe criada para implementar uma pizza de acordo com as funcionalidades 
 * da interface
 * @author Adilson Luz
 * @since Classe Criada em 06/05/2021, 10:17:10
 */
public class Portuguesas implements Pizzas{
    float valor = 35;

    @Override
    public void montarIngredientes() {
        System.out.println("Sabor: Portuguesa");
        System.out.println("Ingredientes: Molho de tomate, ervilha, ovos, azeitonas preta, cebola"
                + ", presunto");
    }

    @Override
    public void assar() {
        System.out.println("Tempo de forno 12 min");
    }

    @Override
    public void cobrar() {
        System.out.println("Valor R$ " + this.valor);
    }

    @Override
    public void exibirMensagem() {
        String msg;
        msg = "Sabor: Portuguesa\nIngredientes: Molho de tomate, ervilha, ovos,"
                + " azeitonas preta, cebola, presunto\nTempo de forno 12 min\n"
                + "Valor R$ " + this.valor;
        JOptionPane.showMessageDialog(null, msg);
    }
    
    @Override
    public float getValor(){
        return this.valor;
    }
}//fim da classe
