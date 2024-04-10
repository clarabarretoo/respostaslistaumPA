  public class Retangulo {
		public double base;
		public double altura;
		
		 public Retangulo ( double b,double a)	{
		    this.base=b;
		    this.altura=a;
		 }
		public double getAltura() {
			return altura;
		}
		public double getBase() {
			return base;
		}
		public void setBase (double b) {
			this.base=b;
		}
		public void setAltura (double a) {
			this.altura = a;
		}
		public String toString() {
			return "Base: " + base + "\nAltura: " + altura;
		}
		public double calcularArea() {
			return (this.base * 2)+(this.altura*2);
		}
		public double calcularPerimetro() {
			return (this.base * 2)+(this.altura*2);
		}
}
