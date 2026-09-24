
package packageResidentEvil;

public class Arma {
    private String nomeArma;
    private int municao;
    private double danoArma;

    public Arma(){
    }
    
    public Arma(String nomeArma, int municao, double danoArma){
        
        this.nomeArma = nomeArma;
        this.municao = municao;
        this.danoArma = danoArma;
        
        System.out.println("                                ");
        System.out.println("Nome da arma: " + this.nomeArma);
        System.out.println("Quantidade de municao: " + this.municao);
        System.out.println("Dano da arma: " + this.municao);
        
        
    }
    
    public String getNomeArma() {
        return this.nomeArma;
    }

    public void setNomeArma(String nomeArma) {
        this.nomeArma = nomeArma;
    }

    public int getMunicao() {
        return this.municao;
    }

    public void setMunicao(int municao) {
        this.municao = municao;
    }

    public double getDanoArma() {
        return this.danoArma;
    }

    public void setDanoArma(double danoArma) {
        this.danoArma = danoArma;
    }
}
