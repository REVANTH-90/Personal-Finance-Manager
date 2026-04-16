import java.time.LocalDate;
import java.util.*;
import java.io.*;
public class Transaction {
    long id;
    double amount;
    LocalDate date;
    String description;
    Transaction(long id,double amount, LocalDate date, String description){
        this.id=id;
        this.amount=amount;
        this.date=date;
        this.description=description;
    }
 long getId(){
        return id;
 }
 double getAmount(){
        return amount;
 }
 LocalDate getDate(){
        return date;
 }
 String getDescription(){
        return description;
 }
 void displayTransaction(){
        System.out.println("Blah blahh");
 }
}
