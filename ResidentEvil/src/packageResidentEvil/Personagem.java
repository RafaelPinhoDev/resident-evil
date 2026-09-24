package packageResidentEvil;


public class Personagem {
   private String nome;
   private double vida;
   private String aparicao;
   
   public String getNome(){
       return this.nome;
   }
   
   // Método construtor
   public Personagem(String nome, double vida, String aparicao){
       this.nome = nome;
       this.vida = vida;
       this.aparicao = aparicao;
       System.out.println("                                                 ");
       System.out.println("Nome: " + this.nome);
       System.out.println("Vida: " + this.vida);
       System.out.println("Aparicao: " + this.aparicao);
       System.out.println("                                                   ");
       
   }
   
   //Sobrecarga de metodo
   public Personagem(){
       
   }
   
   public void setNome(String nome){
       this.nome = nome;
   }
   
   public double getVida(){
       return this.vida;
   }
   
   public void setVida(double vida){
       this.vida = vida;
   }
   
   public String getAparicao(){
       return this.aparicao;
   }
   
   public void setAparicao(String aparicao){
       this.aparicao = aparicao;
   }
   
}
