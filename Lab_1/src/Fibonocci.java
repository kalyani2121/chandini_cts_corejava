/*Name:Gadey Lakshmi Chandini
 * Description:Lab1 Exercise:Fibonacci Sequence upto nth term
 * Date:14/03/2021
 */
import java.util.Scanner;
public class Fibonocci {
     public static StringBuilder fibSequence(int n)
     {
    	 StringBuilder sb=new StringBuilder();
    	 int fib=0,n1=0,n2=1;
    	 for(int i=1;i<=n;i++)
    	 {
    		 if(n==1)
    		 {
    			 sb.append(Integer.toString(n1));
    			 break;
    		 }
    		 else
    		 {
    			 if(i==1)
    				 fib=0;
    			 else if(i==2)
    				 fib=1;
    			 else
    			 {
    				 fib=n1+n2;
    				 n1=n2;
    				 n2=fib;
    			 }
    			 if(i!=n)
    				 sb.append(Integer.toString(fib)+" ");
    			 else
    				 sb.append(Integer.toString(fib));
    		 }
    	 }
    	 return sb;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		System.out.println(fibSequence(number));
	}
}
