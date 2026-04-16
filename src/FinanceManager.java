import java.time.LocalDate;
import java.util.*;
import java.io.*;
public class FinanceManager {
   private ArrayList<Transaction> transactions = new ArrayList<>();
   private HashMap<String,Double> categoryTotals = new HashMap<>();
   private long nextId=1;
   private long generateID(){
       return nextId++;
   }
   public void addIncome(double amount, LocalDate date,String description, String source){
       long id = generateID();
       Income income = new Income(id,amount,date,description,source);
       transactions.add(income);
   }
   public void addExpense(double amount, LocalDate date, String description,String category){
       long id = generateID();
       Expense expense = new Expense(id,amount,date,description, category);
       transactions.add(expense);
       if(categoryTotals.containsKey(category)){
           double oldTotal=categoryTotals.get(category);
           categoryTotals.put(category,oldTotal+amount);
       }else{
           categoryTotals.put(category,amount);
       }
   }
   public  double calculateTotalIncome(){
       double total =0;
       for(Transaction t:transactions){
           if(t instanceof Income){
               total+=t.getAmount();
           }
       }
       return total;
   }
    public double calculateTotalExpense() {

        double total = 0;

        for (Transaction t : transactions) {

            if (t instanceof Expense) {
                total += t.getAmount();
            }
        }

        return total;
    }

    public double getBalance() {
        return calculateTotalIncome() - calculateTotalExpense();
    }
    public void displayAllTransactions() {

        for (Transaction t : transactions) {
            t.displayTransaction();
            System.out.println("-------------------");
        }
    }
    public void displayCategorySummary() {

        for (String category : categoryTotals.keySet()) {

            double total = categoryTotals.get(category);

            System.out.println("Category: " + category +
                    " | Total: " + total);
        }
    }
    public void saveData(){
       FileManager fm = new FileManager();
       fm.saveTransactions(transactions);
    }

}
