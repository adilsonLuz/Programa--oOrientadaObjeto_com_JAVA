
import javax.swing.JOptionPane;

/**
 * Classe criada para 
 * @author Adilson Luz
 * @since Classe Criada em 23/05/2021, 13:43:41
 */
public class Linha462 implements Onibus{
    String mot,cob,pref,conc,tar;
    int prefixo = 20467;
    float tarifa1 = 7.40f;
    float tarifa2 = 5.40f;
    float tarifa3 = 8.50f;

    @Override
    public void motorista() {
       mot = "\n********************************************"
            +"\nLINHA 462"
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
        pref = "Prefixo do Carro: " + this.prefixo;
    }

    @Override
    public void concessao() {
       conc = "\nConcessão: Intermunicipal/EMTU"
             +"\n------------------------------------------------------";
    }

    @Override
    public void tarifa() {
        tar = "\nValor da Tarifa"
            + "\nDireta R$: " + this.tarifa1
            + "\nTamboré R$ " + this.tarifa2
            + "\nIntegração CPTM R$ " + this.tarifa3
            + "\n********************************************";
    }

    @Override
    public void exibir() {
        JOptionPane.showMessageDialog(null, pref+mot+cob+conc+tar);    }

}//fim da classe
