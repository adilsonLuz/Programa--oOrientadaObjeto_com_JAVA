

package Model;

/**
 * Classe criada para modelar um cobrador herdando de funcionario. Classe Filha.
 * @author Adilson Luz
 * @since Classe Criada em 16/06/2021, 13:39:30
 */
public class CobradorMdl extends FuncionarioMdl{
    
    
    float trocoInicial;
    
    //Construtor Vazio
    public CobradorMdl() {
    }
    
    //Metodo construtor Herdando de FuncionarioMdl
    public CobradorMdl(float trocoInicial, int numReg, String nome, String endereco,
                       int numEnd, String rg, String cpf, String celular, String funcao) {
                       super(numReg, nome, endereco, numEnd, rg, cpf, celular, funcao);
        this.trocoInicial = trocoInicial;
    }
    
    //Getters & Setters de Cobrador
    public float getTrocoInicial() {
        return trocoInicial;
    }

    public void setTrocoInicial(float trocoInicial) {
        this.trocoInicial = trocoInicial;
    }    
    
}//fim da classe
