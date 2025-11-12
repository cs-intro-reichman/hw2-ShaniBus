public class Cheers {
        public static void main(String[] args) {
	   String word = args[0];
           int num = Integer.parseInt(args[1]);
           String upperWord = word.toUpperCase();
           String anLetters = "AEFHILMNORSX";
           int index = 0;
           while (index < upperWord.length()) {
                if (anLetters.indexOf(upperWord.charAt(index)) != -1)
                System.out.println("Give me an " + upperWord.charAt(index) + ": " + upperWord.charAt(index) + "!");
                else
                System.out.println("Give me a  " + upperWord.charAt(index) + ": " + upperWord.charAt(index) + "!");
                index++;
           }
           System.out.println("What does that spell?");
           for (int i=0; i<num; i++) {
                System.out.println(upperWord + "!!!");
           }
           
        }
}
