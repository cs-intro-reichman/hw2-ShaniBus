public class CalcPi {
	public static void main(String [] args) { 
	   int n = Integer.parseInt(args[0]);
	   double sum = 0;
	   for (int i=0; i<n; i++) {
		if(i % 2 == 0)
		sum = sum + (1.0 / (2 * i + 1));
		else 
		sum = sum - (1.0 / (2 * i + 1));
	   }
	   sum = sum * 4;
	   System.out.println("pi according to Java: " + Math.PI);
	   System.out.println("pi, approximated:     " + sum);
	}
}
