package demo;

public class repeatition_of_words {
	public static void main(String[] ozg)
	{
		String a1="a10e3";
		a1+="a";
		char a[]=a1.toCharArray();
		char t='-';
		String l="";
		int o=0;
		for(int i=0;i<a.length;i++)
		{
			if(Character.isAlphabetic(a[i]))
				t=a[i];
			else if(Character.isDigit(a[i]))
			{
				if(Character.isDigit(a[i+1]))
				{
				o=0;
				while(!Character.isAlphabetic(a[i+o]))
				{
					l+=a[i+o];
					o++;
				}
				}
				else
					l+=a[i];
				

			int po=Integer.parseInt(l);
				for(int j=0;j<po;j++)
				{
					System.out.print(t);
				}
				po=0;
				l="";
				}
				
			}
		}
	}
	
			
	
	
