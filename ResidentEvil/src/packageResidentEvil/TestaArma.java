package packageResidentEvil;


public class TestaArma {

    public static void main(String[] args) {
       
        System.out.println("     DADOS DA ARMA     ");
        Arma a1 = new Arma("Matilda", 15,25.0);
        
        Arma a2 = new Arma();
        a2.setNomeArma("Shotgun M3");
        a2.setMunicao(7);
        a2.setDanoArma(60.0);
        
        System.out.println("                                ");
        System.out.println("Nome da arma: " + a2.getNomeArma() );
        System.out.println("Quantidade de municao: " + a2.getMunicao());
        System.out.println("Dano da arma: " + a2.getDanoArma());



       
    }
    
}
