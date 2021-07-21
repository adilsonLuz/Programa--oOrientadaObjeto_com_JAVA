
import javax.swing.JOptionPane;

/**
 * Classe criada para 
 * @author Adilson Luz
 * @since Classe Criada em 23/05/2021, 11:50:16
 */
public class MenuInformacao {    
    Onibus onibus;
    String informacaoDeLinhas;
    int opcao;
    Validador validador = new Validador();
    
    public MenuInformacao(){
        informacaoDeLinhas = "Linhas em Operação:"
                           + "\n1 - 324 Colinas da Anhanguera - Pq. imperial"
                           + "\n2 - 462 Cidade São Pedro - Largo de Osasco"
                           + "\n3 - 261 Varzea de Souza - Lapa"
                           + "\n4 - 810 Jd. Isaura - Empresarial Tamboré"
                           + "\n5 - 860 Cidade São Pedro - Colinas da Anhanguera"
                           + "\n6 - 900 Conj. Maria Luiza - Jd. Muriano"
                           + "\n7 - 930 Conj. Maria Luiza - Ponunduva"
                           + "\n0 - SAIR";
        try{
            while(true){
                opcao = Integer.parseInt(JOptionPane.showInputDialog(informacaoDeLinhas));
                switch(opcao){
                    case 1: onibus = new Linha324();
                        break;
                    case 2: onibus = new Linha462();
                        break;
                    case 3: onibus = new Linha261();
                        break;
                    case 4: onibus = new Linha810();
                        break;
                    case 5: onibus = new Linha860();
                        break;
                    case 6: onibus = new Linha900();
                        break;
                    case 7: onibus = new Linha930();
                        break;
                    case 0: System.exit(0);
                        break;
                    default: JOptionPane.showMessageDialog(null, "Opção Invalida");
                        opcao = 0;
                }//Fim do SWITCH
                if(opcao != 0){
                    validador.soltarFrota(onibus);
                }//Fim do IF
            }//Fim do laço
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Ocorreu erro: " + e.getMessage());
            }
    }//Fim do metodo    
}//fim da classe
