package wipro.jee;

public class Employee extends Object{
	int eid;
	String ename;
	double salary;
 
    public Employee1() {
	   super();
    }

	public Employee(int eid, String ename, double salary) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.salary = salary;
    }
	public int getEid() {
		return this.eid;
	}
	public void seteid(int eid) {
		this.eid=eid;
		
	}
	public String getEname() {
		 return this.ename;
		 
	}
	public void setEname(String Ename) {
		this.ename=ename;
	}
	public double getSalary() {
		return this.salary;
	}
	public void setSalary() {
		this.salary=salary;
	}

	public static void main(String[] args) {
	   Employee e1= new Employee();
	   e1.seteid(1)
	   e1.setsalary(25000);
	}
	    System.out.println(e1.getsalary());
	    System.out.println(e1.geteid());
	

	}


