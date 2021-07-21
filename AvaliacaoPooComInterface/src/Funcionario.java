
import javax.swing.JOptionPane;

/**
 * Classe criada para descrever um funcionario (Classe pai)
 * @author Adilson Luz
 * @since Classe Criada em 19/05/2021, 22:38:46
 */
public class Funcionario {
    int numReg;
    String nome;
    String endereco;
    int numEnd;
    String rg;
    String cpf;
    String celular;
    String funcao;

    public Funcionario(int numReg, String nome, String endereco, int numEnd,
                       String rg, String cpf, String celular, String funcao) {
        this.numReg = numReg;
        this.nome = nome;
        this.endereco = endereco;
        this.numEnd = numEnd;
        this.rg = rg;
        this.cpf = cpf;
        this.celular = celular;
        this.funcao = funcao;
    }

    public int getNumReg() {
        return numReg;
    }

    public void setNumReg(int numReg) {
        this.numReg = numReg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumEnd() {
        return numEnd;
    }

    public void setNumEnd(int numEnd) {
        this.numEnd = numEnd;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    

    //Método para exibir um funcionario
    public void exibirDados(){
        String exibir = "Função: " +funcao
                        +"\nNúmero de Registro: " +numReg
                        +"\nNome de Escala: " +nome
                        +"\nEndereço: " +endereco
                        +" Nº " +numEnd                        
                        +"\nRG: " +rg
                        +"\nCPF: " +cpf
                        +"\nCelular: " + celular;
        JOptionPane.showMessageDialog(null, exibir);
    }
    
   
}//fim da classe
