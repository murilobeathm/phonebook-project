package servico;

public class OperacoesDaCalc {

	private double numA = 0;
	private double numB = 0;

	public OperacoesDaCalc(double numA, double numB) {
		super();
		this.numA = numA;
		this.numB = numB;
	}

	public final double Somar(double nunA, double numB) {

		return this.numA + this.numB;
	}

	public final double Subtrair(double numA, double numB) {

		return this.numA - this.numB;
	}

	public final double Multiplicar(double numA, double numB) {

		return this.numA * this.numB;
	}

	public final double Dividir(double numA, double numB) {
		if (numB == 0) {

			System.out.println("Não é possivel efetuar este cálculo!");
		}
		return this.numA / this.numB;

	}

	public double getNumA() {
		return numA;
	}

	public void setNumA(double numA) {
		this.numA = numA;
	}

	public double getNumB() {
		return numB;
	}

	public void setNumB(double numB) {
		this.numB = numB;
	}

	@Override
	public String toString() {
		return "OperacoesDaCalc [numA=" + numA + ", numB=" + numB + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(numA);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(numB);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OperacoesDaCalc other = (OperacoesDaCalc) obj;
		if (Double.doubleToLongBits(numA) != Double.doubleToLongBits(other.numA))
			return false;
		if (Double.doubleToLongBits(numB) != Double.doubleToLongBits(other.numB))
			return false;
		return true;
	}

}
