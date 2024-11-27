package class8_arrays;

public class Array_Get_Average {

	public static void main(String[] args) {
		int a[]= {90,50,1};
		int sum=0;
		int num=0;
		//double avg1;
		for(int i=0;i<a.length;i++) {
			
			sum=a[i]+num;
			num=sum;
		   // System.out.println("sum--"+num);
		   double avg1= (double)num/a.length;
		   System.out.println("avg--"+avg1);
		}
		 
	}

}
