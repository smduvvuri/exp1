package Calculator;

public class Employee {
	public Employee(int id, String name, double salary)
	{
	this.id=id;
	this.name=name;
	this.salary=salary;
	}
	
	private int id;
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	private String name;
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	private double salary;
	
	public double getSalary()
	{
		return salary;
	}
	public void setSalary(int salary)
	{
		this.salary=salary;
	}}

	
	