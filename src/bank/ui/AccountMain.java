package bank.ui;

import bank.entity.Account;

public class AccountMain {
	public static void main(String[] args) {
		Account store[] = new Account[2];
		store[0] = new Account(1, "Sam", 2000);
		store[1] = new Account(2, "Ram", 4000);
		AccountMain a1 = new AccountMain();
		a1.print(store);
		System.out.println("After adding balance:");
		store[0].addBalance(200);
		store[1].addBalance(300);
		a1.print(store);
		System.out.println("After transferring from ac1 to ac2");
		store[0].transferAmount(store[1], 200);
		a1.print(store);
	}

	public void print(Account emp[])

	{
		for (int i = 0; i < 2; i++) {
			System.out.println("ID= " + emp[i].getId());
			System.out.println("NAME= " + emp[i].getName());
			System.out.println("BALANCE= " + emp[i].getBalance());
		}
	}
}
