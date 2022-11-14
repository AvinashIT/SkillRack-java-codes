/*
INPUT:
ENETR A STRING:helloworld
OUTPUT:
hell
ow
orld
 */
package demo;
import java.util.*;
public class sep_with_vowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENETR A STRING:");
		String a=sc.nextLine();
		char b[]=a.toCharArray();
		int c[]=new int[a.length()];
		int st,en,i,k=0;
		for( i=0;i<a.length();i++)
		{
			if(i==a.length()-1)
				continue;
			else if(b[i]=='a'||b[i]=='e'||b[i]=='i'||b[i]=='o'||b[i]=='u')
					{
							if(b[i+1]=='a'||b[i+1]=='e'||b[i+1]=='i'||b[i+1]=='o'||b[i+1]=='u')
							{
									c[k]=i+1;
									k++;
							}
							else
							{
								c[k]=i;
								k++;
							}
					}
		}
		st=0;
		for(i=1;i<=k;i++)
		{
			if(i==k)
				System.out.println(a.substring(st,a.length()));
			else if(st!=c[i])
			System.out.println(a.substring(st,c[i]));
			st=c[i];
		}
	}
}
