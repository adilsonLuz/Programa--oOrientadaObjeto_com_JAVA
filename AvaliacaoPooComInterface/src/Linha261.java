
import javax.swing.JOptionPane;

/**
 * Classe criada para 
 * @author Adilson Luz
 * @since Classe Criada em 23/05/2021, 13:45:50
 */
public class Linha261 implements Onibus{
    
    int prefixo = 20497;
    String mot,cob,pref,conc,tar;

    @Override
    public void motorista() {
        mot = "\n********************************************"
             +"\nLINHA 261"
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
        tar = "\nValor da Tarifa R$: 5,40"
            + "\nIntegração 564 R$ 7,65"
            + "\nIntegração 418 R$ 7,50"
            + "\nIntegração 426 R$ 8,45"
            + "\nIntegração 852 R$ 8,85"
            + "\n********************************************";
    }
    @Override
    public void exibir(){
        JOptionPane.showMessageDialog(null, pref+mot+cob+conc+tar);
        
    }
            

}//fim da classe
