package packageResidentEvil;

public class Inimigo {
    private String nome;
    private double dano;
    private double vida;
    
    
    public Inimigo(String nome, double vida, double dano) {
        this.nome = nome;
        this.vida = vida;
        this.dano = dano;
        
        System.out.println("Nome do Inimigo: " + this.nome);
        System.out.println("Vida: " + this.vida);
        System.out.println("Dano: " + this.dano);
    }
    
    public Inimigo(){
        
    }
    
    public void atacar(){
        System.out.println(this.nome + "realizou um ataque causando " + this.dano + " de dano!!");
    }
    
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getDano(){
       return this.dano;
    }
    
    public void setDano(double dano){
        this.dano = dano;
    }
    
        
    public double getVida(){
       return this.vida;
    }
    
    public void setVida(double vida){
        this.vida = vida;
    }
    
}
