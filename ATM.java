package learning;

import java.util.Scanner;

public class ATM {
	float balance;
	int pin=5476;
	
	public void checkPin() {
		System.out.println("Enter your pin:");
		Scanner sc=new Scanner(System.in);
		int enterPin=sc.nextInt();
		if(enterPin==pin) {
			menu();
		}
		else {
			System.out.println("Enter valid pin");
		}
	}
	public void menu(){
		System.out.println("Enter your choice");
		System.out.println("1. Check A/C Balance");
		System.out.println("2. Withdraw Money");
		System.out.println("3. Deposit Money");
		System.out.println("4. Exit");
		Scanner sc=new Scanner(System.in);
		int otp=sc.nextInt();
		
		if(otp==1) {
			checkBalance();
		}
		else if(otp==2) {
			withDraw();
		}
		else if(otp==3) {
			deposit();
		}
		else if(otp==4){
			return;
		}
		else {
			System.out.println("Enter valid Choice");
		}
	}
	public void checkBalance() {
		System.out.println("Balance:"+ balance);
		menu();
	}
	public void withDraw() {
		System.out.println("Enter Amount to withdraw");
		Scanner sc=new Scanner(System.in);
		float amount=sc.nextFloat();
		if(amount>balance) {
			System.out.println("Insufficient balance");
		}
		else {
			balance=balance-amount;
			System.out.println(" Money Withdraw succesfully");
		}
		menu();
	}
	public void deposit() {
		System.out.println("Enter amount to deposit");
		Scanner sc = new Scanner(System.in);
		float amount=sc.nextFloat();
		balance=balance+amount;
		System.out.println("Money Deposit succesfully");
		menu();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM obj = new ATM();
		obj.checkPin();

	}

}
