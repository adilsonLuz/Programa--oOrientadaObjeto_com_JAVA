
/**
 * Classe criada para vincular motorista, cobrador, definir linha e tarifa que
 * onibus irá operar.
 * @author Adilson Luz
 * @since Classe Criada em 23/05/2021, 13:51:11
 */
public class Validador {
    public void soltarFrota(Onibus onibus){
        onibus.motorista();
        onibus.cobrador();
        onibus.prefixo();
        onibus.concessao();        
        onibus.tarifa();
        onibus.exibir();        
    }//Fim do Metodo
}//fim da classe
