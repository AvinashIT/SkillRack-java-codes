/*INPUT:
skillrack
4
OUPUT:
skil
lrac
k****
*/
package demo;
import java.util.Scanner;
public class substring {
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		char str[]=sc.nextLine().toCharArray();
		int n=sc.nextInt();
		String dum="";
		for(int i=0;i<str.length;i++)
		{
			if(i%n==0&&i!=0)
			{
				System.out.println(dum);
				dum="";
			}
			dum+=Character.toString(str[i]);
		}
		while(dum.length()<=n)
			dum+="*";
		System.out.println(dum);
	}
}
