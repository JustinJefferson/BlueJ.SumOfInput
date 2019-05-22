import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner userIn = new Scanner(System.in); // User Input Object
    long sum = 0;                            // sum 
    int counter = 1;                         // counter
    
    //Get User input
    System.out.print("Pick an integer: ");
    int num = userIn.nextInt();

    // Determine whether to count up or down
    if (num > 1) {

      while(counter <= num) {

        sum += counter;
        counter++;

      }

    }
    else if (num < 1) {

      while(counter >= num) {

        sum += counter;
        counter--;

      }

    } 
    else {

      sum = 1;
    }

    //Print Results
    System.out.println("The sum of the numbers between 1 and " + num + " is " + sum + ".");


  }
}