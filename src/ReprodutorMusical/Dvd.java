
package ReprodutorMusical;

public class Dvd implements ReprodutorMusical {
    @Override
    public void tocar(){
        System.out.println("Dvd tocando");
    }
    
    @Override
    public void pausar(){
        System.out.println("Dvd pausou");
    }
    
    @Override
    public void selecionarMusica(String musica){
        System.out.println("Dvd selecionou a música: " + musica);
    }
}
