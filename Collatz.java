public class Collatz {
	public static void main(String args[]) {
	    int n = Integer.parseInt(args[0]);
        String mode = args[1];
		int num;
		int count;
		if (mode.equals("v")) {
			for(int seed=1; seed<=n; seed++) {
				num = seed;
				count = 1;
				System.out.print(seed + " "); 
				do {
					if (num % 2 == 0)
					num = num / 2;
					else
					num = (num * 3) + 1;
					System.out.print(num + " ");
					count++;
				} while (num != 1);
				System.out.println("(" + count + ")");
			}
			System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
		}
		else if (mode.equals("c")) {
				for(int seed=1; seed<=n; seed++) {
				num = seed;
				count = 1;
				do {
					if (num % 2 == 0)
					num = num / 2;
					else
					num = (num * 3) + 1;
					count++;
				} while (num != 1);
			}
			System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
		}
	}
}
