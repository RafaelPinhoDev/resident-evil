
package packageResidentEvil;

public class Zumbi extends Inimigo{
    
    private String tipoVirus;
    
    public Zumbi(){
    }
    
    //reescrita de metodo
    @Override
    public void atacar(){
        System.out.println(getNome() + " deu uma mordida infectada de " + this.tipoVirus + ", causando " + getDano() + " de dano!");
    }
    
    
    public String getTipoVirus(){
        return this.tipoVirus;
    }
   
    
    public void setTipoVirus(String tipoVirus){
        this.tipoVirus = tipoVirus;
    }
}
