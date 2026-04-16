import java.time.LocalDate;

public class Income extends Transaction {
    String source;
    public  Income(long id, double amount, LocalDate date, String description,String source){
        super(id,amount,date,description);
        this.source=source;
    }
    public String getSource(){
        return source;
    }

    @Override
    public void displayTransaction() {
        super.displayTransaction();
        System.out.println("Source"+source);
    }
}
