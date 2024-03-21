package tasks.ifstatement;

public class Boxpattern {
	
	 public static void boxpattern(int n){
		 int k=n;
 
		 for(int i=0;i<n;i++) {
			 k--;
			 for(int j=0;j<n;j++) {
				 if((j==0 || j==n-1) || (i==0 || i==n-1 ) ||(j==i || j==k)){
					 System.out.print("*");
				 }else {
					 System.out.print(" ");
				 }
			 }System.out.println("");
		 }
	 }
	 
	 public static void pattern(int n) {
		int k=n;
		 for(int i=0;i<n;i++) {
			 k--;
			 for(int j=0;j<n;j++) {
				 
				 if(j==0 || i==n-1 || j==k) {
					
					 System.out.print("*");		 
				}
				 else {
					 System.out.print(" ");
				 }
			 }System.out.println();
		 }
	 }
	 
	 public static void recurse(int n, int i, int j) {
		  
			if(i<n) {
				
				if(j<n){
					 if((j==0 || j==n-1) || (i==0 || i==n-1 )){
						 System.out.print("*");
					 }else {
						 System.out.print(" ");
					 }
					    recurse(n, i, j+1);
					    return;
				
				}
				System.out.println("");
				  recurse(n, i+1, 0 );
				  return;
			}
			
	 }
	 
	public static void whilepattern(int n) {
		int i=0;
		while(i<n) {
			int j=0;
			while(j<n){
				 if((j==0 || j==n-1) || (i==0 || i==n-1 )){
					 System.out.print("*");
				 }else {
					 System.out.print(" ");
				 }j++;
				
			}System.out.println();
			i++;
		}
	}
	
	public static void jumpingpattern(int n) {
		int mid=n/2;
		int k=0;
		boolean isRev =true;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((j==0 || j==n-1) || (i==0 || i==n-1 ) || (i==mid)) {
					System.out.print("*");
				}else if( k==j  ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}if(k==mid-1){
				isRev = false;
			}else {
				if(k==0) {
					isRev = true;
				}
			}
			if(isRev) {
				k++;
			}else {
				k--;
			}
			System.out.println();
		}
	}
	
	public static void jumpingline(int  n) {
		int w=40,h=9;
		int jumpWidth = h-3;
		int jumpmid = jumpWidth/2;
		
		if(h%2==1) {
			
			int midH =(h/2);
			int jumpLeft =0,jumpRight = jumpWidth;
			
			for(int i=0;i<h;i++) {
				for(int j=0;j<w;j++) {
					int printLocaton = j%jumpWidth;
					
					// midline
					
					if(midH==i) {
						System.out.print(".");
					}
					else if(printLocaton == jumpLeft || printLocaton == jumpRight) {
						System.out.print("*");
					}
					else if(i==0 || j ==0 || i==h-1 || j== w-1) {
						System.out.print(".");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println("");
				if(jumpmid > (i%h) && midH !=i) {
					jumpLeft++;
					jumpRight--;
				}
				else if(midH !=i && (midH -1) !=i) {
					jumpLeft--;
					jumpRight++;
				}
			}
		}else {
			System.out.println("Its a even number");
		}
	}
	

	 
	 public static void main(String[] args) {
		 int n=17;
		 
//		int i=0;int j=0;
//		 boxpattern(n);
//		 System.out.println();
//		 whilepattern(n);
//		 System.out.println();
//		 pattern(n);
//		 System.out.println();
//		 recurse(n,i,j);
//		jumpingpattern(n);
		 jumpingline(n);
		 
	 }
}
