
import java.util.Scanner;

public class Flight {
    private int number;
    private String destination;

    public Flight(){};
    public Flight(int number,String destination){
        this.number = number;
        this.destination = destination;
    }
    public void display(){
        if (number < 0 || destination == null){
            System.out.println("ERROR");
        } else{
            System.out.println("Your information Filght is :");
            System.out.println(number+","+destination);
        }
    };

    public int getNumber() {
        return number;
    }

    public String getDestination() {
        return destination;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Input Filght Number :");
            int number = sc.nextInt();
            System.out.println("Input Destination :");
            String des = sc.next();
            Flight flight = new Flight(number,des);
            flight.display();
            System.out.println("========\nExit ?\n1. Yes\nPush any number to star again.");
            int chon = sc.nextInt();
            if (chon == 1){
                System.exit(0);
            }
        }
    }
}
