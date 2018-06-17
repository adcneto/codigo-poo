public class CalculaPi {
 // O método a seguir calcula pi
	public static double CalculaPi(int n){
		double pi = 1.0;
		for (int i = 1; i<n; i++){
			int mult = (i % 2 == 0) ? 1 : -1;
			pi += mult * (1/(i*2.0+1));
		}
		return pi*4;
	}


	public static void main (String [] args){
	
		System.out.println(CalculaPi(1000));
	}
}
