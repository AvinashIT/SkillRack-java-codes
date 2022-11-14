/*
 INPUT:
 5
 OUTPUT:
 7 
 */
package demo;
import java.util.Scanner;
import java.math.*;
public class nextPime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		BigInteger bc=new BigInteger(str);
		System.out.println(bc.nextProbablePrime());
	}
}
