package atumation_code_9thOctober;

public class concatenation_Operator {

	public static void main(String[] args) {
		
		int i=1;
		int j=++i - --i;     //2-1=1  >>>>> i=1 and j=1
				System.out.println(i);
		System.out.println(j);
		
		
		int k =j-- - --i+i-- - --j;
		System.out.println(i);   //i=-1   0+(-1)=-1
		System.out.println(j);  //j=-1    0-1=-1
		System.out.println(k);   //k=2   -2-(-1)+0-(-3)=-1+3=2
		  
		int l=--k - k--+i-- - --i+j++ - --j;  // l=(2-2) - 
		System.out.println(i); //i=-3      
		System.out.println(j);  //j=-1
		System.out.println(k);   //k=0  // k=2-2=0
		System.out.println(l);   //2
		
		
		
	

	}

}
