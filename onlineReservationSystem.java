package oasisInfobyte;

import java.util.Scanner;

public class onlineReservationSystem {
	
	 // initialize an array of 10 seats, all empty
	
	    private static boolean[] seats = new boolean[10]; 
	    
	    public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);

	        while (true) {

	            // show menu screen
	            System.out.println("\nPlease select an option:");
	            System.out.println("1. View Seat Map");
	            System.out.println("2. Reserve Seat");
	            System.out.println("3. Cancel Reservation");
	            System.out.println("4. Exit");

	            // get user input
	            int option = scanner.nextInt();

	            switch (option) {

	                case 1:
	                    viewSeatMap();
	                    break;

	                case 2:
	                    reserveSeat();
	                    break;

	                case 3:
	                    cancelReservation();
	                    break;

	                case 4:
	                	// exit the program
	                    System.exit(0); 

	                default:
	                    System.out.println("Invalid option!");
	            }
	        }
	    }

	    private static void viewSeatMap() {
	        System.out.println("\nCurrent Seat Map:");
	        for (int i = 0; i < seats.length; i++)
	        {
	            if (seats[i])
	            {
	            	 // print an "X" if the seat is reserved
	                System.out.print("X "); 
	               
	            }
	            else 
	            {
	            	 // print the seat number if it's empty
	                System.out.print((i + 1) + " ");
	            }
	        }
	        System.out.println();
	    }

	    private static void reserveSeat() {
	    	
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter seat number (1-10): ");
	        int seatNumber = scanner.nextInt();
	        if (seatNumber < 1 || seatNumber > 10) {
	            System.out.println("Invalid seat number!");
	        }
	        else if (seats[seatNumber - 1])
	        {
	            System.out.println("Seat already reserved!");
	        } 
	        else
	        {
	            seats[seatNumber - 1] = true; // reserved the seat
	            System.out.println("Seat reserved!");
	        }
	    }

	    private static void cancelReservation() {
	    	
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter seat number (1-10): ");
	        int seatNumber = scanner.nextInt();
	        if (seatNumber < 1 || seatNumber > 10) 
	        {
	            System.out.println("Invalid seat number!");
	        } 
	        else if (!seats[seatNumber - 1]) 
	        {
	            System.out.println("Seat not reserved!");
	        } 
	        else 
	        {
	            seats[seatNumber - 1] = false; // unreserved the seat
	            System.out.println("Reservation canceled!");
	        }
	    }
	}

