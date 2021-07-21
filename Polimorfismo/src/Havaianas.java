
import javax.swing.JOptionPane;

/**
 * Classe criada para impementar os metodos da intreface pizza
 * @author Adilson Luz
 * @since Classe Criada em 06/05/2021, 10:33:33
 */
public class Havaianas implements Pizzas{
    float valor = 29.50f;

    @Override
    public void montarIngredientes() {
        System.out.println("Sabor: Havaiana");
        System.out.println("Ingredientes: Queijo, abacaxi, lombo suíno");
    }

    @Override
    public void assar() {
        System.out.println("Tempo de forno 10 min");
    }

    @Override
    public void cobrar() {
        System.out.println("Valor R$ " + this.valor);
    }

    @Override
    public void exibirMensagem() {
        String msg;
        msg = "Sabor: Havaiana"
                + "\nIngredientes: Queijo, abacaxi, lombo suíno"
                + "\nTempo de forno 10 min"
                + "\nValor R$ " + this.valor;
        JOptionPane.showMessageDialog(null, msg);
    }
    
    @Override
    public float getValor(){
        return this.valor;
    }

}//fim da classe
