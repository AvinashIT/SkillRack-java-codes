/*
 INPUT:
 skill rack is the best
 OUPUT:
 skill kcar si eht best 
 */
package demo;
import java.util.Scanner;
public class reverse_except_first_last {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		String words[]=sc.nextLine().split(" ");
		for(int i=0;i<words.length;i++)
		{
			if(i!=0 && i!=words.length-1)
			{
				StringBuilder sb=new StringBuilder(words[i]);
				System.out.print(sb.reverse()+" ");
			}
			else
				System.out.print(words[i]+" ");
		}
	}
}
