
import javax.swing.JOptionPane;

/**
 * Classe criada para 
 * @author Adilson Luz
 * @since Classe Criada em 23/05/2021, 13:47:14
 */
public class Linha900 implements Onibus{
    String mot,cob,pref,conc,tar;
    int prefixo = 861;
    float tarifa = 4.60f;

    @Override
    public void motorista() {
       mot = "\n********************************************"
            +"\nLINHA 900"
            +"\n_______________________________"
            +"\nFunção: Motorista"
            +"\nNúmero Registro: 73254"
            +"\nNome de Escala: H.Silva"
            +"\nNúmero CNH: 03254879622"
            +"\n------------------------------------------------------";
    }

    @Override
    public void cobrador() {
       cob = "\nFunção: Cobrador"
            +"\nNúmero Registro: 72548"
            +"\nNome de Escala: M.Luiz"
            +"\nTroco Inicial R$: 15,00"
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
