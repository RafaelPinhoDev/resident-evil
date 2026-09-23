package packageResidentEvil;

public class TestaTudoJogo {

    public static void main(String[] args) {
      
        // Instanciando o Jogo
        Jogo j = new Jogo();
        j.setTitulo("Resident Evil 2");
        j.setAnoLancamento(1998);

        // Instanciando o Personagem
        Personagem p = new Personagem();
        p.setNome("Leon S. Kennedy");
        p.setVida(100.0);
        p.setAparicao("Resident Evil 2");

        // Instanciando a Arma
        Arma a = new Arma();
        a.setNomeArma("Matilda (Handgun)");
        a.setMunicao(18);
        a.setDanoArma(25.0);

        // Instanciando o Inimigo Zumbi (Usando Herança)
        Zumbi z = new Zumbi();
        z.setNome("Zumbi comum");
        z.setVida(50.0);
        z.setDano(10.0);
        z.setTipoVirus("T-Virus");

        // Instanciando o Chefe Mr. X (Usando Herança)
        MrX mrx = new MrX();
        mrx.setNome("Mr. X (Tyrant)");
        mrx.setVida(300.0);
        mrx.setDano(40.0);
        mrx.setTernoLimitador("Ativo (Limitador de Poder)");

        // Exibindo todos os dados integrados 
        System.out.println("========== SISTEMA RESIDENT EVIL ==========");
        
        System.out.println("         DADOS DO JOGO         ");
        System.out.println("-------------------------------------------------");
        System.out.println("Titulo: " + j.getTitulo());
        System.out.println("Ano de Lancamento: " + j.getAnoLancamento());
        System.out.println("-------------------------------------------------");

        System.out.println("       DADOS DO PERSONAGEM       ");
        System.out.println("-------------------------------------------------");
        System.out.println("Nome: " + p.getNome());
        System.out.println("Vida: " + p.getVida());
        System.out.println("Aparicao: " + p.getAparicao());
        System.out.println("-------------------------------------------------");

        System.out.println("         DADOS DA ARMA         ");
        System.out.println("-------------------------------------------------");
        System.out.println("Arma: " + a.getNomeArma());
        System.out.println("Municao: " + a.getMunicao());
        System.out.println("Dano: " + a.getDanoArma());
        System.out.println("-------------------------------------------------");

        System.out.println("       DADOS DO ZUMBI (INIMIGO)       ");
        System.out.println("-------------------------------------------------");
        System.out.println("Nome: " + z.getNome());
        System.out.println("Vida: " + z.getVida());
        System.out.println("Dano: " + z.getDano());
        System.out.println("Tipo de Virus: " + z.getTipoVirus());
        System.out.println("-------------------------------------------------");

        System.out.println("       DADOS DO BOSS (MR. X)       ");
        System.out.println("-------------------------------------------------");
        System.out.println("Nome: " + mrx.getNome());
        System.out.println("Vida: " + mrx.getVida());
        System.out.println("Dano: " + mrx.getDano());
        System.out.println("Status do Terno: " + mrx.getTernoLimitador());
        System.out.println("-------------------------------------------------");
    }
    
}
