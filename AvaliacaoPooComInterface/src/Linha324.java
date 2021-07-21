
import javax.swing.JOptionPane;

/**
 * Classe criada para implementar a interface ônibus
 * @author Adilson Luz
 * @since Classe Criada em 19/05/2021, 23:21:28
 */
public class Linha324 implements Onibus{
    String mot,cob,pref,conc,tar;
    int prefixo = 20497;
    float tarifa1 = 5.40f;
    float tarifa2 = 7.65f;
    float tarifa3 = 7.50f;
    float tarifa4 = 8.45f;
    float tarifa5 = 8.85f;    
    
    @Override
    public void motorista() {
       mot = "\n********************************************"
            +"\nLINHA 324"
            +"\n_______________________________"
            +"\nFunção: Motorista"
            +"\nNúmero Registro: 70356"
            +"\nNome de Escala: K.Érick"
            +"\nNúmero CNH: 01365495100"
            +"\n------------------------------------------------------";
    }

    @Override
    public void cobrador() {
       cob = "\nFunção: Cobrador"
            +"\nNúmero Registro: 72015"
            +"\nNome de Escala: Z.Filho"
            +"\nTroco Inicial R$: 25,00"
            +"\n------------------------------------------------------";
    }

    @Override
    public void prefixo() {
        pref = "\nPrefixo do Carro: " + this.prefixo;
    }

    @Override
    public void concessao() {
       conc = "\nConcessão: Intermunicipal/EMTU"
             +"\n------------------------------------------------------";
    }

    @Override
    public void tarifa() {
        tar = "\nValor da Tarifa R$: " + this.tarifa1
            + "\nIntegração 564 R$ " + this.tarifa2
            + "\nIntegração 418 R$ " + this.tarifa3
            + "\nIntegração 426 R$ " + this.tarifa4
            + "\nIntegração 852 R$ " + this.tarifa5
            + "\n********************************************";
    }

    @Override
    public void exibir() {
        JOptionPane.showMessageDialog(null, pref+mot+cob+conc+tar);
    }

}//fim da classe
