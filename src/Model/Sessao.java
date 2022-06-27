package Model;

public class Sessao extends Sala {

	private int capacidade = 50;
	private int numeroSessao;
	private int horario;
	private String preco;
	
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	private int capacidadeSessao;
	
	
	public int getNumeroSessao() {
		return numeroSessao;
	}
	public void setNumeroSessao(int numeroSessao) {
		this.numeroSessao = numeroSessao;
	}
	public int getHorario() {
		return horario;
	}
	public void setHorario(int horario) {
		this.horario = horario;
	}
	public String getPreco() {
		return preco;
	}
	public void setPreco(String preco) {
		this.preco = preco;
	}
	public int getCapacidadeSessao() {
		return capacidadeSessao;
	}
	public void setCapacidadeSessao(int capacidadeSessao) {
		this.capacidadeSessao = capacidadeSessao;
	}

   
	public void calcularCapacidade(int capacidade )
        {
    	capacidadeSessao = capacidade - capacidadeSessao;
    
    	if (capacidadeSessao> capacidade) {
    		
    		System.out.println("sessao não disponivel");
    	}
    	else {
    		
    		System.out.println("sessão disponivel");
    		
    	}
    }
	
}
