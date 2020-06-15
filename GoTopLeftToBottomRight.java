import java.util.*;
class GoTopLeftToBottomRight
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[][]=new int [n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				a[i][j]=scan.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0 && j==0)
				{
					a[i][j]=0;
				}
				else if(i==0 && j!=0)
				{
					a[i][j]=(int)Math.floor((a[i][j-1]/2)+a[i][j]);
				}
				else if(i!=0 && j==0)
				{
					a[i][j]=(int)Math.floor(a[i][j]+(a[i-1][j]/2));
				}
				else
				{
					int min=Math.min(a[i-1][j],a[i][j-1]);
					a[i][j]=(int)Math.floor((min/2)+a[i][j]);
				}
			}
		}
		System.out.print(a[n-1][n-1]);
	}
}