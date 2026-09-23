
package packageResidentEvil;


public class TestaJogo {

    public static void main(String[] args) {
        
        Jogo j1 = new Jogo();
        j1.setTitulo("Resident Evil 4");
        j1.setAnoLancamento(2005);
        
        
        Jogo j2 = new Jogo();
        j2.setTitulo("Resident Evil 2");
        j2.setAnoLancamento(1998);
        
        
        System.out.println("     DADOS DO JOGO      ");
        System.out.println("------------------------");
        System.out.println("        Jogo 01      ");
        System.out.println("Titulo: " + j1.getTitulo());
        System.out.println("Ano de Lancamento: " + j1.getAnoLancamento());
        
        System.out.println("------------------------");
        System.out.println("        Jogo 02      ");
        System.out.println("Titulo: " + j2.getTitulo());
        System.out.println("Ano de Lancamento: " + j2.getAnoLancamento());
        
       
    }
    
}
