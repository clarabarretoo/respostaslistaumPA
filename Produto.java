public class Produto {
	private String nome;
	private double preço;
	private int quantidade;
	
	public Produto(String n, double p, int q) {
		   this.nome = n;
		   this.preço = p;
		   this.quantidade = q;
	}
	
	public String getNome() {
		return nome;
}
	public double preço() {
		return preço;
	}
	public int quantidade() {
		return quantidade;
	}
	
	public void setNome(String n) {
		this.nome = n;
	}
	public void setPreço(double p) {
		this.preço = p;
	}
	public void setQuantidade(int q) {
		this.quantidade = q; 
	}
	
	public double CalcularTotal() {
		return(this.preço * this.quantidade);
		
	}
	
	
}
