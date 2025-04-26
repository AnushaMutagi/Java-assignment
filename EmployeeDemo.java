package pack1;

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.id=1;
		e1.name = "Raju";
		e1.qualif = "BE";
        e1.swim();
        System.out.println("The Name is"+e1.name);
        System.out.println("The id is" +e1.id);
        Employee e2=new Employee();
	}

}
