//Joel Geake - 38045282
import java.util.Scanner;
public class Q1 {
		public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double x1 = in.nextInt();
		double y1 = in.nextInt();
		double x2 = in.nextInt();
		double y2 = in.nextInt();
		
		double m = (y2 - y1)/(x2 - x1);
		double b = y1 - m*x1;
		System.out.printf("y = %.3f*x + %.3f", m, b);
				
		}
}
