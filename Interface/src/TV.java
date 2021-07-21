/**
 * Classe criada para implementar os metodos abstratos da interface
 * eletrodomestico e demais funcionalidades de uma TV
 * @author Adilson Luz
 * @since Classe Criada em 27/05/2021, 10:17:21
 */
public class TV implements Eletrodomestico{

    @Override
    public void ligar() {
        System.out.println("A TV foi ligada.");
    }

    @Override//Sobrescrita do método da interface
    public void desligar() {
        System.out.println("A TV foi desligada.");
    }
    
    //sobrecarga do metodo desligar()
    public void desligar(int timer) throws InterruptedException{
        timer = timer * 1000;
        System.out.println("A TV será desligada em " + timer/1000 + " minutos");
        Thread.sleep(timer);
        desligar();
    }
        
}//fim da classe
