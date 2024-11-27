package class22_ListWithGenerics;

import java.util.ArrayList;

public class SampleGenerics {
	
	public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<String>();
	list.add("Harshan");
	list.add("Gayathri");
	list.add("Shaveen");
	list.add("Aveesh");
	list.add("Leon");
	System.out.println(list);
	
	String a=list.get(2);
	System.out.println(a);
	
	String b=list.remove(1);
	System.out.println(b);
	System.out.println(list);
}
}