
package ReprodutorMusical;

public class Mp3 implements ReprodutorMusical {
    @Override
    public void tocar(){
        System.out.println("Mp3 tocando");
    }
    
    @Override
    public void pausar(){
        System.out.println("Mp3 pausou");
    }
    
    @Override
    public void selecionarMusica(String musica){
        System.out.println("Mp3 selecionou a música: " + musica);
    }
}
