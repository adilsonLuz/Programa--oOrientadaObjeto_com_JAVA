
import javax.swing.JOptionPane;

/**
 * Classe criada para 
 * @author Adilson Luz
 * @since Classe Criada em 23/05/2021, 13:46:17
 */
public class Linha810 implements Onibus{
    String mot,cob,pref,conc,tar;
    int prefixo = 807;
    float tarifa = 4.50f;

    @Override
    public void motorista() {
       mot = "\n********************************************"
            +"\nLINHA 810"
            +"\n_______________________________"
            +"\nFunção: Motorista"
            +"\nNúmero Registro: 72312"
            +"\nNome de Escala: S.Souza"  
            +"\nNúmero CNH: 02365498720"
            +"\nTroco Inicial R$ 15,00"
            +"\n------------------------------------------------------";
    }

    @Override
    public void cobrador() {
       cob = "\nLinha catraquinha, sem cobrador"
            +"\n------------------------------------------------------";
    }

    @Override
    public void prefixo() {
        pref = "Prefixo do Carro: " + this.prefixo;
    }

    @Override
    public void concessao() {
       conc = "\nConcessão: Municipal/Stna Parnaíba"
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
