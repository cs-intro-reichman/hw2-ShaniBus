public  class  TestRandom {
	public static void main(String[]  args) {
	  int n = Integer.parseInt(args[0]);
	  int small = 0;
	  int big = 0;
	  for (int i=0; i < n; i++) {
		double r = Math.random();
		if (r <= 0.5) small++;
		else big++;
	  }
	  System.out.println("> 0.5:  " + big + " times");
	  System.out.println("<= 0.5: " + small + " times");
	  if (small != 0 && big != 0) { 
		double ratio = (double) big / small;
		System.out.println("Ratio:  " + ratio);
	  }
}
	}
