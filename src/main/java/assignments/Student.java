package assignments;

import java.util.Scanner;

public class Student {
	String f_Name;
	String l_Name;
	int stud_Id;
	String email;
	int[] no_courses;
	String course_name;
	
	
	public Student(String vfirstname,String vlastname,int vstudid,String vmail,int[] nocourses,String coursename) {
		
		System.out.println("inside constructor");
		f_Name		=vfirstname;
		l_Name		=vlastname;
		stud_Id		=vstudid;
		email		=vmail;
		no_courses	=nocourses;
		course_name	=coursename;
		
		System.out.println(f_Name +l_Name +stud_Id +email +nocourses +coursename);
	}
	
	public void display() {
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of students");
		int no_stud=sc.nextInt();
		int[] noofstud=new int[no_stud];
		
		//System.out.println("no of studdddd--"+noofstud.length);
		
		for(int i=0;i<noofstud.length;i++) {
			//System.out.println("i vallll-->"+i);
			System.out.println("Enter the student id of "+(i+1)+"student");
			int vstudid=sc.nextInt();
			
			System.out.println("Enter the first name of "+(i+1)+"student");
			String vfirstname=sc.next();
			
			System.out.println("Enter the last name of "+(i+1)+"student");
			String vlastname=sc.next();
			
			System.out.println("Enter the email of "+(i+1)+"student");
			String vmail=sc.next();
			
			System.out.println("Enter the no of courses for "+(i+1)+" student");
			int no_couses=sc.nextInt();
			
			for(int k=0;k<no_couses;k++) {
				System.out.println("Enter course name "+(k+1));
				String coursename=sc.next();
				
				//Student std=new Student(vfirstname,vlastname,vstudid,vmail,no_couses,coursename);
				
				//Student std=new Student("gayathri","ddhd",100,"sssss",2,"ddd");
				
				Student aaa=new Student(vfirstname, vlastname, vstudid, vmail, noofstud, coursename);
			}
				
				//System.out.println("hhhhhhhhhhhhhhhhhhhhhhh");
				
			}
			
			
			
			
		}
	}


