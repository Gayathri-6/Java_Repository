package class8_arrays;

public class Copy_Array {

	public static void main(String[] args) {
		int a[]= {2,4,9};
		int num;
        for(int i=0;i<a.length;i++) {
        	
        	num=a[i];
        	///System.out.println("num--"+num);
        	int b[]= {a.length};
        	///System.out.println("length--"+a.length);
        	for(int q=0;q<b.length;q++) {
        		b[q]=num;
        		System.out.println("bbb--"+b[q]);                                                                                
        	}
        	
        }
	}

}
