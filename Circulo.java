public class Circulo {
	public double raio;

	public Circulo(double r) {
		this.raio = r;
	}
	public double getRaio() {
		return raio;
	}
	public void setRaio(double r) {
		this.raio = r;

	}
	public double calcularAreaCirculo() {
		return 3.14 * (this.raio * this.raio);
	}
	public double calcularPerimetroCirculo() {
		return 2 * 3.14 * this.raio;
	}
}
