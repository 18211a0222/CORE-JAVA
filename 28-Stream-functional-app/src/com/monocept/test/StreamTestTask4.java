package com.monocept.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

import com.monocept.model.Account;

public class StreamTestTask4 {

	public static void main(String[] args) {

		Account a1 = new Account(1, "rameshu", 100);
		Account a2 = new Account(2, "sam", 500);
		Account a3 = new Account(3, "sureshu", 300);
		Account a4 = new Account(4, "tom", 600);
		Account a5 = new Account(5, "ravin", 10);
		Account accounts[] = { a1, a2, a3, a4, a5 };

		System.out.println("Account details of account with minimum Balance\n");
		System.out.println(Arrays.stream(accounts).min(Comparator.comparing(Account::getBalance)).get());
		
		System.out.println("\nAccount details of account with maximum Balance\n");
		System.out.println(Arrays.stream(accounts).max(Comparator.comparingDouble(Account :: getBalance)).get());
		
		System.out.println("\nnames greater than 6 characters\n");
		Arrays.stream(accounts).filter(n -> n.getName().length() > 6).forEach(n -> System.out.println(n.getName()));
		
		System.out.println("\ntotal of balance of all accounts\r\n");
		System.out.println(Arrays.stream(accounts).mapToDouble(n -> n.getBalance()).sum());
		System.out.println(Arrays.stream(accounts).mapToDouble(Account::getBalance).sum());
		System.out.println(Arrays.stream(accounts).collect(Collectors.summingDouble(n -> n.getBalance())));

		System.out.println("\ncount of accounts with balance greater than 500\n");
		System.out.println(Arrays.stream(accounts).filter(n -> n.getBalance() >= 500).count());

	}

}
