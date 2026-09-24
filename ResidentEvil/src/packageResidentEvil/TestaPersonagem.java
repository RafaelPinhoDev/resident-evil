package packageResidentEvil;

public class TestaPersonagem {

    public static void main(String[] args) {
     
        Personagem p1 = new Personagem();
        
        // Atribuindo utilizando o construtor vazio
        p1.setNome("Leon Kennedy");
        p1.setVida(100.0);
        p1.setAparicao("Resident Evil 2,4, 6 e 9");
        
        System.out.println("     PERSONAGEM      ");
        // Exibindo os valores do construtor vazio
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Vida: " + p1.getVida());
        System.out.println("Aparicao: " + p1.getAparicao());
        System.out.println("----------------------------------------");
        
        // Instanciando o segundo personagem com o metodo construtor
        Personagem p2 = new Personagem("Ethan", 100.0, "Resident Evil Biohazard");

    }
    
}
