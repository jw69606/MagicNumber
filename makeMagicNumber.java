
public class makeMagicNumber {

	public static void main(String[] args) {
		int GCFofOne = 0;
		
		//Runs the program of checking GCF being co-prime 1,000,000 times
		for (int i = 0 ; i < 1000000; i++) {
			int GCF = 0;
			int a = (int)(Math.random()*Integer.MAX_VALUE + 1);
			int b = (int)(Math.random()*Integer.MAX_VALUE + 1);
			GCF = findGCF(a, b);
			if (GCF == 1)
				GCFofOne++;
		}
		//End of GCF co-prime checking program
		
		//Prints the proprtion and magic value
		double proportion = GCFofOne /1000000.0;
	System.out.println(proportion + " is the proportion of trials that had coprimes.");
	System.out.print("The magic number is " + 6/proportion);
		//End of Main Method
	}
	
	//Finds GCF
	private static int findGCF(int first, int second) {
		while (first != second) {
			if(first > second)
				first = first - second;
			else
				second = second - first;
		}
		return second;
	}
}

/*
Answers to Questions:
1. The magic number seems to be around 9.85/9.86, yet I really do not know what this number represents.  I would actually really like to know the meaning!
2. The theoretical probability of any two random positive integers being co-prime is about 61%
*/