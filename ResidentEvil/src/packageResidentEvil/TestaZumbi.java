
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
        
        // Exibindo os resultados no console
        System.out.println("     DADOS DO ZUMBI     ");
        System.out.println("                            ");
        System.out.println("ZUMBI 1");
        System.out.println("Nome: " + z1.getNome());
        System.out.println("Vida: " + z1.getVida());
        System.out.println("Dano: " + z1.getDano());
        System.out.println("Tipo de Virus: " + z1.getTipoVirus());
        System.out.println("ATAQUE DO INIMIGO   ");
        // Executando o ataque reescrito 
        z1.atacar();
        System.out.println("                            ");
      
        
        Zumbi z2 = new Zumbi();
        // Atribuindo valores aos atributos herdados da classe Inimigo
        z2.setNome("Ganado");
        z2.setVida(60.0);
        z2.setDano(20.0);
        
        // Atribuindo valor ao atributo exclusivo da classe Zumbi
        z2.setTipoVirus("La Plaga");

        System.out.println("ZUMBI 2");
        System.out.println("Nome: " + z2.getNome());
        System.out.println("Vida: " + z2.getVida());
        System.out.println("Dano: " + z2.getDano());
        System.out.println("Tipo de Virus: " + z2.getTipoVirus());
        System.out.println("ATAQUE DO INIMIGO   ");
        // Executando o ataque reescrito 
        z2.atacar();
        System.out.println("                            ");
        
        
        
    }
}
    
    
