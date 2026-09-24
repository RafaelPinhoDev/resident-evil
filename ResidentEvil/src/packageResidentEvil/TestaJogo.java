
package packageResidentEvil;


public class TestaJogo {

    public static void main(String[] args) {
        
        Jogo j1 = new Jogo();
        j1.setTitulo("Resident Evil 4");
        j1.setAnoLancamento(2005);
        
        
        System.out.println("     DADOS DO JOGO      ");
        System.out.println("------------------------");
        System.out.println("Titulo: " + j1.getTitulo());
        System.out.println("Ano de Lancamento: " + j1.getAnoLancamento());
        
        Jogo j2 = new Jogo("Resident Evil 2", 1998);
        
       
    }
    
}
