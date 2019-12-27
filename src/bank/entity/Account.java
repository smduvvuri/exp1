package bank.entity;

public class Account {

	public Account(int id, String name, double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void addBalance(double amount) {

		this.balance = this.balance + amount;

	}

	public void transferAmount(Account a, double amount) {
		this.balance = this.balance - amount;
		a.balance = a.balance + amount;
	}
}
