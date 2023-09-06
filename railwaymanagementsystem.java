package railwaymnagementsystem;
import java.util.*;
import java.io.FileWriter;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.lang.Thread;

 class Train {

    private int trainNo;
    private String trainName;
    private int adultSeats;
    private int childSeats;

    Train() {
    }

    Train(int trainNo, String trainName, int adultSeats, int childSeats) {
        this.trainNo = trainNo;
        this.trainName = trainName;
        this.adultSeats = adultSeats;
        this.childSeats = childSeats;
    }
 public int setTrainNo(int TrainNo) {
        this.trainNo = TrainNo;
        return TrainNo;
    }
    
    public int getTrainNo() {
        return trainNo;
    }
     public String setTrainName(String TrainName) {
        this.trainName = TrainName;
        return TrainName;
    }

    public String getTrainName() {
        return trainName;
    }
    
  

    public int getAdultSeats() {
        return adultSeats;
    }

    public int setAdultSeats(int adultSeats) {
        this.adultSeats = adultSeats;
        return adultSeats;
    }

    public int getChildSeats() {
        return childSeats;
    }

    public void setChildSeats(int childSeats) {
        this.childSeats = childSeats;
    }
}

 class Passenger {

    private String passengerNo;
    private String name;
    private String age;
    private String address;
    boolean cancelTicket;
    boolean displayTicket;

    ArrayList<Ticket> ticketList = new ArrayList<Ticket>(100);

    Passenger() {
    }

    Passenger(String passengerNo, String name, String age, String address) {
        this.passengerNo = passengerNo;
        this.name = name;
        this.age = age;
        this.address = address;

    }
    
    

    public String getPassengerNo() {
        return passengerNo;
    }

    public void setPassengerNo(String passengerNo) {
        this.passengerNo = passengerNo;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public String getAge() {
        return age;
    }

    public String setAge(String age) {
        this.age = age;
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String setAddress(String address) {
        this.address = address;
        return address;
    }

    public void addTicket(Ticket t) {
      ticketList.add(t);
      

    }

   public void removeTicket(Ticket t) {
       for (int i = 0; i< ticketList.size(); i++) {
            if(ticketList.get(i)== t){
                ticketList.remove(i);
            }
        }          
           
   }

}

class Ticket extends Passenger {

    public String Train_Classes = "First Class";
    public String TicketType;
    public String Srearch;
    public String Filter;
    int Ticket_price = 150;

    int no_Of_tickets = 0;

   

    
    
    public String TrainClasses(String Clssic, String Standard) {
        return Train_Classes;
    }

    public boolean payBill(boolean yes) {

        return yes;

    }

    public void giveReview() {
        if (no_Of_tickets >= 50) {
            System.out.println(" Good ");
        } else 
            System.out.println(" Bad ");
        
    }

    public String getFilter(){
        return ("Back Fornt page");
    }
    public int calcTax(){
        return Ticket_price * 2 ;
    }
    public int calcTotal(){
        
        return Ticket_price + Ticket_price * 2 ;
    }
}


class Admin {
   public String bookingStatus;
   private String CheckBookingId;
public int No_of_Ticket_sell =0;
   public String getBookingStatus(){
       return ("Book Status : "+" "+"Urgent delivery .");
   }
   private String viewTicketBooking(){
       if(No_of_Ticket_sell==5){
           System.out.println(" good"); 
       }
       else
           System.out.println(" bad");
      return   viewTicketBooking();
       
   }
   
}

class Payment extends Passenger{
    private String paymentID="1a452ck37";
    private String paymentType="Pay By biKash";
    public int totalPayment=100;
    public String getPayStatus(){
        return "Pay for rent";
    }
    public int getTotalPayment(){
        return totalPayment;
    }
    public String getPayID(){
        return paymentID;
    }
    public String getPayType(){
        return paymentType;
    }
}

interface RailwaySystem {
            
}

class Response implements RailwaySystem{
int Id;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

}


class Card extends Payment{
    private int cardNumber=1234567890;
    private String cardType="Credit Card";
    private String expireDate="13 january, 2025";
    public String authorized(){
        getPayID();
       
        getPayType();
        getTotalPayment();
        return ("Card number : "+cardNumber+ ","+" " +"Card Type : "  +cardType +" , "+" Card expire Date :" +expireDate);
    }

}

    class TimetableClass {

        public String getCurrentTime() {

            Date d = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("HH:M ");

            return "Current Time : " + sdf.format(d) + "minutes";

        }

        public String getCurrentDate() {

            Date d = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd ");

            return "Current Date: " + sdf.format(d) + (int) (Math.random() * 10);
        }

}   

abstract class bikash {
    
}

class Bikash extends Thread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            
            System.out.println( "Bikash number generate By Thread :"+"123456678");
            Tread.sleep(500);
        }
    }

}


    




   
         
      




