package Model;

public class Ingresso {

	public static void main(String[] args) {

        Sala Sala = new Sala();
        Distribuidora Distribuidora = new Distribuidora();
        Filme filme = new Filme();
        Sessao sessao = new Sessao();
   
       Sala.setCapacidade(50);
       Sala.setNumeroSala(6);
       Distribuidora.setNome("Cinemark");
       filme.setSinopse("filme de ação com aviãozinho e explosão com tom cruise");	
       filme.setTítulo("top gun");
       filme.setGênero("acao");
       filme.setElenco("Tom Cruise");
       filme.setDuração(2);
       filme.setDistribuidora("Fox");
	   filme.setDiretor("Guilherme del toro");
	   filme.setClassificação("não recomendado para menores de 16 anos");
	   sessao.setNumeroSessao(19);
	   sessao.setCapacidadeSessao(40);
	   sessao.setHorario(16);
	   sessao.setPreco("$40,00");
	   
	   
	  
       
	   
	   System.out.println("Numero da Sessao:" + sessao.getNumeroSessao() + "\n" +
			              "Numero da sala:" + Sala.getNumeroSala() + "\n" + 
			              "filme:" + filme.getTítulo() + "\n" +
	                      "capacidade da sala:" + Sala.getCapacidade() + "\n" +
			              "disponivel");
	  
	   
	}

}
