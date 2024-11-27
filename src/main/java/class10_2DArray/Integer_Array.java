package class10_2DArray;

public class Integer_Array {

	public static void main(String[] args) {
		int arr[]= {2,3,56,78,43,22};
		
		for(int i=0;i<arr.length;i++) {
			
			int val=arr[i];
			System.out.println("val is--"+val);
		 if(arr[i]%2==0) {
			 System.out.println("Even--"+arr[i]);}
			 else { 
				 System.out.println("Odd--"+arr[i]);
		 }
		 
			
		}

	}

}
