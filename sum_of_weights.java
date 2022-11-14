package demo;
import java.util.*;
public class sum_of_weights {
	public static boolean isps(int t)
	{
		double sqr=Math.sqrt(t);
		if(sqr-((int)sqr)==0)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int i,nos,j,ite,weight=0,max=0,ind=0;
			 ite=sc.nextInt();
			int num[]=new int[ite];
			int wei[]=new int[ite];
			for( i=0;i<ite;i++)
			{
				nos=sc.nextInt();
				if(isps(nos))
					weight+=5;
				if(nos%4==0 && nos%6==0)
					weight+=4;
				if(nos%2==0)
					weight+=3;
				num[i]=nos;
				wei[i]=weight;
				weight=0;
			}
		 max=0;
			for(i=0;i<ite;i++)
			{
				for(j=0;j<ite;j++)
				{
					if(max<wei[j])
					{
						max=wei[j];
						ind=j;
					}
				}
				System.out.println(num[ind]+" "+wei[ind]);
				wei[ind]=-1;
				max=-1;
				ind=0;
			}
		
			
	}

}
