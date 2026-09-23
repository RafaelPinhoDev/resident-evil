package packageResidentEvil;


public class TestaArma {

    public static void main(String[] args) {
       
     
        Arma a1 = new Arma();
        a1.setNomeArma("Handgun (Matilda)");
        a1.setMunicao(15);
        a1.setDanoArma(25.0);
        
        Arma a2 = new Arma();
        a2.setNomeArma("Shotgun M3");
        a2.setMunicao(7);
        a2.setDanoArma(60.0);
        

        System.out.println("     DADOS DA ARMA     ");
        System.out.println("------------------------");
        System.out.println("        Arma 01        ");
        System.out.println("Nome da Arma: " + a1.getNomeArma());
        System.out.println("Municao: " + a1.getMunicao());
        System.out.println("Dano: " + a1.getDanoArma());
        
        System.out.println("------------------------");
        System.out.println("        Arma 02        ");
        System.out.println("Nome da Arma: " + a2.getNomeArma());
        System.out.println("Municao: " + a2.getMunicao());
        System.out.println("Dano: " + a2.getDanoArma());
       
    }
    
}
