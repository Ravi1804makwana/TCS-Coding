import java.util.*;
class LexiString
{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int T=scan.nextInt();
		scan.nextLine();
		for(int t=1;t<=T;t++)
		{
			String p=scan.nextLine();
			String s=scan.nextLine();
			String ans="";

			for(int i=0;i<p.length();i++)
			{
				for(int j=0;j<s.length();j++)
				{
					if(s.charAt(j)==p.charAt(i))
					{
						ans+=s.charAt(j)+"";
					}
				}
			}
			if(t==T)
				System.out.print(ans);
			else
				System.out.println(ans);
		}
	}
}