/**
 * Classe criada para implementar um liquidificador
 * @author Adilson Luz
 * @since Classe Criada em 27/05/2021, 11:58:28
 */
public class Liquidificador implements Eletrodomestico{

    @Override
    public void ligar() {
        System.out.println("O liquidificador está ligado...");
    }
    
    private void ligarAparelho(){
        ligar();
    }

    @Override
    public void desligar() {
        System.out.println("O liquidificador foi desligado...");
    }
    
    public void selecionarVelocidade(int vel){
        System.out.println("Velocidade ajustada para " + vel);
        ligarAparelho();
    }

}//fim da classe
