package Test;
import Test.Student;
import java.util.*;
import java.util.HashSet;

public class StudentMain {


	public static void main(String[] args) {
		StudentMain stud = new StudentMain();
		stud.runApp();
}
	 void runApp() {
		Student student1 = new Student("123",12);
		Student student2 = new Student("124",21);
		Student student3 = new Student("125",26);
		Student student4 = new Student("126",15);
		
				Set <Student> set = new HashSet<>();
				
				set.add(student1);
				set.add(student2);
				set.add(student3);
				set.add(student4);
				
				for(Student i:set) {
					System.out.println("age is  "+ i.getAge()+"   " +" roll no. "+ i.getRollno());		
				}
		
				boolean issame = student1==student2;
				boolean isEquals = student1.equals(student2);
				System.out.println(issame);
				System.out.println(isEquals);
				
				
				/*
				
				int j = student2.age;
				
				if(j>=21) {
					System.out.println("age is "+ j);
				}else {
					System.out.println("less than 21");
				}
					
					/*/
		}
			
	}

