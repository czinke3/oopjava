package polynomial;
import math.IPolynomial;

public class LinearPolynomial implements IPolynomial {
	

	private double a;
	private double b;

	public LinearPolynomial(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	
	public double getY(double x) {
		return this.a * x + this.b;
	}
	
	public int getGrade() {
		return 1;
	}
	
		@Override
	public String toString() {
		if(this.b>0)
			return "y = " + this.a + " * x" + " + " + this.b;
		else if(this.b<0) {
			return "y = " + this.a + " * x" + " - " + this.b;
		}
		else			
			return "y = " + this.a + " * x" + " + " + 0;
		
	}

}