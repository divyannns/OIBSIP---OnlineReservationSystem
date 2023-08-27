package oasisInfobyte;

import java.util.Scanner;

public class Atm {
	
	    public static void main(String[] args) {
	        int balance = 52000, withdraw, deposit;
	        Scanner sc = new Scanner(System.in);
	        while(true)
	        {
	            System.out.println("Automatic Atm Machine ");
	            System.out.println("choose 1 for Deposit Money");
	            System.out.println("choose 2 for Withdraw Money");
	            System.out.println("choose 3 for Account statement");
	            System.out.println("choose 4 for check Account balance");
	            System.out.println("choose 5 for quit");
	            System.out.println("choose the operation you want to perform: ");

	            int n= sc.nextInt();
	            switch (n)
	            {
	                case 1:
	                    System.out.print("Enter money to be withdrawn: ");
	                    withdraw = sc.nextInt();
	                    if (balance >= withdraw)
	                    {
	                        balance = balance - withdraw;
	                        System.out.println("Please collect your money: ");
	                    }
	                    else
	                    {
	                        System.out.println("Insufficient Balance");
	                    }
	                    System.out.println();
	                    break;

	                case 2:
	                    System.out.println("Enter money to be deposite: ");
	                    deposit = sc.nextInt();
	                    balance = balance+deposit;
	                    System.out.println("Your money has been successfully deposited");
	                    System.out.println();
	                    break;

	                case 3:
	                    System.out.println("Total balance: "+balance);
	                    System.out.println();
	                    break;

	                case 4:
	                    System.exit(0);

	            }

	        }
	    }
	}
