/**
 * Classe criada para instanciar objetos do tipo processo (Thread) e testar
 * a execução do paralelismo
 * @author Adilson Luz
 * @since Classe Criada em 13/05/2021, 11:54:17
 */
public class Concorrencia {
    public static void main(String[] args) {
        int i = 0;
        while(true){
        //Criando as Theads
        Processo p1, p2, p3, p4;
        p1 = new Processo("1 Fatec Santana de Parnaíba");
        p2 = new Processo("2 Frio");
        p3 = new Processo("3 Enquanto não estivermos todos vacinados cuidado!!!");
        p4 = new Processo("4 A CPI está pegando fogo lá em Brasilia.");
        
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        i++;
        
        }//fim do while
        
        
    }//Fim do main

}//fim da classe
