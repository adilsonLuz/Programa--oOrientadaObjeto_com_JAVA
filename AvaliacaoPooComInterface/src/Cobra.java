
import javax.swing.JOptionPane;

/**
 * Classe criada para criar um cobrador com herença de funcionario (Classe filha)
 * @author Adilson Luz
 * @since Classe Criada em 19/05/2021, 23:08:04
 */
public class Cobra extends Funcionario{
    
    float trocoInicial;

    public Cobra(float trocoInicial, int numReg, String nome, String endereco, int numEnd, String rg, String cpf, String celular, String funcao) {
        super(numReg, nome, endereco, numEnd, rg, cpf, celular, funcao);
        this.trocoInicial = trocoInicial;
    }

    public float getTrocoInicial() {
        return trocoInicial;
    }

    public void setTrocoInicial(float trocoInicial) {
        this.trocoInicial = trocoInicial;
    }

    

     //Metodo sobreescrito da classe Funcionario para exibir um cobrador
    @Override
   public void exibirDados(){
        String exibir = "Função: " +funcao
                        +"\nNúmero de Registro: " +numReg
                        +"\nNome de Escala: " +nome
                        +"\nTroco Inicial: R$ " +trocoInicial
                        +"\nEndereço: " +endereco
                        +" Nº " +numEnd                        
                        +"\nRG: " +rg
                        +"\nCPF: " +cpf
                        +"\nCelular: " + celular;
        JOptionPane.showMessageDialog(null, exibir);
    }
    
}//fim da classe
