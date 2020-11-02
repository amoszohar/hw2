package il.ac.tau.cs.sw1.ex2;

public class Assignment02Q03 {

	public static void main(String[] args) {
		int numOfEven = 0;
		int n = -1;
		// Your code goes here
		n = Integer.parseInt(args[0]);
		numOfEven = n/3;
		int [] nFibSequence = new int[n];
		nFibSequence[1]=nFibSequence[0]=1;
		int i = 2;
		while(i<n) {
			nFibSequence[i]=nFibSequence[i-2]+nFibSequence[i-1];
			i++;
		}
		
		System.out.println("The first "+ n +" Fibonacci numbers are:");
		//print here your output
		i=0;
		while(i<n) {
			System.out.print(nFibSequence[i]);
			System.out.print(' ');
			i++;
		}
		System.out.println();
		System.out.println("The number of even numbers is: "+numOfEven);

	}

}
