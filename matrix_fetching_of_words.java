package demo;

import java.util.Scanner;

public class matrix_fetching_of_words {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char[] input="THEPOTCALLINGKETTLEBLACK".toCharArray();
		int ind=6;
		char[] key="TTL".toCharArray();
		char mat[][]=new char[ind][ind];
		int i,j,k=0;
		for(i=0;i<ind;i++)
		{
			for(j=0;j<ind;j++)
			{
				if(k>input.length-1)
					break;
				else
				mat[i][j]=input[k];
				k++;
			}
		}
		k=0;
	
		String rdum="";
		String ldum="";
		String fdum="";
		String bdum="";
		for(i=0;i<ind;i++)
		{
			for(j=0;j<ind;j++)
			{
				System.out.print(mat[i][j]+" ");
					
				}
			System.out.println();
		}
		for(i=0;i<ind;i++)
		{
			for(j=0;j<ind;j++)
			{
				if(mat[i][j]==key[0])
				{
					for(int l=j;l<ind;l++)
					{
						if(rdum.length()!=key.length)
						rdum+=mat[i][l];
					}
					for(int l=j;l>=0;l--)
					{
						if(ldum.length()!=key.length)
						ldum+=mat[i][l];
					}
					for(int l=i;l<ind;l++)
					{
						if(fdum.length()!=key.length)
						fdum+=mat[l][j];
					}
					for(int l=i;l>=0;l--)
					{
						if(bdum.length()!=key.length)
							bdum+=mat[l][j];
				}
			}
				if(rdum.length()==key.length)
				{
			System.out.println(rdum+" "+ldum+" "+fdum+" "+bdum);
			rdum="";
			ldum="";
			fdum="";
			bdum="";
				}
		}
	}
	}
	}
