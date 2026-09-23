
package packageResidentEvil;

public class TestaZumbi {


    public static void main(String[] args) {
       Zumbi z1 = new Zumbi();
        
        // Atribuindo valores aos atributos herdados da classe Inimigo
        z1.setNome("Zumbi de Raccoon City");
        z1.setVida(50.0);
        z1.setDano(15.0);
        
        // Atribuindo valor ao atributo exclusivo da classe Zumbi
        z1.setTipoVirus("T-Virus");
        
        
        
        
        Zumbi z2 = new Zumbi();
        
        // Atribuindo valores aos atributos herdados da classe Inimigo
        z2.setNome("Ganado");
        z2.setVida(60.0);
        z2.setDano(20.0);
        
        // Atribuindo valor ao atributo exclusivo da classe Zumbi
        z2.setTipoVirus("Plaga");
        
        
        // Exibindo os resultados no console
        System.out.println("     DADOS DO ZUMBI     ");
        System.out.println("---------------------------");
        System.out.println("        Zumbi 02          ");
        System.out.println("Nome: " + z1.getNome());
        System.out.println("Vida: " + z1.getVida());
        System.out.println("Dano: " + z1.getDano());
        System.out.println("Tipo de Virus: " + z1.getTipoVirus());
        

        System.out.println("---------------------------");
        System.out.println("        Inimigo 02          ");
        System.out.println("Nome: " + z2.getNome());
        System.out.println("Vida: " + z2.getVida());
        System.out.println("Dano: " + z2.getDano());
        System.out.println("Tipo de Virus: " + z2.getTipoVirus());
        
        
    }
}
    
    
