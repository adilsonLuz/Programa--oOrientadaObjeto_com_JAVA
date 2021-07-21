/**
 *Interface criada para implementar um ônibus usando Abstração
 * @author Adilson
 * @since Interface criada em 19 de maio de 2021
 */
public interface Onibus {
    
    //Todo ônibus tem MNotorista
    public void motorista();
    
    //Alguns ônibus tem cobrador
    public void cobrador();
    
    //Todo ônibus tem validador
    public void prefixo();
    
    //Todo ônibus tem um municipio em que opera
    public void concessao();
    
    //Todo ônibus tem catraca
    public void tarifa();
    
    //Todo onibus exibe as informações
    public void exibir();
    
}//Fim da Interface
