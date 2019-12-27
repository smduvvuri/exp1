package Calculator;

public class EmployeeMain {
	public static void main(String[] args)
    {
		Employee store[]=new Employee[3];
	    store[0]=new Employee(1,"Sam",8000);
	    Manager m=new Manager(2,"Yan", 9000);
	    store[1]=m;
	    m.addManagedEmployee(store[0]);
	    store[2]=new Employee(3,"Tan",7000);
	    m.addManagedEmployee(store[2]);
	    EmployeeMain m1=new EmployeeMain();
	    m1.print(store);
	}

	
	public void print(Employee[] employees)
	{
		for(Employee e: employees)
		{
			System.out.println(e.getName()+" "+e.getId()+" "+e.getSalary());
			boolean isManager=e instanceof Manager;
			if(isManager) {
				Manager m= (Manager) e;
				System.out.println("Managed Employees by"+" "+e.getName());
				Employee[] managedemployees =m.getManagedEmployees();
				for(Employee managed: managedemployees)
				{
					if(managed!=null)
						{
						System.out.println(managed.getName()+" "+managed.getSalary());
						}
						}
				System.out.println("Remaining Employees:");
	
	}}}}
	