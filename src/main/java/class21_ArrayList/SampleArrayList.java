package class21_ArrayList;

import java.util.ArrayList;

public class SampleArrayList {

	public static void main(String[] args) {

ArrayList arr=new ArrayList();
arr.add(100);
arr.add("Gayathri");
arr.add('t');
arr.add(900);
System.out.println(arr);

System.out.println(arr.getFirst());
System.out.println(arr.getLast());
System.out.println(arr.get(1)+" is best");
arr.set(1,"Gayathri Lakmali");
System.out.println(arr);
arr.removeFirst();
System.out.println(arr);
arr.add(0, 5000);

System.out.println(arr);
arr.set(0, 5555);
System.out.println(arr);
	}

}
