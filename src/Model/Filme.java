package Model;

public class Filme {

	private String sinopse;
	private String t�tulo;
	private String distribuidora;
	private String classifica��o;
	private String elenco;
	private String diretor;
	private String g�nero; 
	
	
	public String getSinopse() {
		return sinopse;
	}
	public String getG�nero() {
		return g�nero;
	}
	public void setG�nero(String g�nero) {
		this.g�nero = g�nero;
	}
	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}
	public String getT�tulo() {
		return t�tulo;
	}
	public void setT�tulo(String t�tulo) {
		this.t�tulo = t�tulo;
	}
	public String getDistribuidora() {
		return distribuidora;
	}
	public void setDistribuidora(String distribuidora) {
		this.distribuidora = distribuidora;
	}
	public String getClassifica��o() {
		return classifica��o;
	}
	public void setClassifica��o(String classifica��o) {
		this.classifica��o = classifica��o;
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
	public int getDura��o() {
		return dura��o;
	}
	public void setDura��o(int dura��o) {
		this.dura��o = dura��o;
	}
	private int dura��o;
	
}
