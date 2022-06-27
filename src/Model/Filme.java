package Model;

public class Filme {

	private String sinopse;
	private String título;
	private String distribuidora;
	private String classificação;
	private String elenco;
	private String diretor;
	private String gênero; 
	
	
	public String getSinopse() {
		return sinopse;
	}
	public String getGênero() {
		return gênero;
	}
	public void setGênero(String gênero) {
		this.gênero = gênero;
	}
	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}
	public String getTítulo() {
		return título;
	}
	public void setTítulo(String título) {
		this.título = título;
	}
	public String getDistribuidora() {
		return distribuidora;
	}
	public void setDistribuidora(String distribuidora) {
		this.distribuidora = distribuidora;
	}
	public String getClassificação() {
		return classificação;
	}
	public void setClassificação(String classificação) {
		this.classificação = classificação;
	}
	public String getElenco() {
		return elenco;
	}
	public void setElenco(String elenco) {
		this.elenco = elenco;
	}
	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	public int getDuração() {
		return duração;
	}
	public void setDuração(int duração) {
		this.duração = duração;
	}
	private int duração;
	
}
