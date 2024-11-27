package class8_arrays;

public class Array_sample {

	public static void main(String[] args) {
		int arr[];
		arr=new int[9];
		int arr1[]=new int[9];
		int arr2[][]=new int[2][4];
		
		System.out.println(arr.length);
		System.out.println(arr1.length);
		System.out.println(arr2.length);
		System.out.println(arr.length==arr1.length);
		
		System.out.println(10+30/10-5*2);
		
		int[] arr4=new int[5];
		arr4[0]= 90;
		arr4[1]= 66;
		arr4[2]= 44;
		arr4[3]= 3;
		arr4[4]= 80;
System.out.println(arr4[4]);
arr4[4]=6000;
System.out.println(arr4[4]);

String[] arr5=new String[5];
arr5[0]= "ttrttr";
arr5[1]= "ddd";
arr5[2]= "sss";
arr5[3]= "aaa";
arr5[4]= "uu";
System.out.println(arr5[4]);
arr5[4]="hi Gayathri";
System.out.println(arr5[4]);
	}

}
