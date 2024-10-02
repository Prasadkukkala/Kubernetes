package Hello;

import java.util.Scanner;

public class Advance {
public static void main(String[] args) {
	int a,count=0;
	long sum;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number:");
	a=sc.nextInt();
	
	if(a%9==0) {
		
		System.out.println("sum of digit:"+9);
		
	}
	else {
		
		for(sum=0;a%9!=0;a=a/10) {
			
			sum=sum+a%10;
			count++;
		}
		
		System.out.println(sum);
	}
	
	System.out.println(count);
}
}
