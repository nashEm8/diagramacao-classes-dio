
package NavegadorInternet;

public class Google implements NavegadorInternet {
    @Override
    public void exibirPagina(){
        System.out.println("Google exibindo página");
    }
    
    @Override
    public void adicionarNovaAba(){
        System.out.println("Google adicionando nova página");
    }
    
    @Override
    public void atualizarPagina(){
        System.out.println("Google atualizando página");
    }
}
