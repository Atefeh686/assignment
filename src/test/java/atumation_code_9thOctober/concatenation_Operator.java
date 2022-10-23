package atumation_code_9thOctober;

public class concatenation_Operator {

	public static void main(String[] args) {
		
		int i=1;
		int j=++i - --i; 
		//i=     2    1               >>>>>>i=1
		//j=   2  -   1  =1           >>>>>  j=1   
				System.out.println(i);
		System.out.println(j);
		
		
		int k =j-- - --i+i-- - --j;
		//k= -1-(-2)+(-2)-(-2)= 2      1-0+0-(-1)=2           >>>>>k=2
	   	//j=   0               -1                              >>>>j=-1
		//i=           0  -1                                 >>>>>i=-1
		
		System.out.println(i);   
		System.out.println(j);  
		System.out.println(k);   
		  
		int l=--k - k--+i-- - --i+j++ - --j;  //   
		//i=             -2    -3             >>>>i=-3
		//j=                        0     -1  >>>>>j=-1
		//k=    1     0                       >>>>>>k=0
		//l= -1-(-1)+(-3)-(-4)+(-1)-(-2)=2     >>>>>>2
		
		System.out.println(i);   
		System.out.println(j);  
		System.out.println(k);   
		System.out.println(l);  
		
		
		
	

	}

}
