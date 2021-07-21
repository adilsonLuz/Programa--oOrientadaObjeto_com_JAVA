
package Controler;

import Model.CobradorMdl;
import Model.MotoristaMdl;
import Model.OnibusMdl;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Classe criada para vincular um motorista e um cobrador em um ônibus e controlar as viagens realizadas
 * @author Adilson Luz
 * @since Classe Criada em 16/06/2021, 14:27:22
 */
public class OnibusDAO {
    
    //Variaveis globais de controle
    String on, mo, co;
    
    //
    MotoristaDAO mot = new MotoristaDAO();
    CobradorDAO cob = new CobradorDAO();  
    
    ArrayList<OnibusMdl> busMdl = new ArrayList();  //Criando ArrayList de Onibus  

    //Getters & Setters do Array Onibus
    public ArrayList<OnibusMdl> getBusMdl() {
        return busMdl;
    }

    public void setBusMdl(ArrayList<OnibusMdl> busMdl) {
        this.busMdl = busMdl;
    }    
    
    //Contruindo os objetos onibus
    OnibusMdl bus261 = new OnibusMdl(20477 , " Intermunicipal EMTU ",7.75f ,0f ,0f ,0f ,0f,261);
    OnibusMdl bus324 = new OnibusMdl(20957 , " Intermunicipal EMTU ",5.40f ,0f,7.50f,7.65f,8.45f,324);
    OnibusMdl bus462 = new OnibusMdl(20462 , " Intermunicipal EMTU ",7.40f ,5.40f,8.50f,0f,0f,462);
    OnibusMdl bus810 = new OnibusMdl(826 , " Municipal Santana de Parnaíba ",4.50f ,0f,0f,0f,0f,810);
    OnibusMdl bus860 = new OnibusMdl(859 , " Municipal Santana de Parnaíba ",4.50f ,0f,0f,0f,0f,860);
    OnibusMdl bus900 = new OnibusMdl(862 , " Municipal Cajamar ",4.60f ,0f,0f,0f,0f,900);
    OnibusMdl bus930 = new OnibusMdl(882 , " Municipal Cajamar ",4.60f ,0f,0f,0f,0f,930);
    
    //Metodo que adiciona um Onibus, um Motorista e um cobrador a um ArrayList     
    public void vincularMotCob(){        
        busMdl.add(bus324);        
        mot.motMdl.add(mot.mot324);        
        cob.cobMdl.add(cob.cob324);        
    }
    
    //Sobrecarga do metodo que adiciona um Onibus, um Motorista e um cobrador a um ArrayList
    public void vincularMotCob(int x){        
        busMdl.add(bus261);        
        mot.motMdl.add(mot.mot261);        
        cob.cobMdl.add(cob.cob261);        
    }
    
    //Sobrecarga do metodo que adiciona um Onibus, um Motorista e um cobrador a um ArrayList
    public void vincularMotCob(String x){        
        busMdl.add(bus462);        
        mot.motMdl.add(mot.mot462);        
        cob.cobMdl.add(cob.cob462);        
    }
    
    //Sobrecarga do metodo que adiciona um Onibus, um Motorista e um cobrador a um ArrayList
    public void vincularMotCob(int x, int y){        
        busMdl.add(bus860);        
        mot.motMdl.add(mot.mot860);        
        cob.cobMdl.add(cob.cob860);        
    }
    
    //Sobrecarga do metodo que adiciona um Onibus, um Motorista e um cobrador a um ArrayList
    public void vincularMotCob(int x, int y, int w){        
        busMdl.add(bus900);        
        mot.motMdl.add(mot.mot900);        
        cob.cobMdl.add(cob.cob900);        
    }
    
    //Sobrecarga do metodo que adiciona um Onibus, um Motorista e um cobrador a um ArrayList
    public void vincularMotCob(String x, String y){        
        busMdl.add(bus930);        
        mot.motMdl.add(mot.mot930);        
        cob.cobMdl.add(cob.cob930);        
    }
    
    //Sobrecarga do metodo que adiciona um Onibus, um Motorista e um cobrador a um ArrayList
    public void vincularMotCob(boolean x){        
        busMdl.add(bus810);        
        mot.motMdl.add(mot.mot810);        
        cob.cobMdl.add(cob.cob810);        
    }
    
    //Metodo que usa Agregação de um objeto Onibus, Motorista, Cobrador para realizar uma viagem
    public void fazerViagem(int tempo) throws InterruptedException{       
        
        for(OnibusMdl o : busMdl){
                          on = "********************************************"
                              +"\nLinha: " + o.getLinha()
                              +"\n_______________________________"
                              +"\nPrefixo: " + o.getPrefixo()
                              +"\nConcessão: " + o.getConcessao()
                              +"\nTarifa Direta R$ " + o.getTarifa1()
                              +"\nTarifa Meia R$ " + o.getTarifa2()
                              +"\nIntegração 1 R$ " + o.getIntegracao1()
                              +"\nIntegração 2 R$ " + o.getIntegracao2()
                              +"\nIntegração 3 R$ " + o.getIntegracao3()
                              +"\n------------------------------------------------------";
        }
        for(MotoristaMdl m : mot.motMdl){
                          mo = "\nFunção: " + m.getFuncao()
                              +"\nNumero Registro: " + m.getNumReg()
                              +"\nNome: " + m.getNome()
                              +"\nCNH: " + m.getCnh()
                              +"\n------------------------------------------------------";
        }
        for(CobradorMdl c : cob.cobMdl){
                          co = "\nFunção: " + c.getFuncao()
                             + "\nNumero Registro: " + c.getNumReg()
                             + "\nNome: " + c.getNome()
                             + "\nTroco Inicial" + c.getTrocoInicial()
                             + "\n********************************************";
        }
        JOptionPane.showMessageDialog(null, on+mo+co+"\nA viagem dura " + tempo/1000 + " minutos."
                                                    +"\nClique em OK para iniciar a viagem.");        
        timer(tempo);
    }
    
    //Metodo que implementa o tempo das viagens a partir de uma Thread
    public void timer(int tempo) throws InterruptedException{
        while(tempo >0){
            System.out.println(tempo/1000);
            Thread.sleep(1000);
            tempo = tempo - 1000;            
        }//fim do while
        JOptionPane.showMessageDialog(null,"Você chegou ao seu destino!!!");
    }//fim do metodo timer
    
}//fim da classe
