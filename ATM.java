import java.util.*;
class ATM
{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int notes=scan.nextInt();
		int currency=scan.nextInt();
		int notes_100=scan.nextInt();
		int notes_200=scan.nextInt();
		int notes_500=scan.nextInt();
		int notes_1000=scan.nextInt();
		int count=0;

		for(int a=0;a<=notes_100;a++)
		{
			for(int b=0;b<=notes_200;b++)
			{
				for(int c=0;c<=notes_500;c++)
				{
					for(int d=0;d<=notes_1000;d++)
					{
						if(a*100+b*200+c*500+d*1000==currency)
						{
							int temp=a+b+c+d;
							if(temp<=notes && temp>count)
								count=temp;
						}
					}
				}
			}
		}
		System.out.print(count);
	}
}