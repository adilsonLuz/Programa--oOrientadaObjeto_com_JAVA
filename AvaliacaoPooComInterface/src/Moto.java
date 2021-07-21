
import javax.swing.JOptionPane;

/**
 * Classe criada para criar um funcionario motorista com herança de Funcionario (Classe filha)
 * @author Adilson Luz
 * @since Classe Criada em 19/05/2021, 23:00:24
 */
public class Moto extends Funcionario{
    
    String cnh;

    //Construtor de motorista
    public Moto(String cnh, int numReg, String nome, String endereco,
                     int numEnd, String rg, String cpf, String Celular, String funcao) {
        super(numReg, nome, endereco, numEnd, rg, cpf, Celular, funcao);
        this.cnh = cnh;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
    
        
    //Metodo sobreescrito da classe Funcionario para exibir um motorista
    @Override
    public void exibirDados(){
        String exibir = "Função: " +funcao
                        +"\nNúmero de Registro: " +numReg
                        +"\nNome de Escala: " +nome
                        +"\nEndereço: " +endereco
                        +" Nº " +numEnd                        
                        +"\nRG: " +rg
                        +"\nCPF: " +cpf
                        +"\nCNH: " +cnh
                        +"\nCelular: " + celular;
        JOptionPane.showMessageDialog(null, exibir);
    }
    
    

}//fim da classe
