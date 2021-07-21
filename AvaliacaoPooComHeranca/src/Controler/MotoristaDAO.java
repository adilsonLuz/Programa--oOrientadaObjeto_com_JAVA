
package Controler;

import Model.MotoristaMdl;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Classe criada para controlar os motoristas Herdando da classe FuncionarioDAO
 * @author Adilson Luz
 * @since Classe Criada em 16/06/2021, 13:51:45
 */
public class MotoristaDAO extends FuncionarioDAO{
    
    ArrayList<MotoristaMdl> motMdl = new ArrayList();   //Criando ArrayList de Motorista 
    
    //Getters & Setters Do Array
    public ArrayList<MotoristaMdl> getMotMdl(){
        return motMdl;
    }    
    
    public void setMotMdl(ArrayList<MotoristaMdl> motMdl) {
        this.motMdl = motMdl;
    }  
    
    //Criando os Objetos Motorista
    MotoristaMdl mot261 = new MotoristaMdl("065 214 658 99", 71025, "F.Oliveira","Rua dos Ingás",44, "36.548.987-4", "325.369.547-45", "(11) 9 5849-5587", "Motorista");
    MotoristaMdl mot324 = new MotoristaMdl("065 265 448 74", 70369, "Sobrino", "Av Itaí",584, "24.587.598-4", "548.957.987-54", "(11) 9 8547-6587", "Motorista");
    MotoristaMdl mot462 = new MotoristaMdl("022 154 879 62", 76589, "S.Gomes","Rua Tulipas",587, "54.987.564-9", "214.658.974-52", "(11) 9 6589-8741", "Motorista");
    MotoristaMdl mot810 = new MotoristaMdl("032 548 796 21", 32015, "V.Wagner","Rua das Camelias",847, "22.658.974-9", "012.065.987-41", "(11) 9 5487-9657", "Motorista/Cobrador");
    MotoristaMdl mot860 = new MotoristaMdl("123 658 975 44", 29966, "B.Almeida","Estr. Tenente Marques",5641, "55.214.985-9", "002.987.541.-21", "(11) 9 8547-6321", "Motorista");
    MotoristaMdl mot900 = new MotoristaMdl("011 569 855 47", 26598, "Sales","Estr. João Félix",13, "66.548.974-9", "321.548.956-22", "(11) 9 6548-6321", "Motorista");
    MotoristaMdl mot930 = new MotoristaMdl("055 698 632 45", 72874, "Erislandio","Rua da Saudade",01, "99.654.874-6", "254.698.254-99", "(11) 9 6548-3214", "Motorista/Cobrador");
    
    //Metodo Sobreescrito de FuncionarioDAO para todos os dados de um motorista
    @Override
    public void exibirDados(){
        String exibir = "Função: " +mot261.getFuncao()
                        +"\nNúmero de Registro: " +mot261.getNumReg()
                        +"\nNome de Escala: " +mot261.getNome()
                        +"\nEndereço: " +mot261.getEndereco()
                        +" Nº " +mot261.getNumEnd()                        
                        +"\nRG: " +mot261.getRg()
                        +"\nCPF: " +mot261.getCpf()
                        +"\nCelular: " +mot261.getCelular()
                        +"\nCNH: " +mot261.getCnh();
        
        JOptionPane.showMessageDialog(null, exibir);
    }
    
    //Sobrecarga do metodo que exibe todos dados de um motorista
    public void exibirDados(int x, int y){
        String exibir = "Função: " +mot324.getFuncao()
                        +"\nNúmero de Registro: " +mot324.getNumReg()
                        +"\nNome de Escala: " +mot324.getNome()
                        +"\nEndereço: " +mot324.getEndereco()
                        +" Nº " +mot324.getNumEnd()                        
                        +"\nRG: " +mot324.getRg()
                        +"\nCPF: " +mot324.getCpf()
                        +"\nCelular: " +mot324.getCelular()
                        +"\nCNH: " +mot324.getCnh();
        
        JOptionPane.showMessageDialog(null, exibir);
    }
    
    //Sobrecarga do metodo que exibe todos dados de um motorista
    public void exibirDados(String x){
        String exibir = "Função: " +mot462.getFuncao()
                        +"\nNúmero de Registro: " +mot462.getNumReg()
                        +"\nNome de Escala: " +mot462.getNome()
                        +"\nEndereço: " +mot462.getEndereco()
                        +" Nº " +mot462.getNumEnd()                        
                        +"\nRG: " +mot462.getRg()
                        +"\nCPF: " +mot462.getCpf()
                        +"\nCelular: " +mot462.getCelular()
                        +"\nCNH: " +mot462.getCnh();
        
        JOptionPane.showMessageDialog(null, exibir);
    }
    
    //Sobrecarga do metodo que exibe todos dados de um motorista
    public void exibirDados(int x, String y){
        String exibir = "Função: " +mot810.getFuncao()
                        +"\nNúmero de Registro: " +mot810.getNumReg()
                        +"\nNome de Escala: " +mot810.getNome()
                        +"\nEndereço: " +mot810.getEndereco()
                        +" Nº " +mot810.getNumEnd()                        
                        +"\nRG: " +mot810.getRg()
                        +"\nCPF: " +mot810.getCpf()
                        +"\nCelular: " +mot810.getCelular()
                        +"\nCNH: " +mot810.getCnh();
        
        JOptionPane.showMessageDialog(null, exibir);
    }
    
    //Sobrecarga do metodo que exibe todos dados de um motorista
    public void exibirDados(String x, int y){
        String exibir = "Função: " +mot324.getFuncao()
                        +"\nNúmero de Registro: " +mot860.getNumReg()
                        +"\nNome de Escala: " +mot860.getNome()
                        +"\nEndereço: " +mot860.getEndereco()
                        +" Nº " +mot860.getNumEnd()                        
                        +"\nRG: " +mot860.getRg()
                        +"\nCPF: " +mot860.getCpf()
                        +"\nCelular: " +mot860.getCelular()
                        +"\nCNH: " +mot860.getCnh();
        
        JOptionPane.showMessageDialog(null, exibir);
    }
    
    //Sobrecarga do metodo que exibe todos dados de um motorista
    public void exibirDados(int x, int y, int w){
        String exibir = "Função: " +mot900.getFuncao()
                        +"\nNúmero de Registro: " +mot900.getNumReg()
                        +"\nNome de Escala: " +mot900.getNome()
                        +"\nEndereço: " +mot900.getEndereco()
                        +" Nº " +mot900.getNumEnd()                        
                        +"\nRG: " +mot900.getRg()
                        +"\nCPF: " +mot900.getCpf()
                        +"\nCelular: " +mot900.getCelular()
                        +"\nCNH: " +mot900.getCnh();
        
        JOptionPane.showMessageDialog(null, exibir);
    }
    
    public void exibirDados(boolean x){
        String exibir = "Função: " +mot930.getFuncao()
                        +"\nNúmero de Registro: " +mot930.getNumReg()
                        +"\nNome de Escala: " +mot930.getNome()
                        +"\nEndereço: " +mot930.getEndereco()
                        +" Nº " +mot930.getNumEnd()                        
                        +"\nRG: " +mot930.getRg()
                        +"\nCPF: " +mot930.getCpf()
                        +"\nCelular: " +mot930.getCelular()
                        +"\nCNH: " +mot930.getCnh();
        
        JOptionPane.showMessageDialog(null, exibir);
    }

}//fim da classe
