package class12_oop;

public class Emp {
	
	
	int Emp_Id;
	String Emp_Name;
	int Emp_Phone;
	boolean Emp_Permanant;
	

	public static void main(String[] args) {

       Emp Gayathri=new Emp();
       Emp Shaveen=new Emp();
       Emp Aveesh=new Emp();

       System.out.println(Gayathri.Emp_Id);
       System.out.println(Gayathri.Emp_Name);
       System.out.println(Gayathri.Emp_Phone);
       System.out.println(Gayathri.Emp_Permanant);
       System.out.println(Shaveen.Emp_Id);
       
       Gayathri.Emp_Id=100;
       Gayathri.Emp_Name="Gayathri Lakmali";
       Gayathri.Emp_Permanant=true;
       Gayathri.Emp_Phone=212121;
       
       System.out.println(Gayathri.Emp_Id);
       System.out.println(Gayathri.Emp_Name);
       System.out.println(Gayathri.Emp_Phone);
       System.out.println(Gayathri.Emp_Permanant);
       
       Shaveen.Emp_Id=300;
       Aveesh.Emp_Id=900;
       System.out.println(Shaveen.Emp_Id);
       System.out.println(Aveesh.Emp_Id);

	}

}
