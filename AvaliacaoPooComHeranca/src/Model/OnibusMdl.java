
package Model;

/**
 * Classe criada para modelar/criar o objeto onibus
 * @author Adilson Luz
 * @since Classe Criada em 19/06/2021, 22:03:18
 */
public class OnibusMdl {
    
    int prefixo;
    String concessao;
    float tarifa1;
    float tarifa2;
    float integracao1;
    float integracao2;
    float integracao3;
    int linha;

    //Construtor vazio
    public OnibusMdl() {
    }

    //Metodo construtor de onibus
    public OnibusMdl(int prefixo, String concessao, float tarifa1, float tarifa2,
                     float integracao1, float integracao2, float integracao3, int linha) {
        this.prefixo = prefixo;
        this.concessao = concessao;
        this.tarifa1 = tarifa1;
        this.tarifa2 = tarifa2;
        this.integracao1 = integracao1;
        this.integracao2 = integracao2;
        this.integracao3 = integracao3;
        this.linha = linha;
    }

    //Getters & Setters de onibus
    public int getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(int prefixo) {
        this.prefixo = prefixo;
    }

    public String getConcessao() {
        return concessao;
    }

    public void setConcessao(String concessao) {
        this.concessao = concessao;
    }

    public float getTarifa1() {
        return tarifa1;
    }

    public void setTarifa1(float tarifa1) {
        this.tarifa1 = tarifa1;
    }

    public float getTarifa2() {
        return tarifa2;
    }

    public void setTarifa2(float tarifa2) {
        this.tarifa2 = tarifa2;
    }

    public float getIntegracao1() {
        return integracao1;
    }

    public void setIntegracao1(float integracao1) {
        this.integracao1 = integracao1;
    }

    public float getIntegracao2() {
        return integracao2;
    }

    public void setIntegracao2(float integracao2) {
        this.integracao2 = integracao2;
    }

    public float getIntegracao3() {
        return integracao3;
    }

    public void setIntegracao3(float integracao3) {
        this.integracao3 = integracao3;
    }
    
    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }
    
    

}//fim da classe
