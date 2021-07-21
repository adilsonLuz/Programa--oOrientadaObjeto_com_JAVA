
import javax.swing.JOptionPane;

/**
 * Classe criada para 
 * @author Adilson Luz
 * @since Classe Criada em 06/05/2021, 11:38:33
 */
public class Menus {
    Pizzas pizzas;
    String msg;
    Fornos fornos = new Fornos();
    int opcao;
    float faturamento = 0;
    
    public Menus(){
        msg = "Menu de Pizzas"
                    + "\n1 - Portuguesa"
                    + "\n2 - Quatro Queijo"
                    + "\n3 - Havaiana"
                    + "\n4 - Pão Caseiro"
                    + "\n88 - Faturamento do dia"
                    + "\n9 - Sair";
       
            while(true){
                opcao = Integer.parseInt(JOptionPane.showInputDialog(msg));
                switch(opcao){
                        case 1: pizzas = new Portuguesas();
                            break;
                        case 2: pizzas = new QuatroQueijos();
                            break;
                        case 3: pizzas = new Havaianas();
                            break;
                        case 4: pizzas = new Pão();
                            break;
                        case 88: JOptionPane.showMessageDialog(null, "Faturamento R$ " + faturamento);
                            break;
                        case 9: System.exit(0);
                            break;
                        default: JOptionPane.showMessageDialog(null, "Opção inválida!!!");
                            opcao = 0;
                }//Fim do switch
                if(opcao != 0 && opcao != 88){
                    fornos.preparar(pizzas);
                    faturamento = faturamento + pizzas.getValor();
                }//Fim do if
            }//Fim do while
    }//Fim do metodo
}//fim da classe
