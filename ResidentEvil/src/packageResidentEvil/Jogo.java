package packageResidentEvil;

public class Jogo {
    
    private String titulo;
    private int anoLancamento;
    
    
       public Jogo(String titulo, int anoLancamento){
       this.titulo = titulo;
       this.anoLancamento = anoLancamento;
       System.out.println("                                             ");
       System.out.println("Titulo: " + this.titulo);
       System.out.println("Ano de Lancamento: " + this.anoLancamento);
       System.out.println("                                           ");
       
   }
   
    public Jogo(){
        
    }
    
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public int getAnoLancamento(){
        return this.anoLancamento;
    }
    
    public void setAnoLancamento(int anoLancamento){
        this.anoLancamento = anoLancamento;
    }
}
