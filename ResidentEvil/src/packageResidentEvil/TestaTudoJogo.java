package packageResidentEvil;

public class TestaTudoJogo {

    public static void main(String[] args) {
        
        //Zumbi
       Zumbi z1 = new Zumbi();
        
        // Atribuindo valores aos atributos herdados da classe Inimigo
        z1.setNome("Zumbi de Raccoon City");
        z1.setVida(50.0);
        z1.setDano(15.0);
        
        // Atribuindo valor ao atributo exclusivo da classe Zumbi
        z1.setTipoVirus("T-Virus");

        
        // Inimigo
        MrX m1 = new MrX();
        m1.setNome("Mr. X (Tyrant)");
        m1.setVida(300.0);
        m1.setDano(40.0);
        

        m1.setTernoLimitador("Ativo (Limitador de Poder)");


        System.out.println("========== SISTEMA RESIDENT EVIL ==========");
        System.out.println("                                                    ");
        
        System.out.println("DADOS DO JOGO         ");
        // instanciando o jogo com metodo construtor
        Jogo j = new Jogo("Resident Evil 2", 1998);
        System.out.println("--------------------------------------------------------------");

        System.out.println("DADOS DO PERSONAGEM       ");
        Personagem p = new Personagem("Leon Kennedy ", 100.0, "Resident Evil 2");
        System.out.println("--------------------------------------------------------------");

        System.out.println("DADOS DA ARMA         ");
        Arma n = new Arma("Matilda", 50, 90.0);
        System.out.println("--------------------------------------------------------------");

        System.out.println("DADOS DO ZUMBI (INIMIGO)       ");
        System.out.println("                                                    ");
        System.out.println("Nome: " + z1.getNome());
        System.out.println("Vida: " + z1.getVida());
        System.out.println("Dano: " + z1.getDano());
        System.out.println("Tipo de Virus: " + z1.getTipoVirus());
        System.out.println("DANO CAUSADO   ");
        
        // Executando o ataque reescrito 
        z1.atacar();
        System.out.println("--------------------------------------------------------------");
        
        System.out.println("                            ");
        System.out.println("DADOS DO BOSS (MR. X)       ");
        System.out.println("                                                    ");
        System.out.println("Nome: " + m1.getNome());
        System.out.println("Vida: " + m1.getVida());
        System.out.println("Dano: " + m1.getDano());
        System.out.println("Status do Terno: " + m1.getTernoLimitador());
        System.out.println("DANO CAUSADO DO INIMIGO");
        m1.atacar();
    }
    
}
