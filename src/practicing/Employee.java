package practicing;

public class Employee {
	
	public int eno;
	
	public String ename;

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public Employee(int eno,String ename) {
		this.eno=eno;
		this.ename=ename;
	}

}
