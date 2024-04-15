public class Triangulo {

	    private double ladoA;
	    private double ladoB;
	    private double ladoC;

	    public Triangulo(double ladoA, double ladoB, double ladoC) {
	        this.ladoA = ladoA;
	        this.ladoB = ladoB;
	        this.ladoC = ladoC;
	    }


	    public double getLadoA() {
	        return ladoA;
	    }

	    public void setLadoA(double ladoA) {
	        this.ladoA = ladoA;
	    }

	    public double getLadoB() {
	        return ladoB;
	    }

	    public void setLadoB(double ladoB) {
	        this.ladoB = ladoB;
	    }

	    public double getLadoC() {
	        return ladoC;
	    }

	    public void setLadoC(double ladoC) {
	        this.ladoC = ladoC;
	    }

	  
	    public double calcularArea() {
	        double s = (ladoA + ladoB + ladoC) / 2; // Semiperímetro
	        double area = Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC));
	        return area;
	    }

	    public double calcularPerimetro() {
	        double perimetro = ladoA + ladoB + ladoC;
	        return perimetro;
	    }
	    public static void main(String[] args) {
	        Triangulo triangulo = new Triangulo(3.0, 4.0, 5.0);
	    }

}

