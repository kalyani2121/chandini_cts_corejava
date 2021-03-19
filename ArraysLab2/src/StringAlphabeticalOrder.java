/*Name:Gadey Lakshmi Chandini
 * Description:Arranging words in Alphabetical Order
 * Date:16/03/2021
 */

import java.util.Arrays;
import java.util.Scanner;

public class StringAlphabeticalOrder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of string array");
		final int NUM_ITEMS=sc.nextInt();
		int range=0;
		String [] items=new String[NUM_ITEMS];
		System.out.println("Enter the  items of string array");
		for(int i=0;i<items.length;i++)
			items[i]=sc.next();
		System.out.println(sortStrings(NUM_ITEMS, items));
			

	}

	private static String sortStrings(final int NUM_OF_ITEMS, String[] str) {
		int range;
		String output="";
		for(int i=0;i<str.length-1;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].compareToIgnoreCase(str[j])>0)
				{
				String temp=str[i];
				str[i]=str[j];
				str[j]=temp;
				}
		    }
		}
	    //Arrays.sort(str);
		if(NUM_OF_ITEMS%2==0)
			range=NUM_OF_ITEMS/2;
		else
			range=NUM_OF_ITEMS/2+1;
		for(int i=0;i<range;i++)
		{
				output+=str[i].toUpperCase()+" ";
		}
		for(int i=range;i<NUM_OF_ITEMS;i++)
		{
			if(i!=NUM_OF_ITEMS-1)
				output+=str[i].toLowerCase()+" ";
				else
					output+=str[i].toLowerCase();
		}
		return output;
	}

}


