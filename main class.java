package railwaymnagementsystem;


import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Formatter;
import java.util.Scanner;


public class MainClass {

    public static void main(String[] args) throws FileNotFoundException  {
        Scanner input = new Scanner(System.in);       
                
       try {
       
        File myobj = new File("C:\\Users\\ASUS\\Documents\\NetBeansProjectsp\\RailwayMnagementSystem\\Railway.txt");
        PrintStream output = new PrintStream(myobj);
        System.out.println("Successfully File is open.new Console is  "+myobj.getAbsolutePath());
        System.setOut(output);
        String str = "************RAILWAY MANAGEMENT SYSTEM************* ";
        System.out.println(str);
        System.out.println();

            
         Train ob = new Train();

         ob.setAdultSeats(5);
         ob.getAdultSeats();
         System.out.println("Number of Adult seats : " + " " + ob.getAdultSeats());
           

         System.out.println();

         ob.setTrainNo(202046789);
         System.out.println("Show the TrainNo :" + " " + ob.getTrainNo());

         System.out.println();

            ob.getChildSeats();
            ob.setChildSeats(2);  
            
          System.out.println("Show the Child Seats : " + " " + ob.getChildSeats());

          System.out.println();

            ob.getTrainName();
            ob.setTrainName("Bangladesh Railway");
          
          System.out.println("Show the Train Nmae :" + " " + ob.getTrainName());

          System.out.println();

            ob.getTrainNo();
            ob.setTrainNo(20548);
          
          System.out.println("Show the TrainNo. which we arrived : " + " " + ob.getTrainNo());

          System.out.println();
            

          Passenger ob2 = new Passenger();
          Ticket t1 = new Ticket();
          ob2.addTicket(t1);
          System.out.println("After add Ticket : " + " "+ ob2.ticketList.size());
            
          System.out.println();
            
          ob2.removeTicket(ob2.ticketList.get(0));
          System.out.println(" After cancel or remove Ticket : " + " "+ ob2.ticketList.size());
           
           System.out.println();
           
          ob2.setAddress("From : Dhaka" + "," + "To :  Rajshahi");
          ob2.getAddress();
          System.out.println("Show The location : " + " " + ob2.getAddress());
        
          System.out.println();

          ob2.setAge("34");
          ob2.getAge();
          
          System.out.println("Passenger age : " + " " + ob2.getAge());

          System.out.println();

          ob2.setName("Rafia");
          ob2.getName();
          
          System.out.println("Passenger Name : " + " " + ob2.getName());

          System.out.println();

          ob2.setPassengerNo("00034");
          ob2.getPassengerNo();
       
          System.out.println("Show the Admin PassengerNo. :"+" "+ ob2.getPassengerNo());
          System.out.println();

          
             
          ob2.setAddress("Dhaka");

          ob2.getAddress();
          System.out.println("See Current Address :" + " " + ob2.getAddress());
          System.out.println();

          ob2.getAge();
          ob2.setAge("20");
          System.out.println("Passenger Age : " + " " + ob2.getAge());
           
          System.out.println();

          ob2.setName("Sumaiya");
         
          ob2.getName();
          System.out.println("Show The Passenenger Name :" + " " + ob2.getName());
          System.out.println();

          Ticket ob3 = new Ticket();
         Passenger T = new Ticket();
          ob3.giveReview();
           
          System.out.println();
           
          ob3.TrainClasses("Clssic", "Standard");
         
          System.out.println("Train Class or Train Compartment :"+ " " + ob3.TrainClasses("Clssic", "Standard"));
          System.out.println();

          ob3.calcTax();
        
          System.out.println("Calculate the  Tax for the Ticket buying : " + " " + ob3.calcTax()+" "+"Tk.");
          System.out.println();

          ob3.calcTotal();
           
          System.out.println(" Calculate total Cost :  " + " " + ob3.calcTotal()+" "+ "Tk.");
          System.out.println();

          ob3.getFilter();
         
          System.out.println(" Filter the page :" + " " + ob3.getFilter());
          System.out.println();

            Admin ob4 = new Admin();
            ob4.getBookingStatus();
           
          System.out.println("Show the Book Status : " + " " + ob4.getBookingStatus());
          System.out.println();
          
          System.out.println();   
         

            Payment ob5 = new Payment();

            ob5.getPayID();
          
            System.out.println("Payment Id number :" + " " + ob5.getPayID());
            System.out.println();

            ob5.getPayStatus();
          
            System.out.println("Pay Status : " + " " + ob5.getPayStatus());
            System.out.println();

            ob5.getPayType();
        

            System.out.println("Payment Type : " + " " + ob5.getPayType());
            System.out.println();

            ob5.getTotalPayment();
         
            System.out.println("Total payment : " + " " + ob5.getTotalPayment() +" " + "Tk.");
            System.out.println();

            
            
            RailwaySystem R1;
            Response se = new Response();
            se.setId(2020260164);
            System.out.println("Show the response in the Railway System : "+" "+se.getId());
            
            
            Card ob6 = new Card();
            ob6.authorized();
        
            System.out.println("Authorized the card by Admin :" + " " + ob6.authorized()+".");
            System.out.println();
            

            TimetableClass ob7 = new TimetableClass();
            ob7.getCurrentDate();
         
            System.out.println("Show the randomly Current Date" + " " + ob7.getCurrentDate());
            System.out.println();

            ob7.getCurrentTime();
        
            System.out.println("Show the randomly Current Time :" + " " + ob7.getCurrentTime());
            System.out.println();
           
            
           Bikash b2 = new Bikash();
           b2.run();
          
           Thread t2 = new Thread (b2);
            
            t2.start();
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        System.out.println("Successfully...");

    }
}


    
//}
