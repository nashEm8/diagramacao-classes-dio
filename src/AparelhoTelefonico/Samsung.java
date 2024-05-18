
package AparelhoTelefonico;

public class Samsung implements AparelhoTelefonico {
    @Override
    public void ligar(){
        System.out.println("Samsung ligando");
    }
    
    @Override
    public void atender(){
        System.out.println("Samsung pausando");
    }
    
    @Override
    public void iniciarCorreioVoz(){
        System.out.println("Samsung iniciou correio de voz");
    }
    
}
