package il.ac.tau.cs.sw1.ex2;

public class Assignment02Q02 {

	public static void main(String[] args) {
		// do not change this part below
		double piEstimation = 0.0;
		
		// Your code goes here
		for(double i=0.0;i<Double.parseDouble(args[0]);i+=2.0) {
			piEstimation += (1.0/((2.0*i)+1.0))-(1.0/((2.0*i)+3.0));
		}
		piEstimation *= 4.0;
		// do not change this part below
		System.out.println(piEstimation + " " + Math.PI);

	}

}
