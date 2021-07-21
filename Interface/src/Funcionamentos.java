/**
 * Classe criada para gerenciar os objetos criados com o contrato a partir
 * da interface TV
 * @author Adilson Luz
 * @since Classe Criada em 27/05/2021, 10:29:16
 */
public class Funcionamentos {
    public static void main(String[] args) throws InterruptedException {
        TV sony = new TV();
        //sony.ligar();
        //sony.desligar(15);
        
        Microondas m = new Microondas();
        
        //m.programarTempo(10);
        //m.mais30Segundos(1);
        //m.fazerPipoca();
        
        Liquidificador l = new Liquidificador();
        //l.selecionarVelocidade(2);
        
        //objeto polimorfico Alexia
        Alexia alexia = new Alexia();
        alexia.ligarAparelho(l);
        alexia.desligarAparelho(m);
        
    }//fim do main

}//fim da classe
