package FlatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
	
	String name;
	int sid;
	char grade;
	
	public Student(String name, int sid, char grade) {
		super();
		this.name = name;
		this.sid = sid;
		this.grade = grade;
	}
	
	
}
public class Demo3 {

	public static void main(String[] args) {
		
		List<Student>studentList1=new ArrayList<Student>();
		studentList1.add(new Student("Raes", 101, 'A') );
		studentList1.add(new Student("Rohan", 102, 'B'));
		studentList1.add(new Student("Bhais",778, 'C'));
		
		
		
		List<Student>studentList2=new ArrayList<Student>();
		studentList2.add(new Student("Hussy", 450, 'J'));
		studentList2.add(new Student("Stark", 445, 'D'));
		studentList2.add(new Student("Leon", 798, 'K'));
		
		List<List<Student>>finalStudentList=Arrays.asList(studentList1,studentList2);
		
		System.out.println("Directly Want to print:: "+finalStudentList);
		
	/*	//Before Java 8
		System.out.println("Before Java8::");
		
		for(List<Student> listStud:finalStudentList) {
			
			for(Student stu:listStud) {
				
				System.out.print(stu.name+" ");
				
			}
		}*/
		
		//By Using Java8
		
		//getting names only
		List<String>names=finalStudentList.stream().flatMap(sList->sList.stream()).map(s->s.name).collect(Collectors.toList());

		System.out.println("Names By Java 8");
	System.out.println(names);
	
	//getting sid only
	
	List<Integer>sids=finalStudentList.stream().flatMap(ss->ss.stream()).map(si->si.sid).collect(Collectors.toList());

	
	System.out.println("Sid's By Java 8");
	System.out.println(sids);
	
	
	
	//get grade of enacg student using flatMAp
	
		List<Character>grades=finalStudentList.stream().flatMap(sg->sg.stream()).map(m->m.grade).collect(Collectors.toList());

		System.out.println("Grades BY Java8::");
		
		System.out.println(grades);
		
	}
	
	

}
