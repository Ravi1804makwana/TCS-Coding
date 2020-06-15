import java.util.*;
class SimilarChar
{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();	
		scan.nextLine();
		String s=scan.nextLine();
		int q=scan.nextInt();
		int arr[]=new int[q];
		for(int t=0;t<q;t++)
		{
			int p=scan.nextInt();
			char c=s.charAt(p-1);
			int count=0;
			for(int i=0;i<p-1;i++)
			{
				if(s.charAt(i)==c)
					count++;
			}
			arr[t]=count;
		}
		for(int i=0;i<q-1;i++)
			System.out.println(arr[i]);
		System.out.print(arr[q-1]);
	}	
}