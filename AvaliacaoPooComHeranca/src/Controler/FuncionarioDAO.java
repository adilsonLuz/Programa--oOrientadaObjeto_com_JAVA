
package Controler;

import javax.swing.JOptionPane;
import Model.FuncionarioMdl;
/**
 * Classe criada para 
 * @author Adilson Luz
 * @since Classe Criada em 16/06/2021, 13:53:00
 */
public class FuncionarioDAO {
        
    
    FuncionarioMdl funcRh = new FuncionarioMdl(28365,"Samantha Vespucio","Av Consolção", 658, "28.658.995-6",""
                                             + "155.954.852-47","(11) 9 6589-4123", "Auxiliar Recursos Humanos");
    FuncionarioMdl funcDp = new FuncionarioMdl(10236,"Manoel Saraiva","Av Mamoré", 1030, "10.658.002-x",""
                                             + "012.854.632-54","(11) 9 8541-6654", "Diretor");
    
    //Método para exibir um funcionario
    public void exibirDados(){
        String exibir = "Função: " +funcRh.getFuncao()
                        +"\nNúmero de Registro: " +funcRh.getNumReg()
                        +"\nNome de Escala: " +funcRh.getNome()
                        +"\nEndereço: " +funcRh.getEndereco()
                        +" Nº " +funcRh.getNumEnd()                        
                        +"\nRG: " +funcRh.getRg()
                        +"\nCPF: " +funcRh.getCpf()
                        +"\nCelular: " +funcRh.getCelular();
        JOptionPane.showMessageDialog(null, exibir);
    }
    
    //Sobrecarga do método para exibir um funcionario
    public void exibirDados(int x){
        String exibir = "Função: " +funcDp.getFuncao()
                        +"\nNúmero de Registro: " +funcDp.getNumReg()
                        +"\nNome de Escala: " +funcDp.getNome()
                        +"\nEndereço: " +funcDp.getEndereco()
                        +" Nº " +funcDp.getNumEnd()                        
                        +"\nRG: " +funcDp.getRg()
                        +"\nCPF: " +funcDp.getCpf()
                        +"\nCelular: " +funcDp.getCelular();
        JOptionPane.showMessageDialog(null, exibir);
    }

}//fim da classe
