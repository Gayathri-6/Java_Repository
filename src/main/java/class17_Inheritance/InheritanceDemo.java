package class17_Inheritance;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class InheritanceDemo {

	public static void main(String[] args) {
		
/*scenario one--child class object and child class reference
 * 
 */
		System.out.println("**************1****************");
		HSBC hsbc=new HSBC();
		System.out.println("current interest rate--"+hsbc.int_rate);
		//hsbc.super.variable goes to parent
		hsbc.deposit();
		hsbc.withdraw();
		
		
/*scenario two--base class object and base class reference
 * 
 */
		System.out.println("*************2*****************");
       RBI rbi=new RBI();
       System.out.println("interest rate--"+rbi.int_rate);
       rbi.deposit();
       
/*scenario three--base class object and child class reference
 */
 
       System.out.println("***************3***************");
		RBI rbinew=new HSBC();
		System.out.println(rbi.int_rate);
		rbinew.deposit();
		rbinew.hiii();
	
	
	/*scenario four--child class object and base class reference
	 * its invalid scenario
	 * 
	 * HSBC hsbs=new RBI();
	 */

	ArrayList arr=new ArrayList();
	//arr. can access all the method and variables of arraylist-->list-->collection
	
	List l1=new ArrayList();
	//l1.   can access all the method and variables of list-->collection
	
	Collection c1=new ArrayList();
	//c1.  can access all the method and variables of collection
	
	Object obj1=new ArrayList();
	//obj1. can access all the default method and variables of object
}
}
