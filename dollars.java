///Write a program that calculates and displays the conversion of an entered number of dollars
// into currency denominations-20s, 10s, 5s, and 1s. Save the program as Dollars.java.
/**
   In the context of ATMs, "denomination" refers to the types of banknotes (like $10, $20, $50) that the machine dispenses when you withdraw cash
   
   **/
  import java.util.Scanner;

  public class dollars {
      public static void main(String[] args) {
          Scanner ASA = new Scanner(System.in);
          
          // Prompt the user to enter the dollar amount
          System.out.print("Enter the amount in dollars: ");
          int amount = ASA.nextInt();
          
          // Calculate the number of each denomination
          int twenties = amount / 20;
          amount %= 20;
          
          int tens = amount / 10;
          amount %= 10;
          
          int fives = amount / 5;
          amount %= 5;
          
          int ones = amount;
          
          // Display the results
          System.out.println("Currency denominations:");
          System.out.println("$20 bills: " + twenties);
          System.out.println("$10 bills: " + tens);
          System.out.println("$5 bills: " + fives);
          System.out.println("$1 bills: " + ones);
          
          ASA.close();
  }
  }
