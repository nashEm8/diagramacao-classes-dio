
package AparelhoTelefonico;

public class Nokia implements AparelhoTelefonico {
    @Override
    public void ligar(){
        System.out.println("Nokia ligando");
    }
    
    @Override
    public void atender(){
        System.out.println("Nokia pausou");
    }
    
    @Override
    public void iniciarCorreioVoz(){
        System.out.println("Nokia iniciou correio de voz");
    }
}
