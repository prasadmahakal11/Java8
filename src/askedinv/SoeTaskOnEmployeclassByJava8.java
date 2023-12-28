package askedinv;
import java.util.*;
import java.util.stream.Collectors;

public class SoeTaskOnEmployeclassByJava8 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		List<Employee>empList=new ArrayList<Employee>();
		
		empList.add(new Employee("Abhi",30,"Male","IT"));
		empList.add(new Employee("Rahi",20,"Male","HR"));
		empList.add(new Employee("Asai",40,"Female","IT"));
		empList.add(new Employee("Mahi",10,"Male","HR"));
		
		//print  all depratment names only once
		empList.stream().map(Employee:: getDept).distinct().forEach(System.out::println);
		
		//print how many times the particluar dept is given to each employee
		//like IT-2,HR-2
		Map<String, Long> emp=empList.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()));
		
		System.out.println("Emp with Total Dept:: "+emp);
		
		//print the avg age of male an female
		Map<String,Double>ans=empList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));

		
		System.out.println("Emp with avg Gender:: "+ans);
	}

}
