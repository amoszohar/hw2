package il.ac.tau.cs.sw1.ex2;

public class Assignment02Q01 {

	public static void main(String[] args) {
		// Your code goes here
		for(int i=0;i<args.length;i++) {
			String str = args[i];
			char c = str.charAt(0);
			int c_ascii = (int) c;
			if(c_ascii%6==0) {
				System.out.println(c);
			}
		}
	}

}
