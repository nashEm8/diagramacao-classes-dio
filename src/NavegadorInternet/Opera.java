
package NavegadorInternet;

public class Opera implements NavegadorInternet {
    @Override
    public void exibirPagina(){
        System.out.println("Opera exibindo página");
    }
    
    @Override
    public void adicionarNovaAba(){
        System.out.println("Opera adicionando nova aba");
    }
    
    @Override
    public void atualizarPagina(){
        System.out.println("Opera atualizando página");
    }
}
