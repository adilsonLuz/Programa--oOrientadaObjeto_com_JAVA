
package View;

import Controler.FuncionarioDAO;
import Controler.OnibusDAO;
import Controler.CobradorDAO;
import Controler.MotoristaDAO;
import javax.swing.JOptionPane;

/**
 * Classe criada para manipular as informações das das linhas e funcionarios
 * @author Adilson Luz
 * @since Classe Criada em 16/06/2021, 15:07:36
 */
public class MenuInformacoes {
    FuncionarioDAO funcionariodao = new FuncionarioDAO();
    CobradorDAO cobradordao = new CobradorDAO();
    MotoristaDAO motoristadao = new MotoristaDAO();
    OnibusDAO onibus = new OnibusDAO();
    String informacaoDeLinhas;
    int opcao;
    
    //Metodo que implementa a adição de um objeto em um ArrayList e controla as viagens dos onibus atraves de um menu
    public MenuInformacoes() throws InterruptedException{  //usando clausula throws para usar uma thread
        informacaoDeLinhas = "Linhas em Operação:"
                           + "\n 1 - 324 Colinas da Anhanguera - Pq. imperial"
                           + "\n 2 - 462 Cidade São Pedro - Largo de Osasco"
                           + "\n 3 - 261 Varzea de Souza - Lapa"
                           + "\n 4 - 810 Jd. Isaura - Empresarial Tamboré"
                           + "\n 5 - 860 Cidade São Pedro - Colinas da Anhanguera"
                           + "\n 6 - 900 Conj. Maria Luiza - Jd. Muriano"
                           + "\n 7 - 930 Conj. Maria Luiza - Ponunduva"
                           + "\n 8 - Dados Auxiliar RH"
                           + "\n 9 - Dados Diretos"
                           + "\n10 - Dados Motorista linha 324"
                           + "\n11 - Dados Motorista linha 462"
                           + "\n12 - Dados Motorista linha 261"
                           + "\n13 - Dados Motorista linha 810"
                           + "\n14 - Dados Motorista linha 860"
                           + "\n15 - Dados Motorista linha 900"
                           + "\n16 - Dados Motorista linha 930"
                           + "\n18 - Dados Cobrador linha 324"
                           + "\n19 - Dados Cobrador linha 462"
                           + "\n20 - Dados Cobrador linha 261"
                           + "\n21 - Dados Cobrador linha 860"
                           + "\n22 - Dados Cobrador linha 900"                           
                           + "\n0 - SAIR";
        
            while(true){
                opcao = Integer.parseInt(JOptionPane.showInputDialog(informacaoDeLinhas));
                switch(opcao){
                    case 1: onibus.vincularMotCob();
                            onibus.fazerViagem(6000);
                        break;
                    case 2: onibus.vincularMotCob("462");
                            onibus.fazerViagem(22000);
                        break;
                    case 3: onibus.vincularMotCob(261);
                            onibus.fazerViagem(15000);
                        break;
                    case 4: onibus.vincularMotCob(true);
                            onibus.fazerViagem(16000);
                        break;
                    case 5: onibus.vincularMotCob(86, 0);
                            onibus.fazerViagem(8000);
                        break;
                    case 6: onibus.vincularMotCob(9, 0, 0);
                            onibus.fazerViagem(9000);
                        break;
                    case 7: onibus.vincularMotCob("930", "Ponunduva");
                            onibus.fazerViagem(4000);
                        break;
                    case 8: funcionariodao.exibirDados();
                        break;
                    case 9: funcionariodao.exibirDados(10);
                        break;
                    case 10: motoristadao.exibirDados(1, 2);
                        break;
                    case 11: motoristadao.exibirDados("462");
                        break;
                    case 12: motoristadao.exibirDados();
                        break;
                    case 13: motoristadao.exibirDados(810, "linha");
                        break;
                    case 14: motoristadao.exibirDados("linha", 860);
                        break;
                    case 15: motoristadao.exibirDados(9, 0, 0);
                        break;
                    case 16: motoristadao.exibirDados(true);
                        break;
                    case 17: onibus.vincularMotCob("930", "Ponunduva");
                            onibus.fazerViagem(4000);
                        break;
                    case 18: cobradordao.exibirDados(32, 4);
                        break;
                    case 19: cobradordao.exibirDados("462");
                        break;
                    case 20: cobradordao.exibirDados();
                        break;
                    case 21: cobradordao.exibirDados(86, "0");
                        break;
                    case 22: cobradordao.exibirDados("linha", 900);
                        break;
                    
                    case 0: System.exit(0);
                        break;
                    default: JOptionPane.showMessageDialog(null, "Opção Invalida");
                        opcao = 0;
                }//Fim do SWITCH
                if(opcao != 0){                    
                }//Fim do IF
            }//Fim do laço            
    }//Fim do metodo

}//fim da classe
