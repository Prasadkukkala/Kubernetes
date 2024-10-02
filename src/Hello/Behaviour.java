package Hello;

import java.util.Scanner;

public class Behaviour {
	public static void main(String[] args) {
		long a,sum,sum1,count=0,count1=0;
		
		Scanner sc=new Scanner(System.in);  
		System.out.println("Enter Number= ");
		a=sc.nextLong();
		
		for (sum = 0; a!=0; a=a/10) {
			
			sum=sum+a%10;
			count++;
			  
			}
		for (sum1 = 0; sum!=0; sum=sum/10) {
			
			sum1=sum1+sum%10;
			count1++;
			}
		
		
		System.out.println("total sum:"+sum1);
		System.out.println("First itrration:"+count);
		System.out.println("Second itrration:"+count1);
	}
}

