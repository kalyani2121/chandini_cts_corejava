/*Name:Gadey Lakshmi Chandini
 *  * Description:Lab1 Exercise:Sum of Cubes of Digits of a number
 * Date:14/03/2021
 */
import java.util.*;
public class DigitsCubeSum {
	public static int cubeSum(int n) {
		int sum=0;
		while(n!=0)
		{
			int digit=n%10;;
			sum=sum+digit*digit*digit;
			n=n/10;
		}
		return sum;
	}

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number"); 

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
			    int result = cubeSum(num);
	  System.out.println("The sum of cubes of digits of given number is" +result);
	}
}
