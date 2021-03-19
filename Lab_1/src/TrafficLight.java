/*Name:Gadey Lakshmi Chandini
 * Description:Lab1 Exercise:Traffic Light selection by user and display according to signal
 * Date:14/03/2021
 */
import java.util.*;
public class TrafficLight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("enter number to display signal");
        System.out.println("1.Red"+"\n"+"2.Green"+"\n"+"3.Yellow");
        int signal=sc.nextInt();
        switch(signal)
        {
          case 1:
        	  System.out.println("stop");
        	  break;
          case 2:
        	  System.out.println("Go");
        	  break;
          case 3:
        	  System.out.println("Ready");
        	  break;
          default:
        	  System.out.println("Not valid");
        }
        

	}

}
