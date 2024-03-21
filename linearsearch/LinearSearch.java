package linearsearch;

public class LinearSearch {

	
	public static void linearSearch(int[] arr1) {
		
		 int a=9;
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]==a) {
				System.out.println("Linear search : "+arr1[i]);
			}
		}
	
	}
	public static void binarySearch(int[] arr1) {
		int n=8;
		int x=0;
		int y=arr1.length-1;
		int loops=0;
		
		while(x<=y) {
			loops++;
			int mid = (x+y)/2;
			if(arr1[mid]==n) {
				mid=n;
				System.out.println("Binary search : "+mid);
				break;
			}
			else if(arr1[mid]<n) {
				x=mid+1;
			}
			else if(arr1[mid]>n) {
				y=mid-1;
			}
		}System.out.println("loops execution :"+loops);	
	}
	
	public static void ternary(int[] arr1) {
	
		int x=0;
		int y=(arr1.length-1)/2;
		int z=arr1.length;
		int n=5;
		int y1=y;
		int loops=0;
		while(x<=z) {
			loops++;
			int mid_1=(x+y)/2;
			int mid_2=(y1+z)/2;
			
			if(arr1[mid_1]==n||arr1[mid_2]==n) {
				System.out.println(mid_1);
				break;
			}
			else if(n<arr1[mid_1]||n<arr1[mid_2]) {
				x=mid_1 + 1;
				z=mid_2-1;
			}
			else if(n>arr1[mid_1]||n>arr1[mid_2]) {
				y=mid_1-1;
				y1=mid_2+1;
			}
		}System.out.println("loops execution : "+loops);
		
	} 
	
	public static void recurse(int[] arr1) {
		
		int x=0;int i=0;int j =arr1.length-1;
		int y=(arr1.length-1)/2;
		int z=arr1.length;
		int n=5;
		int ans=0;
		int y1=y;
		if(i<=j) {
			int mid_1=(x+y)/2;
			int mid_2=(y1+z)/2;
			
			if(arr1[mid_1]==n||arr1[mid_2]==n) {
				mid_1=ans;
				mid_2=ans;
				System.out.println(ans);
			}
			else if(n<arr1[mid_1]||n<arr1[mid_2]) {
				x=mid_1 + 1;
				z=mid_2-1;
			}
			else if(n>arr1[mid_1]||n>arr1[mid_2]) {
				y=mid_1-1;
				y1=mid_2+1;
			}i++;
			
		}recurse(arr1);
	}

	public static int binaryRec(int[] arr1,int x,int y,int mid,int i) {
		
		int n=8;
		int j=arr1.length;
		 mid = (x+y)/2;
			if(i>j) {
				return -1;
			}
			if(arr1[mid]==n) {
				mid=n;
				System.out.println(mid);
				return -1;
			}
			else if(arr1[mid]<n) {
				x=mid+1;
			}
			else if(arr1[mid]>n) {
				y=mid-1;
			}	
		return binaryRec(arr1,x,y,mid,++i);
	}


	public static void main(String[] args) {
		
		int[] arr1= {1,2,3,4,5,6,7,8,9,10,22,33,44,55,66,77,88};
		int i=0;
		int x=0;
		int mid=0;
		 int y=arr1.length-1;
		//binarySearch(arr1);
		//linearSearch(arr1);
		//ternary(arr1);
		//recurse(arr1);
		binaryRec(arr1,x,y,mid,i);
	}
}
