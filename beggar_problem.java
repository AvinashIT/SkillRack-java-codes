package demo;

import java.util.Scanner;

public class beggar_problem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rs1,rs2,rs5,beg;
		rs1=2;
		rs2=2;
		rs5=4;
		beg=5;
		while(beg>0)
		{
			if(rs1>0)
				rs1-=1;
			else if(rs2>0)
				rs2-=1;
			else
				rs5-=1;
		beg-=1;
		}
		rs1*=1;
		rs2*=2;
		rs5*=5;
		System.out.println(rs1+rs2+rs5);
	}
}
