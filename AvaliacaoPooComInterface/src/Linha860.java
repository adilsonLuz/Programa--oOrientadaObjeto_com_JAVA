
import javax.swing.JOptionPane;

/**
 * Classe criada para 
 * @author Adilson Luz
 * @since Classe Criada em 23/05/2021, 13:46:47
 */
public class Linha860 implements Onibus{
    String mot,cob,pref,conc,tar;
    int prefixo = 860;
    float tarifa = 4.50f;

    @Override
    public void motorista() {
       mot = "\n********************************************"
            +"\nLINHA 860"
            +"\n_______________________________"
            +"\nFunção: Motorista"
            +"\nNúmero Registro: 71569"
            +"\nNome de Escala: A.Paes"
            +"\nNúmero CNH: 01365495100"
            +"\n------------------------------------------------------";
    }

    @Override
    public void cobrador() {
       cob = "\nFunção: Cobrador"
            +"\nNúmero Registro: 72698"
            +"\nNome de Escala: D.Cruz"
            +"\nTroco Inicial R$: 20,00"
            +"\n------------------------------------------------------";
    }

    @Override
    public void prefixo() {
        pref = "Prefixo do Carro: " + this.prefixo;
    }

    @Override
    public void concessao() {
        conc = "\nConcessão: Municipal/Stna Parnaíba "
              +"\n------------------------------------------------------";
    }

    @Override
    public void tarifa() {
        tar = "\nValor da Tarifa R$: " + this.tarifa
             +"\n********************************************";
    }

    @Override
    public void exibir() {
        JOptionPane.showMessageDialog(null, pref+mot+cob+conc+tar);    }

}//fim da classe
