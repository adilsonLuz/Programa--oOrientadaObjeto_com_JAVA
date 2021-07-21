

package Controler;

import Model.CobradorMdl;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Classe criada para controlar os cobradores Herdando da classe FuncionarioDAO
 * @author Adilson Luz
 * @since Classe Criada em 16/06/2021, 13:53:19
 */
public class CobradorDAO extends FuncionarioDAO{
    
    ArrayList<CobradorMdl> cobMdl = new ArrayList(); //Criando ArrayList de cobrador
    
    //Getters & Setters do Array
    public ArrayList<CobradorMdl> getCobMdl(){
        return cobMdl;
    }    
    
    public void setCobMdl(ArrayList<CobradorMdl> cobMdl) {
        this.cobMdl = cobMdl;
    }
    
    //Criando os Objetos Cobrador
    CobradorMdl cob261 = new CobradorMdl(25.00f, 72015, "Z.Filho","Rua Azaleia",120, "55.698.987-2", "658.987.451-65", "(11) 9 5847-625", "Cobrador");
    CobradorMdl cob324 = new CobradorMdl(25.00f, 73654, "F.Magalhães","Rua Miguelita", 540, "65.987.245-6", "254.987.632-65", "(11) 9 2146-6325", "Cobrador");
    CobradorMdl cob462 = new CobradorMdl(25.00f, 70365, "W.Primo","Rua Santo Antonio", 890, "69.874.965-1", "548.962.547-25", "(11) 9 9654-8874", "Cobrador");
    CobradorMdl cob810 = new CobradorMdl(20.00f, 0, "Sem Cobrador","",0,"","","","");
    CobradorMdl cob860 = new CobradorMdl(15.00f, 72015, "H.Oliveira","Rua Paraguasú", 3250, "21.548.698-4", "145.985.245-63", "(11) 9 9985-6632", "Cobrador");
    CobradorMdl cob900 = new CobradorMdl(20.00f, 72015, "G.Santos","Rua Maria de Lourdes", 870, "65.987.412-5", "004.521.958-88", "(11) 9 8521-8521", "Cobrador");
    CobradorMdl cob930 = new CobradorMdl(20.00f, 0, "Sem Cobrador","",0,"","","","");
        
    //Metodo Sobreescrito de FuncionarioDAO para todos os dados de um cobrador
    @Override
    public void exibirDados(){
        String exibir = "Função: " +cob261.getFuncao()
                        +"\nNúmero de Registro: " +cob261.getNumReg()
                        +"\nNome de Escala: " +cob261.getNome()
                        +"\nEndereço: " +cob261.getEndereco()
                        +" Nº " +cob261.getNumEnd()                        
                        +"\nRG: " +cob261.getRg()
                        +"\nCPF: " +cob261.getCpf()
                        +"\nCelular: " +cob261.getCelular()
                        +"\nTroco Inicial: " +cob261.getTrocoInicial();
        
        JOptionPane.showMessageDialog(null, exibir);
    }
    
    //Sobrecarga do metodo que exibe todos dados de um cobrador
    public void exibirDados(int x, int y){
        String exibir = "Função: " +cob324.getFuncao()
                        +"\nNúmero de Registro: " +cob324.getNumReg()
                        +"\nNome de Escala: " +cob324.getNome()
                        +"\nEndereço: " +cob324.getEndereco()
                        +" Nº " +cob324.getNumEnd()                        
                        +"\nRG: " +cob324.getRg()
                        +"\nCPF: " +cob324.getCpf()
                        +"\nCelular: " +cob324.getCelular()
                        +"\nTroco Inicial: " +cob324.getTrocoInicial();
        
        JOptionPane.showMessageDialog(null, exibir);
    }
    
    //Sobrecarga do metodo que exibe todos dados de um cobrador
    public void exibirDados(String x){
        String exibir = "Função: " +cob462.getFuncao()
                        +"\nNúmero de Registro: " +cob462.getNumReg()
                        +"\nNome de Escala: " +cob462.getNome()
                        +"\nEndereço: " +cob462.getEndereco()
                        +" Nº " +cob462.getNumEnd()                        
                        +"\nRG: " +cob462.getRg()
                        +"\nCPF: " +cob462.getCpf()
                        +"\nCelular: " +cob462.getCelular()
                        +"\nTroco Inicial: " +cob462.getTrocoInicial();
        
        JOptionPane.showMessageDialog(null, exibir);
    }
    
    //Sobrecarga do metodo que exibe todos dados de um cobrador
    public void exibirDados(int x, String y){
        String exibir = "Função: " +cob860.getFuncao()
                        +"\nNúmero de Registro: " +cob860.getNumReg()
                        +"\nNome de Escala: " +cob860.getNome()
                        +"\nEndereço: " +cob860.getEndereco()
                        +" Nº " +cob860.getNumEnd()                        
                        +"\nRG: " +cob860.getRg()
                        +"\nCPF: " +cob860.getCpf()
                        +"\nCelular: " +cob860.getCelular()
                        +"\nTroco Inicial: " +cob860.getTrocoInicial();
        
        JOptionPane.showMessageDialog(null, exibir);
    }
    
    //Sobrecarga do metodo que exibe todos dados de um cobrador
    public void exibirDados(String x, int y){
        String exibir = "Função: " +cob900.getFuncao()
                        +"\nNúmero de Registro: " +cob900.getNumReg()
                        +"\nNome de Escala: " +cob900.getNome()
                        +"\nEndereço: " +cob900.getEndereco()
                        +" Nº " +cob900.getNumEnd()                        
                        +"\nRG: " +cob900.getRg()
                        +"\nCPF: " +cob900.getCpf()
                        +"\nCelular: " +cob900.getCelular()
                        +"\nTroco Inicial: " +cob900.getTrocoInicial();
        
        JOptionPane.showMessageDialog(null, exibir);
    }
    
}//fim da classe
