/*Name:Gadey Lakshmi Chandini
 * Description:Lab1 Exercise:To display Prime Numbers upto specific number
 * Date:14/03/2021
 */
import java.util.*;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n,i,j,c;
		System.out.println("Enter the number until which u want prime numbers");
		n = sc.nextInt();
		System.out.println("Prime numbers are:-");
		for(i=2;i<=n;i++)
		{
			c=0;
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					c++;
				}
			}
			if(c==2)
			{
				System.out.print(i+" ");
				}
			}
		}
	}


