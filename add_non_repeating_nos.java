/*
INPUT:
 5
1 1 2 3 4
OUTPUT:
9
*/
package demo;
import java.util.Scanner;
public class add_non_repeating_nos {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no,i,j,sum=0,f;
		no=sc.nextInt();
		int arr[]=new int [no];
		for(i=0;i<no;i++)
			arr[i]=sc.nextInt();
		for(i=0;i<no;i++)
		{
			f=0;
			for(j=i+1;j<no;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]=-1;
					f=1;
				}
			}
			if(f==1)
			arr[i]=-1;
		}
		for(i=0;i<no;i++)
		{
			if(arr[i]!=-1)
				sum+=arr[i];
		}
		if(sum!=0)
			System.out.println(sum);
		else
			System.out.println(-1);
	}
}
