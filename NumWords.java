// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int num = Integer.parseInt(args[0]);
        int hundreds = num / 100;
        int tens = (num % 100) / 10;
        int units = num % 10;
        System.out.println(hundreds + " hundreds " + tens + 
						" tens " + units + " units");
		// Prints "1 hundreds 2 tens 3 units" if num = 123
	}
}
