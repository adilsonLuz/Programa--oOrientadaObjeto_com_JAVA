/**
 * Classe criada para demonstrar a utilização de THREADS no comportamento de
 * paralelismo de processos
 * @author Adilson Luz
 * @since Classe Criada em 13/05/2021, 11:36:05
 */
public class Processo extends Thread{
    int sleepTime; //Atributo para armazenar tempo de dormencia da Thread
    String nome;
    
    public Processo(String nome){        
        this.nome = nome;
        sleepTime = (int)Math.random() * 155000;        
        System.out.println("A Thread " + nome + " irá dormir por " + sleepTime + " ms.");        
    }//fim do consrutor
    
    public void run(){       
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException ex) {
            System.out.println("A Thread " + nome + " foi interrompida!!!");
        }        
        System.err.println("A Thead " + nome + "=========> ACORDOU!!!");
    }//Fim do RUM
}//fim da classe
