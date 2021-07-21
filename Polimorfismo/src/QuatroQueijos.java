
import javax.swing.JOptionPane;

/**
 * Classe criada para implementar todos os metodos da interface pizza
 * @author Adilson Luz
 * @since Classe Criada em 06/05/2021, 10:28:29
 */
public class QuatroQueijos implements Pizzas{
    float valor = 42;

    @Override
    public void montarIngredientes() {
        System.out.println("Sabor: Quatro Queijos");
        System.out.println("Ingredientes: Molho de tomate, mussarela, parmesão, provolone, gorgonzola");
    }

    @Override
    public void assar() {
        System.out.println("Tempo de forno 7 min");
    }

    @Override
    public void cobrar() {
        System.out.println("Valor R$ " + this.valor);
    }

    @Override
    public void exibirMensagem() {
        String msg;
        msg = "Sabor: Quatro Queijos"
                + "\nIngredientes: Molho de tomate, mussarela, parmesão,"
                + " provolone, gorgonzola"
                + "\nTempo de forno 07 min"
                + "\nValor R$ " + this.valor;
        JOptionPane.showMessageDialog(null, msg);
    }
    
    @Override
    public float getValor(){
        return this.valor;
    }

}//fim da classe
