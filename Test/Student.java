package Test;

public class Student {

	String rollno;
	int age;
	
	Student(String rollno,int age){
		this.age=age;
		this.rollno=rollno;
		
	}

	
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj1) {
		if(this==obj1) {
			return true;
		}
		if(obj1==null || !(obj1 instanceof Student)){
			return false;
		}
		
		Student s =(Student)obj1;
		boolean isequal = this.age==s.age;
		return isequal;
	}

	@Override
	public int hashCode() {
		return age;
	}
}