package packageResidentEvil;


public class Personagem {
   private String nome;
   private double vida;
   private String aparicao;
   
   public String getNome(){
       return this.nome;
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
