
package packageResidentEvil;


public class MrX extends Inimigo{
    
    private String ternoLimitador; 
    
    public MrX(){
        
    }
    
    @Override
    public void atacar(){
        System.out.println(getNome() + " deu um soco forte causando " + getDano() + " de dano!");
    }

    public String getTernoLimitador() {
        return this.ternoLimitador;
    }

    public void setTernoLimitador(String ternoLimitador) {
        this.ternoLimitador = ternoLimitador;
    }
}
