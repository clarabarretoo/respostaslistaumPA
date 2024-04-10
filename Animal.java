public class Animal {
	private String nome;
	private String tipo;
	private boolean emiteSom;
	
	public Animal(String n, String t) {
		this.nome = n;
		this.tipo = t;
	}
	public String getNome() {
		return nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setNome(String n) {
		this.nome = n;
	}
	public void setTipo(String t) {
		this.tipo = t;
	}
	public String toString() {
		return "Nome: " + nome + "\nTipo: " + tipo;
	}
	public void emitirSom() {
		this.emiteSom = true;
	}
}
