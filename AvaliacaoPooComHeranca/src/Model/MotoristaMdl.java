
package Model;


/**
 * Classe criada para modelar um motorista herdando de funcionario. Classe Filha.
 * @author Adilson Luz
 * @since Classe Criada em 16/06/2021, 13:38:30
 */
public class MotoristaMdl extends FuncionarioMdl{    
    
    String cnh;
    
    //Construtor vazio
    public MotoristaMdl() {
    }
    
    //Metodo construtor MotoristaMdl herdado de funcionario
    public MotoristaMdl(String cnh, int numReg, String nome, String endereco,
                       int numEnd, String rg, String cpf, String celular, String funcao) {
                       super(numReg, nome, endereco, numEnd, rg, cpf, celular, funcao);
        this.cnh = cnh;
    }    

    //Getters & Setters
    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }    
    
}//fim da classe
