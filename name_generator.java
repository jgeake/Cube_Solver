//making a list of the images i'm gonna take
import java.util.Scanner;
public class name_generator {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		for (int i=5366; i<5372; i++) {
//			System.out.println("IMG_" + i + " none,none,none,none");
//			
//		}
//	}
//
//}
//	import java.util.Scanner;
//
//	class Math2 {
	    public static void main(String[] args) {
	        // Step 1: Prompt the user to enter an integer
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scan.nextInt();
	        scan.close();

	        // Step 2: Check if the number is positive
	        if (number <= 0) {
	            System.out.println("Number must be positive.");
	            return;
	        }

	        // Step 3: Find the sum of divisors of 'number'
	        int sumDivisors = 0;
	        StringBuilder divisors = new StringBuilder();

	        for (int i = 1; i <= number / 2; i++) {
	            if (number % i == 0) {
	                sumDivisors += i;
	                // Append the divisor without a leading '+' for the first divisor
	                if (divisors.length() > 0) {
	                    divisors.append(" + ");
	                }
	                divisors.append(i);
	            }
	        }

	        // Step 4: Determine if it's a perfect number and display results
	        if (sumDivisors == number) {
	            System.out.println("Perfect number.");
	            System.out.println("Reason: sum of divisors (" + divisors + ") = " + number);
	        } else {
	            System.out.println("Not a perfect number.");
	            System.out.println("Reason: sum of divisors != " + number);
	        }
	    }
	}
