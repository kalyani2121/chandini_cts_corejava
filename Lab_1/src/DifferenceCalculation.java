/*Name:Gadey Lakshmi Chandini
 * Description:Calculating difference between sum of squares of n natural numbers and square of sum of n natural numbers
 * Date:18/03/2021
 */
import java.util.Scanner;
import java.lang.Math;
public class DifferenceCalculation {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the range:");
		int range=sc.nextInt();
        System.out.println("The difference is:"+calculateDifference(range));
	}
    private static int calculateDifference(int n)
    {
    	int sum=0;
    	int sumOfNaturalNumbers=0,sumOfSquaresOfNaturalNumbers=0;
    	sumOfNaturalNumbers=(n*(n+1)/2);
    	sumOfSquaresOfNaturalNumbers=((n*(n+1)*(2*n+1))/6);
    	sum=(sumOfNaturalNumbers*sumOfNaturalNumbers)-sumOfSquaresOfNaturalNumbers;
    	return sum;
    }
}
