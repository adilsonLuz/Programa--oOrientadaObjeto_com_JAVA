
package Model;

/**
 * Classe criada para modelar um funcionario. Classe Pai
 * @author Adilson Luz
 * @since Classe Criada em 16/06/2021, 13:37:07
 */
public class FuncionarioMdl {
    int numReg;
    String nome;
    String endereco;
    int numEnd;
    String rg;
    String cpf;
    String celular;
    String funcao;
    
    //Construtor vazio
    public FuncionarioMdl() {
    }

    //Metodo construtor de Funcionario
    public FuncionarioMdl(int numReg, String nome, String endereco, int numEnd, 
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

    //Getters & Setters de Funcionario
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

}//fim da classe
