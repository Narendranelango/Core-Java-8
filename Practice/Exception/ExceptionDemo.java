import java.io.*;

import com.cg.NotEnoughMoneyException;

class BankAccount {
	private int balance = 100;

	public void withdraw(int amt) throws NotEnoughMoneyException {
		if (amt < balance) {
			balance = balance - amt;
			System.out.println(balance);
			}
		else {
			NotEnoughMoneyException exp = new NotEnoughMoneyException("No enough money");
			throw exp;
		}
	}
}

public class ExceptionDemo {
	public void method1(int n) {
		System.out.println("Inside method1");
		System.out.println("Going to divide");
		try {
			int result = 10 / n;
		} catch (ArithmeticException e)// first we need to declare the child class exception
		{
			System.out.println("Arithmetic exc");
		} catch (Exception e)// Enters to this catch block when another exception occures
		{
			System.out.println("Arithmetic exc11111111111111");
		} finally {
			System.out.println("Finally always executes");
		}
		System.out.println("After division");
		System.out.println("Exiting method1");
	}

	public void method2() throws FileNotFoundException {
		System.out.println("Inside method2");// try {
		FileInputStream fis = new FileInputStream("C:\\Java8\\abca.txt");
		System.out.println("File open");
		//
//		catch(FileNotFoundException e) {
//			System.out.println(e.getMessage());
//		}
//		
		System.out.println("Exiting method2");
	}

	public void method3() {
		System.out.println("Inside method3");
		BankAccount acc = new BankAccount();

		try {
			acc.withdraw(20);
		} catch (NotEnoughMoneyException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Exiting method3");
	}

	public static void main(String[] args) {
		System.out.println("Inside main");
		ExceptionDemo demo = new ExceptionDemo();
		int x = 0;
		System.out.println("Calling method 1");
		demo.method3();
//		try {
//			//demo.method2();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println("After calling method1");
		System.out.println("Back to the main");
		System.out.println("Exiting main");
	}
}