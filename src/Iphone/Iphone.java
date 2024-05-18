
package Iphone;

import AparelhoTelefonico.AparelhoTelefonico;
import NavegadorInternet.NavegadorInternet;
import ReprodutorMusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    @Override
    public void tocar(){
        System.out.println("Tocando pelo iphone");
    }

    @Override
    public void ligar() {
        System.out.println("Iphone ligando");
    }

    @Override
    public void atender() {
        System.out.println("Iphone atendendo");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iphone iniciando correio de voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Iphone exibindo página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Iphone adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Iphone atualizando página");
    }

    @Override
    public void pausar() {
        System.out.println("Iphone pausando");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Iphone selecionando musica: " + musica);
    }
    
}
