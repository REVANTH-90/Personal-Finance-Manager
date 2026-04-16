import java.time.LocalDate;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FinanceManager FM = new FinanceManager();
        while(true){
            System.out.println("\n===== Finance Manager =====");
            System.out.println("1.) Add Income");
            System.out.println("2.) Add Expense");
            System.out.println("3.) View Balance");
            System.out.println("4.) Save Transactions");
            System.out.println("5.) Exit ");
            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch(choice) {
                case 1:
                    System.out.print("Enter amount: ");
                    double incomeAmount = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter description: ");
                    String incomeDesc = sc.nextLine();
                    System.out.print("Enter Source :");
                    String source = sc.nextLine();
                    FM.addIncome(incomeAmount,LocalDate.now(), incomeDesc,source);
                    System.out.println("Income added!");
                    break;
                case 2:
                    System.out.print("Enter amount: ");
                    double expenseAmount=sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter description: ");
                    String expenseDesc = sc.nextLine();
                    System.out.println("Enter category: ");
                    String category = sc.nextLine();
                    FM.addExpense(expenseAmount, LocalDate.now(),expenseDesc,category);
                    System.out.println("Expense added");
                case 3:
                    System.out.println("Current Balance: "+FM.getBalance());
                    break;
                case 4:
                    FM.saveData();
                    System.out.println("Data saved Successfully!");
                    break;
                case 5:
                    System.out.println("Exiting....Thank you!");
                    sc.close();
                    return;
            }
        }
    }
}