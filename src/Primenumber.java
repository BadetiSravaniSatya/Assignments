import java.util.Scanner;
public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);              
		System.out.println("Enter a number");
		int n = sc.nextInt();			        
		int count=0;
		for(int i = 1 ; i <=n ; i++)	
		{	
			if(n % i == 0)				
			count=count+1;
		}
		if(count == 2)		                       
		System.out.println("Prime Number");
		else
		System.out.println("Not a Prime Number");
		sc.close();	
	}

}
