
import java.util.ArrayList;

/**
 * Classe criada para 
 * @author Adilson Luz
 * @since Classe Criada em 20/05/2021, 10:03:03
 */
public class TesteArrayList {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Ana", 19, 1.63f);
        Pessoa p2 = new Pessoa("Pedro", 23, 1.75f);
        Pessoa p3 = new Pessoa("Maria", 33, 1.81f);
        ArrayList<Pessoa> contatos = new ArrayList();
        
        contatos.add(p1);
        contatos.add(p2);
        contatos.add(p3);
        
        System.out.println("Conteudo do array: ");
        
        //For it... para cada
        for(Pessoa p: contatos){
            System.out.println("Nome " + p.getNome() + 
                    "\nidade " + p.getIdade());
        }         
    }

}//fim da classe
