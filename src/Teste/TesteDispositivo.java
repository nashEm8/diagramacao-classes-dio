
package Teste;

import AparelhoTelefonico.AparelhoTelefonico;
import AparelhoTelefonico.Samsung;
import Iphone.Iphone;
import NavegadorInternet.Google;
import NavegadorInternet.NavegadorInternet;
import ReprodutorMusical.ReprodutorMusical;

public class TesteDispositivo {
    public static void main(String[] args){
        Iphone iphone = new Iphone();
        iphone.selecionarMusica("Human Nature - Michael Jackson");
        
        Samsung samsung = new Samsung();
        samsung.iniciarCorreioVoz();
        
        Google google = new Google();
        google.atualizarPagina();
        
        NavegadorInternet navegador = iphone;
        AparelhoTelefonico celular = iphone;
        ReprodutorMusical mp3 = iphone;
        
    }
}
