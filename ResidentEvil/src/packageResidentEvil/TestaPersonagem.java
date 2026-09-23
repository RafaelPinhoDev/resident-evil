package packageResidentEvil;

public class TestaPersonagem {

    public static void main(String[] args) {
     
        Personagem p1 = new Personagem();
        
        // Atribuindo valores usando os métodos set 
        p1.setNome("Leon Kennedy");
        p1.setVida(100.0);
        p1.setAparicao("Resident Evil 2,4, 6 e 9");
        
        
        // Instanciando o segundo personagem
        Personagem p2 = new Personagem();
        
        p2.setNome("Ethan");
        p2.setVida(90);
        p2.setAparicao("Resident Evil Biohazard e Village");

        
        
        // Exibindo os valores utilizando os metodos get
        System.out.println("    PERSONAGEM  01   ");
        System.out.println("---------------------");
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Vida: " + p1.getVida());
        System.out.println("Aparicao: " + p1.getAparicao());
        System.out.println("---------------------");
        
        System.out.println("    PERSONAGEM  02   ");
        System.out.println("---------------------");
        System.out.println("Nome: " + p2.getNome());
        System.out.println("Vida: " + p2.getVida());
        System.out.println("Aparicao: " + p2.getAparicao());
        System.out.println("---------------------");
    }
    
}
