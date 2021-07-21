/**
 * Classe criada para sobrescrever os metodos abstratos da interface Eletrodometico
 * @author Adilson Luz
 * @since Classe Criada em 27/05/2021, 10:43:43
 */
public class Microondas implements Eletrodomestico{

    @Override //Sobreescrita
    public void ligar() {
        System.out.println("\nO microondas foi ligado");
    }    
    
    @Override
    public void desligar() {
        System.out.println("\nO microondas foi desligado");
        
    }
    
    public void fazerPipoca() throws InterruptedException{
        System.out.println("Preparando pipoca");
        ligar();
        System.out.println("O microodas esta preparando pipoca");        
        timer(60000*1000);
        desligar();        
    }
    
    public void programarTempo(int tempo) throws InterruptedException {
        tempo = tempo * 1000;
        System.out.println("O microondas foi programado em " + tempo + " segundos");
        ligar();        
        timer(tempo);
        desligar();        
    }
    
    public void mais30Segundos(int vezes) throws InterruptedException{
        int tempo = vezes * 30000;
        System.out.println("Tecla 30 segundos apertada " + vezes + " vezes");
        ligar();        
        timer(tempo);
        desligar();
    }
    
    public void timer(int tempo) throws InterruptedException{
        while(tempo >0){
            System.out.println(tempo/1000);
            Thread.sleep(1000);
            tempo = tempo - 1000;
        }//fim do while
        
    }//fim do metodo timer
    
    
}//fim da classe
