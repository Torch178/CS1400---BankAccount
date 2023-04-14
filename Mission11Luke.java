import java.util.Scanner;
import java.util.InputMismatchException;


public class Mission11Luke
{

   public static void main (String[] args)
   {
      //Initialize the variables
      String name = "";
      int userEntry = 0;
      double deposit = 0;
      double withdrawal = 0;
      
      //Create the instances
      Scanner in = new Scanner(System.in);
      
      
      /**************************/
      //Welcome the user
      System.out.println("Welcome to the Bank of Christian!");
      
      //Ask user for name and construct the bank account
      System.out.println("Please enter your name to create an account: ");
      name = in.nextLine();
      
      if (name.equalsIgnoreCase("Flanders"))
      {
         System.out.println("Stupid Flanders");
      }
      
      BankAccount b1 = new BankAccount(name,12345);
      
      
      //Bank account options
      do
      {
      
         try
         {
         
            //present options to user
            System.out.println("Press 1 to make a deposit\nPress 2 to make a withdrawal\nPress 3 to get account information\nPress 4 to quit\n");
            
            //Flush the buffer
            
            //collect user input
            userEntry = in.nextInt();
            
            if (userEntry == 1)
            {
               System.out.println("Please enter the amount to deposit: ");
               deposit = in.nextDouble();
                 
               b1.deposit (deposit);          
   
            }//end of #1
            
            else if (userEntry == 2)
            {
               System.out.println("Please enter the amount to withdrawal: ");
               withdrawal = in.nextDouble();
               
               b1.withdraw (withdrawal);
            
            }//end of #2
            
            else if (userEntry == 3)
            {
               System.out.println("Name: " + b1.getName());
               System.out.println("Account #: " + b1.getAccountNum());
               System.out.println("Balance: " + b1.getBalance() + "\n");
               
            }//end of #3
            
            else if (userEntry == 4)
            {
               System.out.println("Thank you for your business!");
               
            }//end of #4
            
            else
            {
               System.out.println("Invalid choice, please try again.\n");
               
            }//end of else
         
         
         }//end of try
         
         catch(InputMismatchException e)
         {
            System.out.println("Invalid entry. Must be numerical, cannot include: ");
            System.out.println("Symbols (@, #, $, %, etc.) \nOR Letters (aA, bB, cC, etc.)\nPlease try again.\n");
            in.nextLine();  
         }//end of catch
      
      }while(userEntry != 4);
   
   }//end of main method
   
}//end of program