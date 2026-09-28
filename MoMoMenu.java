import java.util.Scanner; 

public class MoMoMenu{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter code: ");
        String code = input.nextLine();

        if (code.equals("*182#")) { 
            System.out.println("Welcome to MTN MoMo");

            
            for (int i = 1; i <= 4; i++) {
                if (i == 1) System.out.println("1. Send Money");
                if (i == 2) System.out.println("2. Withdraw Cash");
                if (i == 3) System.out.println("3. Check Balance");
                if (i == 4) System.out.println("4. Buy Airtime");
            }
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            input.nextLine(); 

            System.out.print("Enter you PIN: ");
            int enteredPin = input.nextInt();
            int correctPin = 28222;

            if(enteredPin != correctPin){
            System.out.println("wrong PIN! Transaction cancelled. ");
             } else

            if (choice == 1) {
                System.out.print("Enter recipient number: ");
                String number = input.nextLine();

                System.out.print("Enter amount: ");
                double amount = input.nextDouble();

                System.out.print("Enter PIN: ");
                int pin = input.nextInt();

                System.out.println("\n********* Transaction Summary **********");
                System.out.println("Option: Send Money");
                System.out.println("Recipient: " + number);
                System.out.println("Amount: " + amount);
                System.out.println("PIN: " + pin);
                System.out.println(" Money sent successfully!");
            }
            else if (choice == 2) {
                System.out.print("Enter agent code: ");
                String agent = input.nextLine();

                System.out.print("Enter amount: ");
                double amount = input.nextDouble();

                System.out.print("Enter PIN: ");
                int pin = input.nextInt();

                System.out.println("\n********** Transaction Summary ***********");
                System.out.println("Option: Withdraw Cash");
                System.out.println("Agent Code: " + agent);
                System.out.println("Amount: " + amount);
                System.out.println("PIN: " + pin);
                System.out.println(" Cash withdrawn!");
            }
            else if (choice == 3) {
                System.out.print("Enter PIN: ");
                int pin = input.nextInt();

                System.out.println("\n********* Transaction Summary **********");
                System.out.println("Option: Check Balance");
                System.out.println("PIN: " + pin);
                System.out.println("Your balance is: 50,000 RWF");
            }
            else if (choice == 4) {
                System.out.print("Enter amount of airtime: ");
                double airtime = input.nextDouble();

                System.out.print("Enter PIN: ");
                int pin = input.nextInt();

                System.out.println("\n*********** Transaction Summary ***********");
                System.out.println("Option: Buy Airtime");
                System.out.println("Airtime: " + airtime);
                System.out.println("PIN: " + pin);
                System.out.println(" Airtime purchased!");
            }
            else if (choice == 0) {
                System.out.println("Thank you for using MTN MoMo!");
            }
            else {
                System.out.println(" Invalid Choice");
            }
        }
         else {
            System.out.println(" Wrong code entered. Please dial *182#");
        }
        }
    }











// public class Momo {
//     public static void main(String[] args){
//         String prompt = *182#
//          int choice = 1; 

//          if (choice ==1) {
//             System.out.println("Send Money selected");
//             System.out.println("Enter recipient number: 0787323838");
//             System.out.println("Enter amount: 2000");
//             System.out.println("Enter PIN: 9090");
//             System.out.println(" Money sent!");
//          }
//          else if (choice == 2) {
//             System.out.println("Withdraw cash selected");
//          }
//          else {
//             System.out.println("Invalid Choice");
//          }
        
    //  for (int choice = 1; choice <= 4; choice++) {
    //     if (choice == 2) {
    //             System.out.println("Send Money ");
    //         }
    //         else if (choice == 2) {
    //             System.out.println("Withdraw Cash ");
    //         }
    //         else if (choice == 3) {
    //             System.out.println("Check Balance ");
    //         }
    //         else if (choice == 4) {
    //             System.out.println("Buy Airtime ");
    //         }
    //  }


        // Scanner input = new Scanner(System.in);
        // int choice = -1;

        // while (choice != 0) {   // loop until user chooses 0 (Exit)
        //     System.out.println("Welcome to MTN MoMo");
        //     System.out.println("1. Send Money");
        //     System.out.println("2. Withdraw Cash");
        //     System.out.println("3. Check Balance");
        //     System.out.println("4. Buy Airtime");
        //     System.out.println("0. Exit");
        //     System.out.print("Enter your choice: ");

        //     choice = input.nextInt();

        //     if (choice == 1) {
        //         System.out.println("Enter recipient number:");
        //         String number = input.next();
        //         System.out.println("Enter amount:");
        //         double amount = input.nextDouble();
        //         System.out.println("Enter PIN:");
        //         int pin = input.nextInt();
        //         System.out.println(" Money sent to " + number + " Amount: " + amount);
        //     }
        //     else if (choice == 2) {
        //         System.out.println("Enter agent code:");
        //         String agent = input.next();
        //         System.out.println("Enter amount:");
        //         double amount = input.nextDouble();
        //         System.out.println("Enter PIN:");
        //         int pin = input.nextInt();
        //         System.out.println(" Cash withdrawn from agent " + agent);
        //     }
        //     else if (choice == 3) {
        //         System.out.println("Enter PIN:");
        //         int pin = input.nextInt();
        //         System.out.println( "Your balance is: 50,000 RWF");
        //     }
        //     else if (choice == 4) {
        //         System.out.println("Enter amount of airtime:");
        //         double airtime = input.nextDouble();
        //         System.out.println("Enter PIN:");
        //         int pin = input.nextInt();
        //         System.out.println(" Airtime purchased: " + airtime + " RWF");
        //     }
        //     else if (choice == 0) {
        //         System.out.println("Thank you for using MTN MoMo!");
        //     }
        //     else {
        //         System.out.println(" Invalid choice, try again.");
        //     }

        //     System.out.println(); // blank line for readability
        // }
    






