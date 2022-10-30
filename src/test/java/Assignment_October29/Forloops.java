package Assignment_October29;

public class Forloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//first 20 even number
		for( int i=2;i<=2*20;i=i+2) {
		System.out.print(i + " ");
		}
		
System.out.println("------------------------------------------------------------");
	
				
	//first 5 multiples of 5
for(int u=1;u<=10;++u) {
		System.out.print(u*5 + " ");
		
}
	
System.out.println("-------------------------------------------------------------");
	


	
//numbers from 100 to 50 

	for (int d=100;d>=50;d--) {
		System.out.print(d + " ");
		
	}
		
		System.out.println("---------------------------------------------------------");
		
		
		
		//multiple of 5 in a decreasing order starting from200 till 100
		
		for (int y=40;y>=20;y--) {
			System.out.print(y*5 + " ");
		}
		

	System.out.println("---------------------------------------------------------------");
	
	
	
	
	//sum of first 10 prime numbers
	int count=1;
	
	for(int B=2;B<50;B++){

		boolean isPrime=true;

		for (int C=2;C<B;C++) {
			if (B%C==0) {
				isPrime=false;
				break;
				
			}
		}
		if (count<=10) {
			if(isPrime) {
				System.out.print(B + " ");
				
				count++;
				
		
			}
		}
	}
	System.out.println("------------------------------------");

	
	
	
	//sum first 100 natural numbers
	int z,sum=0;
	for (z=1;z<=100;++z) {
		sum=sum+z;
	}

	System.out.println("sum of first 100 natural numbers is:"+sum);
	}
	
}





	




