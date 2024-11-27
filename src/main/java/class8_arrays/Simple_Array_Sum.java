package class8_arrays;

public class Simple_Array_Sum {

	public static void main(String[] args) {
		int[] a= {6,2,3,4,5};
		int num=0;
		int sum;
		//System.out.println("array length--"+a.length);
		for(int i=0;i<a.length;i++)
			//a.length;i++) 
			{
			
			//System.out.println("array length--"+a[i]);
			
			 sum=num+a[i];
			//System.out.println("array length--"+sum);
			num=sum;
			//System.out.println("array length--"+sum);
		}
		System.out.println("array length--"+num);
	}

}
