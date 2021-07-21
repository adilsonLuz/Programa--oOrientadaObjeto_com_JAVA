
import javax.swing.JOptionPane;

/**
 * Classe criada para 
 * @author Adilson Luz
 * @since Classe Criada em 23/05/2021, 13:47:33
 */
public class Linha930 implements Onibus{
    String mot,cob,pref,conc,tar;
    int prefixo = 881;
    float tarifa = 4.60f;

    @Override
    public void motorista() {
       mot = "\n********************************************"
            +"\nLINHA 930"
            +"\n_______________________________"
            +"\nFunção: Motorista"
            +"\nNúmero Registro: 71456"
            +"\nNome de Escala: V.Neto"
            +"\nNúmero CNH: 00658946212"
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
       conc = "\nConcessão: Municipal/Cajamar"
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
