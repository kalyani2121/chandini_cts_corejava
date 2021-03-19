/*Name:Gadey Lakshmi Chandini
 * Description:Converting ArrayList to Array
 * Date:16/03/2021
 */
import java.util.ArrayList;
public class ArrayListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Integer> list =new ArrayList<>();
        list.add(7);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(5);
        Integer [] array = new Integer[list.size()];

	    // ArrayList into the string array conversion
	    list.toArray(array);
	    System.out.print("After Conversion Array: ");
	    for(int i=0;i<array.length;i++) {
	      if(i==array.length-1)
	      System.out.print(array[i]);
	      else
		      System.out.print(array[i]+",");
	    }

}
}
