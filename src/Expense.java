import java.time.LocalDate;

public class Expense extends Transaction {
    String category;
    Expense(long id,  double amount,LocalDate date, String description,String category){
        super(id,amount,date,description);
        this.category=category;
    }
    String getCategory(){
        return category;
    }

    @Override
    public  void displayTransaction() {
        super.displayTransaction();
        System.out.println("Category"+category);
    }
}
