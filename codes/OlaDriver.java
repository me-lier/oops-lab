class Ola { String starting;
     String destination;
     Ola(String start, String end)
{this.starting = start;
this.destination = end; }
}
class Bike extends Ola {
double price = 5;
Bike(String start, String end, double price)
{
super(start, end); }public void getBikeAttribute(){
    System.out.println(" Starting Point = "+ this.starting); 
    System.out.println(" Destination Point = "+ this.destination); 
    System.out.println(" Cost per km = "+ this.price);
}}
class Auto extends Ola{
double price = 10;
Auto(String start, String end, double price){
super(start, end);
}
public void getAutoAttributes() {
    System.out.println("Starting Point = "+ this.starting); 
    System.out.println("Destination Point = "+ this.destination); 
    System.out.println("Cost per km = "+ this.price);
}}
public class OlaDriver {
public static void main(String[] args) {
Auto a1 = new Auto("Waghodia", "Parul University", 10.0); a1.getAutoAttributes();
Bike b1 = new Bike("Waghodia", "Parul University", 5.0); b1.getBikeAttribute();
} }