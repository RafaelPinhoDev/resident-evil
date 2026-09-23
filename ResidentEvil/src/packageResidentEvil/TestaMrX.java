
package packageResidentEvil;

public class TestaMrX {

    public static void main(String[] args) {
        
        MrX m1 = new MrX();
        m1.setNome("Mr. X (Tyrant)");
        m1.setVida(300.0);
        m1.setDano(40.0);
        

        m1.setTernoLimitador("Ativo (Limitador de Poder)");
        
    
        System.out.println("     CHEFE DE RESIDENT EVIL     ");
        System.out.println("--------------------------------");
        System.out.println("Nome: " + m1.getNome());
        System.out.println("Vida: " + m1.getVida());
        System.out.println("Dano: " + m1.getDano());
        System.out.println("Status do Terno: " + m1.getTernoLimitador());

    }
    
    
}
